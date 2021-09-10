// if the element is present print the index or -1 
import java.util.Scanner;
class array_4
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
int key,count=0,index,j;
System.out.println("enter the key element");
key=sc.nextInt();
for(j=0;j<=num-1;j++)    //1 2 3 4 
{                        //j 0 1 2 3 
if(arr[j]==key)
{
count=count+1;
}
if(count==1)
{
break;
}
}
if(count==1)
System.out.println(j);
if(count==0)
{
System.out.println(-1);
}
}
}
