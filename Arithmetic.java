import java.util.*;
class Arithmetic
{
 int a,b,c,addition,subtraction,multiplication,division;
 void get()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of a=");
   a=sc.nextInt();
   System.out.println("Enter the value of b=");
   b=sc.nextInt();
 }
 void Add()
 {
   addition=a+b;
   System.out.println("Addition="+addition);
 }
 void Sub()
 {
   subtraction=a-b;
   System.out.println("Subtraction="+subtraction);
 }
 void mul()
 {
   addition=a*b;
   System.out.println("Multiplication"+multiplication);
 }
 void div()
 {
   division=a+b;
   System.out.println("Division="+division);
 }
public static void main(String ar[])
{
Arithmetic ai=new Arithmetic();
ai.get();
ai.Add();
ai.Sub();
ai.mul();
ai.div();
}
}

