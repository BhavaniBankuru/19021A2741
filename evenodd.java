import java.util.*;
class evenodd
{
public static void main(String args[])
{
int n,rem,rem1,count=0,count1=0;
System.out.println("Enter any number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a=n;
while(n>0)
{
rem=n%10;
if(rem%2==0)
{
count+=1;
System.out.print( rem+" ");
}
n=n/10;
}
System.out.println("no of even digits ---->"+count);
while(a>0)
{
rem1=a%10;
if(rem1%2==1)
{
count1+=1;
System.out.print( rem1+" ");
}
a=a/10;
}
System.out.println("no of odd digits ---->"+count1);
}
}

