package PersonTest;

import dataproviders.TDataProvider;
import hw.Man;
import hw.Person;
import hw.Woman;
import models.TestPersonModel;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

@Test(priority = 5)
public class ManTest {
    Man man;
    Man man2;
    Woman woman;


    @Test(dataProvider = "man",dataProviderClass = TDataProvider.class,priority = 0)
    public void init(List<TestPersonModel> testData){
        man = new Man();
        man2=new Man();
        woman = new Woman();
        List<Person> listTmp=new ArrayList<>();
        listTmp.add(man);
        listTmp.add(man2);
        listTmp.add(woman);
        for (int i = 0; i < testData.size(); i++) {
            listTmp.get(i).setFirstName(testData.get(i).getFirstName());
            listTmp.get(i).setLastName(testData.get(i).getLastName());
            listTmp.get(i).setAge(testData.get(i).getAge());
        }
    }
    @Test
    public void testRegisterPartnership(){
        man.registerPartnership(woman);
        Assert.assertEquals(man.getPartner(),woman);
    }
    @Test
    public void testDeRegisterPartnership(){
        man.registerPartnership(woman);
        man.deRegisterPartnership();
        Assert.assertNull(man.getPartner());
    }
    @Test
    public void testIsRetired(){
        Assert.assertTrue(man2.isRetired());
        Assert.assertFalse(man.isRetired());
    }


}
