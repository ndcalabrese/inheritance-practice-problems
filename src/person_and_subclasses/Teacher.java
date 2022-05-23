package person_and_subclasses;

public class Teacher extends Person {

    int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "\n\t" + address + "\n\t" + "Salary " + salary + " euro/month";
    }

}
