class Student
{
    Student()
    {
        System.out.println("This is Students list");
    }
    Student(String name,int age)
    {
        System.out.println("student name is "+name+ " Student age is "+age);
                
    }
}

class Demo25 {
    public static void main(String args[])
    {
        Student s=new Student();
        Student s1=new Student("priyanka", 25);
    }
}
