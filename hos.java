import java.io.*;
import java.util.*;
class hos
{
public static void main(String args[])
{
int i,j,n,ch,doc,no=1;
int[] priority=new int[100];
float[] p=new float[100],atime=new float[100],ctime=new float[100],wtime=new float[100],tattime=new float[100],x=new float[100],y=new float[100];
float avrwt=0,avrtatt=0;
String[] name=new String[100];
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of Doctors");
doc=sc.nextInt();
System.out.println("Enter the number of Patients");
n=sc.nextInt();
for(i=0;i<n;i++)
{
p[i]=i+1;
System.out.println("Enter the Name of patient");
name[i]=sc.next();
System.out.println("Choose the patient's category: \n 1.Emergency \n 2.Woman \n$
ch=sc.nextInt();
switch(ch)
{
case 1:priority[i]=1;break;
case 2:priority[i]=2;break;
case 3:priority[i]=3;break;
case 4:priority[i]=4;break;
case 5:priority[i]=5;break;
}
System.out.println("Enter arrival time");
atime[i]=sc.nextFloat();
System.out.println("Enter the Consultation time:");
ctime[i]=sc.nextFloat();
if(ctime[i]>30)
{
System.out.println("Time allowed is only between 10 to 30 mins");
}
else if(ctime[i]<10)
{
System.out.println("Time allowed is only between 10 to 30 mins");
}
}
System.out.println("Choose the patient's category: \n 1.Emergency \n 2.Woman \n 3.Children \n 4.Elder \n 5.Youngster");
ch=sc.nextInt();
switch(ch)
{
case 1:priority[i]=1;break;
case 2:priority[i]=2;break;
case 3:priority[i]=3;break;
case 4:priority[i]=4;break;
case 5:priority[i]=5;break;
}
}
System.out.println("Patient\tArrival time\tConsultation time");
for(i=0;i<n;i++)
{
System.out.println(name[i]+"\t"+atime[i]+"\t\t"+ctime[i]);
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(ctime[i]<ctime[j])
{
float temp;
temp=atime[i];
atime[i]=atime[j];
atime[j]=temp;
temp=ctime[i];
ctime[i]=ctime[j];
ctime[j]=temp;
temp=p[i];
p[i]=p[j];
p[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
if(i==0)
{
wtime[0]=0;
}
else
{
wtime[i]=ctime[i-1]+wtime[i-1];
avrwt=avrwt+wtime[i];
}
}
for(i=0;i<n;i++)
{
tattime[i]=ctime[i]+wtime[i];
avrtatt=avrtatt+tattime[i];
}
System.out.println("Patient\tArrival time\tConsultation time\tWaiting time\tTurnAround time");
for(i=0;i<n;i++)
{
System.out.println(name[i]+"\t"+atime[i]+"\t\t"+ctime[i]+"\t\t\t"+wtime[i]+"\t\t\t"+tattime[i]);
}
System.out.println("Average waiting time:"+avrwt/n);
System.out.println("Average turnaround time:"+avrtatt/n);
System.out.println("The amount of time each doctor has to work is "+avrtatt/doc);
}
}
