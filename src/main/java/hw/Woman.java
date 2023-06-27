package hw;

public class Woman extends Person{
    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    public Woman() {
        super();
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }
    public void deRegisterPartnership(boolean toMaiden) {
        if (partner != null) {
            if(toMaiden){
                lastName = maiden;
            }
            partner.partner=null;
            partner = null;
        }
    }
}
