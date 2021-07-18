// print all prime numbers between given range in reverse order 
// 20-30, output = 29 23 

import java.util.*;
class primeorder
{
public static void main(String args[])
{
int i,x,y,n,j,count=0;
System.out.println("x" + "=" );
Scanner sc= new Scanner(System.in);
x=sc.nextInt();
System.out.println("y" + "=" );
y=sc.nextInt();
for(i=y-1;i>x;i--)
{
for(j=1;j<y;j++)
{
if(i%j==0)
count+=1;
}
if(count==2)
System.out.print(i+" ");
count=0;
}
}
}

