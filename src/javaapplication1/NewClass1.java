
abstract class Bank
{
    abstract int getIntrest();
}
class SBI extends Bank
{
    int getIntrest()
    {
        return 7;
    }
}
class PNB extends Bank
{
    int getIntrest()
    {
        return 8;
    }
}
public class NewClass1 {
    public static void main(String args[])
    {
        PNB p=new PNB();
        int interest = p.getIntrest();
                System.out.println("Rate of Intrest is:"+interest);
        SBI s=new SBI();
        int interest1 = s.getIntrest();
        System.out.println("Rate of intrest is:"+interest1);
    }
}
