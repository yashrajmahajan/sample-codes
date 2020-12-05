class freshjuice
 {

  enum freshjuicesize{SMALL, MEDIUM, LARGE}
  freshjuicesize size;

 }

public class java002
 {

   public static void main(String[] args)
{
 freshjuice juice = new freshjuice();
 juice.size = freshjuice.freshjuicesize.MEDIUM;
 System.out.println("Size:"+ juice.size);
}
}
