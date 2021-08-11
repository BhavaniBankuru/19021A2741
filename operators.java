class operators
{
public static void main(String args[])
{
int x=10;
int y=5;
int z=20;
System.out.println(x++>y | z>x++); //bitwise or
System.out.println(x);
System.out.println(x++>y || z>x++); //logical or
System.out.println(x);
System.out.println(x++>y & z>x++);  //bitwise and
System.out.println(x);
System.out.println(x++>y && z>x++);  //logical and
System.out.println(x);
}
}   
/* difference between logical and bitwise
  in logical second condition is not checked if first condition is sufficient
  whereas in bitwise both conditions are checked no matter 1st condition sufficient or not */