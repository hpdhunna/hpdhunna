

public class Student {
    String name;
    public Student (String s)
    {
        name = s;
    }
public Student()
{
    name = "Unknown";

}
}



public void main(String[] args) {

    Student s = new Student("Reet");
    Student a = new Student ();
    System.out.println(s.name);
    System.out.println(a.name);

}

