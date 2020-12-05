import java.util.Scanner;		// Declear a java library for input

public class optrs2
{
 public static void main(String args[])
 {
  int c = 25;
  int d = 25;
 
 Scanner input = new Scanner(System.in);		// create a object "name"  for taking a input


System.out.println("\n\n\n\n");
System.out.println("[][][][]     [][][]    [][][][]       [][]      [][]      [][]                                           ");
System.out.println("[]     []    []    []  []            []  []     [] []    [] []                                           ");
System.out.println("[]      []   []    []  []           []    []    []  []  []  []                                           ");
System.out.println("[]       []  [][][]    [][][][]    []      []   []   [][]   []                                           ");
System.out.println("[]       []  [][]      [][][][]   [][][][][][]  []          []                                           ");
System.out.println("[]      []   [] []     []         []        []  []          []                                           ");
System.out.println("[]     []    []  []    []         []        []  []          []                                           ");
System.out.println("[][][][]     []   []   [][][][]   []        []  []          [] .............. Author- Yashraj J Mahajan  ");



  System.out.println("enter the values a and b => \n");
  int a = input.nextInt();	//input value of a
  int b = input.nextInt();	//input value of b
  System.out.println("a+b = " +(a+b));// addition
  System.out.println("a-b = " +(a-b));// substraction
  System.out.println("a*b = " +(a*b));// multiplication
  System.out.println("a/b = " +(a/b));// divid
  System.out.println("a%b = " +(a%b));// mod
  //System.out.println("a%c = " +(a%c));// mod
  System.out.println("a++ = " +(a++));// post increament
  System.out.println("a-- = " +(a--));// post decreament
 }
}
