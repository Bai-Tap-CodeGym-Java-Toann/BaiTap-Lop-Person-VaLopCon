package person;

public class Person {
    private String name;
    private String address;

    public Person(String name, String adress) {
        this.name = name;
        this.address = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    @Override
    public String toString() {
        return "+ name: " + this.name + "\n" +
                "+ address: " + this.address + "\n";
    }
}
