import java.util.Scanner;
class Din_edit
{

public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("ENTER THE VALUE OF A");
int a=sc.nextInt();
System.out.print("ENTER THE VALUE OF B");
int b=sc.nextInt();
int c=(a*a+(2*a*b)+b*b); 
System.out.println("The square of addtion of two numbers "+ a+" and "+b+" is "+c);
System.out.print(c);
}
}
