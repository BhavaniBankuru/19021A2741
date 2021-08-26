//To print max element in array
import java.util.Scanner;
class Array_3
{
public static void main(String args[])
{
int num;
System.out.println("Enter the number of elements in an array");
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
int a[]=new int[num];
System.out.println("enter the elements in an array");
for(int i=0;i<num;i++)  //5
{
a[i]=sc.nextInt();   // 1 2 3 4 5
}
int max=0;
for(int i=0;i<num-1;i++) 
{ 
if(a[max]>a[i+1]) 
{
a[i+1]=a[max];                    
}
else
{
max=max+1;
}
}
System.out.println("Maximum number in an array is " + " " +a[num-1]);
}
}

  