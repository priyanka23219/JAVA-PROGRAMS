
//MULTILEVEL INHERITANCE
class User{
    void showUser()
    {
        System.out.println("This is user class");
    }
}
class Info extends User
{
    void showInfo()
    {
        System.out.println("This is Info class");
    }
}
class Person2 extends Info
{
    void PersonInfo()
    {
        System.out.println("This is Person class");
    }
}
public class Demo28 {
public static void main(String[] args)
{
  Person2 i=new Person2();
i.showUser();
i.showInfo();
i.PersonInfo();
}
}
