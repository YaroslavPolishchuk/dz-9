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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean isRetired(){
       return getAge()>=65;
    }
    public void registerPartnership(Person partner ){
        maiden=lastName;
        lastName=partner.lastName;
    }
    public  void deRegisterPartnersip(){
        lastName=maiden;
    }


}
