//initializing the array and printing the sum and average of the elements in an array
import java.util.Scanner;
class averagearray
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int num=sc.nextInt();
System.out.println("Enter the elements in an array");
int a[]=new int[num];
for(int i=0;i<num;i++)
{
a[i]=sc.nextInt();
}
int sum=0;
for(int j=0;j<num;j++)
{
sum=sum+a[j];
}
System.out.println("sum of the elements in an array is" +" "+ sum);
System.out.println("Average of the elements in an array " + " " + (sum/num));
}
}

