// To check whether the element is present or not
import java.util.Scanner;
class presentarray
{
public static void main(String args[])
{
System.out.println("Enter the size of an array");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int arr[]=new int[num];
System.out.println("Enter the elements in an array");
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
int key,count=0;
System.out.println("enter the key element");
key=sc.nextInt();
for(int j=0;j<num-1;j++)
{
if(arr[j]==key)
{
count=count+1;
}
}
if(count==0)
{
System.out.println("key element is not present");
}
else
{
System.out.println("key element is present");
}
}
}
