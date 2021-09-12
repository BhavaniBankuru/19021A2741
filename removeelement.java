//removing the element and returns the list if present and returns the same list if not present 

import java.util.Scanner;
class removeelement
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of an array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements in an array");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int key;
System.out.println("enter the element u want to remove..");
key=sc.nextInt();
int temp,count=0;
for(int i=0;i<n-1;i++)
{
if(key==arr[i])
{
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
count++;
}
if(key==arr[n-1])
{
count++;
}
}
if(count==0)
{
System.out.println("element is not found and the elements present are");
for(int j=0;j<n;j++)
{
System.out.print(arr[j]+" ");
}
}
else
{
System.out.println("after element removed ..");
for(int j=0;j<n-1;j++)
{
System.out.print(arr[j]+" ");
}
}
}
}


