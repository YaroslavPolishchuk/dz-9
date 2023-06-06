package PersonTest;

import hw.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManGettersSettersTest {
    private Man testMan;
    @BeforeTest
    public void init(){
        testMan=new Man();
    }
    @Test
    public void testGettersAnsSetters() {
        testMan.setFirstName("TestName");
        testMan.setLastName("TestSurname");
        testMan.setAge(32);

        Assert.assertEquals(testMan.getAge(), "TestName","Hey, how did you call me");
        Assert.assertEquals(testMan.getLastName(), "TestSurname");
        Assert.assertEquals(testMan.getAge(), "TestName");


    }
}
