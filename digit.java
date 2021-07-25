import java.util.*;
class digit
{
public static void main(String args[])
{
int x,sum=0,rem,product=1;
System.out.println("Enter number");
Scanner sc= new Scanner(System.in);
x=sc.nextInt();
while(x!=0)
{
rem=x%10;
product=product*rem;
sum=sum+rem;
x=x/10;
}
System.out.println("The difference between product and sum of the digits is :"+(product-sum));
}
}
