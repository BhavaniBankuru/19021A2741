import java.util.*;
class tables
{
public static void main(String args[])
{
int n,x=12,i,y;
System.out.println("Enter ur number");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=x;i++)
{
y=n*i;
System.out.println(n + "x" + i + "=" +  y  );
}
}
}