import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
int num,sum=0,temp,r;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
num=sc.nextInt();
temp=num;
while(num>0)
{
r=num%10;
sum=(sum*10)+r;
num=num/10;
}
System.out.println("Reverse of the given number is :" + sum);
}
}