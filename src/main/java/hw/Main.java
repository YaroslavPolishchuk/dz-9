package hw;

public class Main {
    public static void printRetire(boolean isRe) {
        if(isRe){
            System.out.println("Ya uge vsjo, na pensii)");
        }
        else {
            System.out.println("I am like a horse");
        }

    }

    public static void main(String[] args) {
        Woman lesya = new Woman("Lesya", "Lesina", 38);
        Woman zina = new Woman("Zina", "Z", 61);

        printRetire(lesya.isRetired());
        printRetire(zina.isRetired());

        Man vitya = new Man("Vitya","Tsoi",39);
        Man vanya = new Man("Vanya","Garbuz",63);

        System.out.println(vitya.getLastName());
        System.out.println(lesya.getLastName());
        lesya.registerPartnership(vitya);
        vitya.registerPartnership(lesya);
        System.out.println(lesya.getLastName());
        System.out.println(vitya.getLastName());

        vitya.getPartnerInfo();

        lesya.deRegisterPartnersip();
        System.out.println(lesya.getLastName());
        lesya.getPartnerInfo();


        printRetire(vanya.isRetired());

    }

}
