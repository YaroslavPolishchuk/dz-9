package hw;

public class Man extends Person {

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    @Override
    public void registerPartnership(Person partner) {
        this.partner = partner;
    }
}
