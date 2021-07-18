// print odd numbers between given range in reverse order 
// 20-30, output = 29 27 25 23 21


import java.util.*;
class oddreverseorder
{
public static void main(String args[])
{
int i,x,y,n;
System.out.println("x" + "=" );
Scanner sc= new Scanner(System.in);
x=sc.nextInt();
System.out.println("y" + "=" );
y=sc.nextInt();
for(i=y-1;i>x;i--)
{
if(i%2!=0)
{
System.out.print(i + " ");
}
}
}
}
