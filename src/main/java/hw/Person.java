package hw;

public class Person {
    String firstName;
    String lastName;
    int age;
    Person partner;
    String maiden;

    public String getMaiden() {
        return maiden;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
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
        partner.partner=this;
    }

    public void deRegisterPartnership() {
        if (partner != null) {
            partner.partner=null;
            partner = null;
        }
    }
    public void getPartnerInfo(){
        if(partner!=null)
            System.out.println(String.format("%s %s \n %s",partner.lastName,partner.firstName,partner.getAge()));
        else
            System.out.println(String.format("%s doesn't has partner",firstName));
    }
}
