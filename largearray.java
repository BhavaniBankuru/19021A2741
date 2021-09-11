//To sort the elements in an array and find the largest and smallest two elements in an array

import java.util.*;
class largearray
{
public static void main(String args[])
{
System.out.println("Enter the size of an array");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[]=new int[n];
int h=n;
System.out.println("Enter the elements in an array");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();           //4 5 3 2 6       5,6 3,2
}
int temp;
while(n>=0)
{
for(int j=0;j<n-1;j++)         //4 3 2 5 6   // Arrays.sort(a);  //2 3 4 5 6
{
if(arr[j]>arr[j+1])
{
temp=arr[j+1];
arr[j+1]=arr[j];
arr[j]=temp;
}
}
n--;
}
System.out.println("elements after sorted are....");
for(int k=0;k<h;k++)
{
System.out.print(arr[k]+" ");
}
System.out.println();
System.out.println("The largest two numbers are .." + arr[h-1] +" " +arr[h-2]);
System.out.println("The smallest two numbers are .."+arr[0]+" " +arr[1]);
}
}
