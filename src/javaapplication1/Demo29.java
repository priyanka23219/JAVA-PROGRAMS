
// hierarchical inheritance
class User1{
    void showinfo()
    {
        System.out.println("this is user class");
    }
}
class Person3 extends User1
{
    void showperson()
    {
        System.out.println("This is person class");
    }
}
class Person4 extends User1
{
    void showperson4()
    {
        System.out.println("This is person4 class");
    }
}
public class Demo29 {
    public static void main(String[] args)
    {
        Person3 p=new Person3();
        p.showinfo();
        Person4 p1=new Person4();
        p1.showperson4();
        p.showperson();
        
        
    }
}
