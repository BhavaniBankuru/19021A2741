//To print even numbers and odd numbers in an element
import java.util.*;
class Array_2
{
public static void main(String args[])
{
int num;
System.out.println("Enter the number of elements in array");
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
System.out.println("Enter the elements in array");
int arr[]=new int[num];
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
int count=0;
System.out.println("Even numbers in the given array are..");
for(int i=0;i<num;i++)
{
if(arr[i]%2==0)
{
System.out.println(arr[i]);
count++;
}
}
System.out.println("Number of even elements in an array are" + " " +count);
if(count==0)
{
System.out.println("no elements in the given array is even");
}
int count1=0;
System.out.println("odd numbers in the given array are..");
for(int i=0;i<num;i++)
{
if(arr[i]%2!=0)
{
System.out.println(arr[i]);
count1++;
}
}
System.out.println("Number of odd elements are " + " " + count1);
if(count1==0)
{
System.out.println("no elements in the array are odd");
}
}
}