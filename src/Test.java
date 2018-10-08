import person.Person;
import person.Staff;
import person.Student;

public class Test {
    public static void main(String[] args) {
        Person toan = new Person("toan","somewhere");
        System.out.println(toan.toString());
        System.out.println(toan.getName()+" di học");
        toan = new Student("toan","some where","codegym",100,20000);
        System.out.println(toan.toString());
        System.out.println(toan.getName()+" di làm");
        toan = new Staff("toan","some where","some school",20000);
        System.out.println(toan.toString());

    }
}
