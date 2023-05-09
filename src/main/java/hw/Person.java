package hw;

public class Person {
    String firstName;
    String lastName;
    int age;
    Person partner;
    String maiden;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRetired() {
        return getAge() >= 65;
    }

    public void registerPartnership(Person partner) {
        maiden = lastName;
        lastName = partner.lastName;
        this.partner = partner;
    }

    public void deRegisterPartnersip() {
        if (!maiden.isEmpty())
            lastName = maiden;
        partner = null;
    }
    public void getPartnerInfo(){
        if(partner!=null)
            System.out.println(String.format("%s %s \n %s",partner.lastName,partner.firstName,partner.getAge()));
        else
            System.out.println(String.format("%s doesn't has partner",firstName));
    }
}
