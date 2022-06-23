import java.util.*;
class matrix
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter num of rows");
int m = sc.nextInt();
System.out.println("enter num of columns");
int n = sc.nextInt();
int arr[][]=new int[m][n]; 
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("enter entries row wise");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}
