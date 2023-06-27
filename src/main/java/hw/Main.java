package hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

        lesya.deRegisterPartnership(true);
        System.out.println(lesya.getLastName());
        lesya.getPartnerInfo();
        printRetire(vanya.isRetired());
        //Path path = Path.get(String.format("C:\\Users\\Yaroslav\\Documents\\Code practice\\robot_dreams\\Java\\hw-9\\ws9\\src\\main\\resources"));

        /*var path=System.getProperty("user.dir");

        path=path+"\\src\\main\\resources\\newfile.json";

        try {
            Files.createFile(Paths.get(path));
        }
        catch (IOException e){
            throw  new RuntimeException("Sho tam takoe");
        }

        Reader reader = new FileReader(path);


        try(BufferedReader bufferedReader = new BufferedReader(reader)){

        }
        catch (Exception e){

        }*/
    }

}
