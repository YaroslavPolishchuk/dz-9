package utils;
import models.TestPersonModel;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonReader<T> {
    ObjectMapper mapper = new ObjectMapper();
    List<T> testData;
    public List<T> read(String path,Class<T> targetType){
        testData=new ArrayList<>();
        try {
            JavaType type=mapper.getTypeFactory().constructCollectionType(List.class,targetType);
            testData = mapper.readValue(new File(path),type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return testData;
    }
}
