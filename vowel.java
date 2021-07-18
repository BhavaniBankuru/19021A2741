//
import java.util.*;
class vowel
{
public static void main(String args[])
{
char alphabet;
System.out.print("Enter any alphabet");
Scanner sc= new Scanner(System.in);
alphabet=sc.next().charAt(0);
switch(alphabet)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
        System.out.println("It is a vowel");
        break;
default: System.out.println("it is consonant");
}
}
}


