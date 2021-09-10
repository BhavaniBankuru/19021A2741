import java.util.Scanner;
class minarray
{
public static void main(String args[])
{
System.out.println("Enter the size in an array");
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.println("Enter the elements in an array");
int arr[]=new int[num];
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
int min;
for(int j=0;j<num-1;j++)
{
if(arr[j]<arr[j+1])
{
arr[j+1]=arr[j];
}
}
System.out.println("Minimum element in an array is"+" " +arr[num-1]);
}
} 