import java.util.Scanner;
class starpattern
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the maximum number of stars");
int n = sc.nextInt();
for(int i=n;i>0;i--)
{
for(int j=i;j<n+1;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}