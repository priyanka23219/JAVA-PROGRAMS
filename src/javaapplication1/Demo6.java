import java.util.Scanner;
class Demo6 {
public static void main(String args[]) {
String a;
System.out.println("Enter String value : ");
Scanner s = new Scanner(System.in); // create object
a = s.nextLine(); // Take integer input and assign to variable
System.out.println("You entered " + a);
}
}