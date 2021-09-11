//Binary search
import java.util.*;
class binaryarray
{
public static void main(String args[])
{
System.out.println("Enter the size of an array");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements in an array");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();           
}
System.out.println("Enter the element u have to search for?");
int key=sc.nextInt();
int mid,low=0,high=n-1,flag=0;
mid=(low+high)/2;
while(low<=high)
{
if(key>arr[mid])
{
low=mid+1;
}
else if(key<arr[mid])
{
high=mid-1;
}
else if(key==arr[mid])
{
flag++;
break;
}
mid=(low+high)/2;
}
if(flag==1)
System.out.println("Key element is present at index"+" "+mid);
else
System.out.println("Key element is not found");
}
}







