
abstract class Felix
{
    abstract void showmessage();
}



public class NewClass extends Felix{
    
    void showmessage()
    {
     System.out.println("This is showmessage method");   
    }

    public static void main(String[] args)
    {
        NewClass n=new NewClass();
        n.showmessage();
    }
}
