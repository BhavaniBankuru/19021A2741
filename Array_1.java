//taking array elements as input and printing those elements

import java.util.*;
class Array_1
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
System.out.println("The elements in the array are.....");
for(int i=0;i<num;i++)
{
System.out.println(arr[i]);
}
}
}