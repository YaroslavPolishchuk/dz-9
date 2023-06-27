package utils;

import com.opencsv.bean.CsvToBeanBuilder;
import models.TestPersonModel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {
    static  final  String PATH="src\\test\\resources\\data.csv";
    public static List<TestPersonModel> getTestData(){
        try {
            var reader= Files.newBufferedReader(Paths.get(PATH));
            var objectBuilder = new CsvToBeanBuilder<TestPersonModel>(reader)
                    .withType(TestPersonModel.class)
                    .build();
            return objectBuilder.parse();
        }catch (IOException ex){
            throw new RuntimeException("Sho to ne tak!"+PATH+ex);
        }

    }
}
