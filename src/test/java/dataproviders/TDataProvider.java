package dataproviders;

import models.TestPersonModel;
import org.testng.annotations.DataProvider;
import utils.JsonReader;

import java.util.List;

public class TDataProvider {
    @DataProvider(name = "man")
    public static Object[][] createData() {
        var path=System.getProperty("user.dir");
        path=path+"\\src\\test\\resources\\data.json";
        var data=new JsonReader<TestPersonModel>().read(path,TestPersonModel.class);
        /*var res=data.stream().map(x->new Object[]{x.getFirstName(),x.getLastName(),x.getAge()})
                .toArray(Object[][]::new);*/

        return new Object[][]{{data}};
        /*Object[][] objects= new Object[data.size()][3];
        for(int i=0;i<data.size();i++){
            objects[i][0]=data.get(i).getFirstName();
            objects[i][1]=data.get(i).getLastName();
            objects[i][2]=data.get(i).getAge();
        }*/
    }
}
