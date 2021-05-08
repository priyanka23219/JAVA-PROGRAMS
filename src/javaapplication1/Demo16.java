import java.util.Scanner; 
class Demo16 {
   public static void main(String args[])
   {
       int num;
       System.out.println("Enter a number: " );
      
       Scanner s=new Scanner(System.in);
      num=s.nextInt();
      if(num%2==0)
      {
      System.out.println("Given number is even");
      }
      else
      {
          System.out.println("Given number is odd");
      }
      }
   }

