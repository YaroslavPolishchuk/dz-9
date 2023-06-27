package PersonTest;

import hw.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ManGettersSettersTest {
    private Man testMan;
    @BeforeTest
    public void init(){
        testMan=new Man();
    }
    @Parameters({"firstName","lastName","age"})
    @Test
    public void testGettersAnsSetters(String firstName,String lastName,int age) {
        testMan.setFirstName(firstName);
        testMan.setLastName(lastName);
        testMan.setAge(age);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(testMan.getFirstName(), "TestName","Hey, how did you call me");
        softAssert.assertEquals(testMan.getLastName(), "TestSurname");
        softAssert.assertEquals(testMan.getAge(), 32);
        softAssert.assertAll();


    }
}
