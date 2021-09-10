// initializing integer array with ascii values and print the corresponding characters 
import java.util.Scanner;
class array_5
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
arr[i]=sc.nextInt();         //65 66 67
}                             // A B C
for(int j=0;j<num;j++)
{
System.out.print((char)arr[j]+" ");
}
}
}