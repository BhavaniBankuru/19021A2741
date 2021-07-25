import java.lang.Math;
class random
{
public static void main(String args[])
{
int max=600;
int min=400;
int b=(int)(Math.random()*(max-min+1)+min);
System.out.println("Random numbers between " + max +" "+ "and"+" " + min + " is:" + b);
}
}
