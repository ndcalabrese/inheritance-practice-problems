package person_and_subclasses;

public class Student extends Person {

    int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits += 1;
    }

    @Override
    public String toString() {
        return name + "\n\t" + address + "\n\t" + "Study credits " + credits;
    }

}
