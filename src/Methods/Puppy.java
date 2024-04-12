package Methods;

public class Puppy {
    int puppyAge;
    public Puppy(String name)
    {
        System.out.println("Name chosen is:"  + name);
    }
    public void setAge(int age)
    {
        puppyAge = age;
    }public int getAge()
    {
        System.out.println("Puppy age is" +puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy mypuppy = new Puppy("tommy");
        mypuppy.setAge(2);
        mypuppy.getAge();
        System.out.println("variable value" +mypuppy.puppyAge);
    }
}
