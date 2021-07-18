import java.util.*;
class fibanocci
{
public static void main(String args[])    //0 1 1 2 3 5 8
{
int i,n,x=0,y=1,z;
System.out.println("Enter your number ");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
System.out.print(x + " " + y); 
for(i=0;i<n;i++)
{
z=x+y;
if(n>z )
{
x=y;
y=z;
System.out.print(" " + z);
}
else
break;
}
}
}
