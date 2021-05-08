
import java.util.Scanner;
class demo10 {
    public static void main(String[] args)
    {
        System.out.println("Enter marks");
        int marks;
        Scanner s=new Scanner(System.in);
        marks=s.nextInt();
        if (marks==10)
        {
            System.out.println("marks is 10 ");
        }
        else if(marks==20)
        {
            System.out.println("marks is 20");
        }
        else if(marks==30)
        {
            System.out.println("marks is 30");
        }
        else
        {
            System.out.println("no match");
        }
    }
}
