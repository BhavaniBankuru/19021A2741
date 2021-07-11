import java.util.*;
class prime_number
{
public static void main(String args[])
{
int num,count=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number : ");
num=sc.nextInt();
for(int i=2;i<num;i++)
{
if(num%i==0)
{
count++;
break;
}
}
if(count==1)
{
System.out.println("Not a prime number");
}
else
{
System.out.println("Prime number");
}
}
}