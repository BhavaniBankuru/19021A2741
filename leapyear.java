import java.util.Scanner;
class Leapyear
{
public static void main(String args[])
{
int year;
System.out.println("enter any year");
Scanner sc = new Scanner(System.in);
year = sc.nextInt();
if(year%100==0)
{
System.out.println("century"); //if this century divisible with 400 then leap otherwise not a leap year
if(year%400==0)
{
System.out.println("year is a leap year");
}
else
{
System.out.println("year is not a leap year");
}
}
else 
if(year%4==0)
{
System.out.println("year is a leap year");
}
else
{
System.out.println("year is not a leap year");
}
}
}