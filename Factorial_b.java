import java.util.*;
class Factorial_b
{
public static void main(String args[])
{
int i,temp,n,x;
System.out.println("Enter ur number");
Scanner sc= new Scanner(System.in);
n= sc.nextInt();
x=n;
temp=n;
for(i=0;i<x-1;i++)
{
n=n-1;
temp=temp*n;
}
System.out.println(temp);
}
}
