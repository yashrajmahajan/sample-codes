public class MISoptr
{
 public static void main(String args[])
 {
  int a=10,b;

  b = (a == 1) ? 20:30 ;
  System.out.println("value of b is " + b); //value of b is 30

  b = (a == 10) ? 20:30 ;
  System.out.println("value of b is " + b); //value of b is 20
 }
}
