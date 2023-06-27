package PersonTest;

import hw.Man;
import hw.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(priority = 1)
public class WomanTest {
    Man man;
    Woman woman2;
    Woman woman;
    @BeforeClass
    public void init(){
        man = new Man("Test1", "Last1", 30);
        woman2=new Woman("Test3", "Last3", 68);
        woman = new Woman("Test2", "Last2", 35);
    }
    @Test(priority = 0,description = "The best test ever")
    public void testRegisterPartnership(){
        woman.registerPartnership(man);
        Assert.assertEquals(woman.getPartner(),man);
        Assert.assertEquals(woman.getLastName(),man.getLastName());
    }
    @Test
    public void testDeRegisterPartnership(){
        boolean toMaiden=false;
        woman.deRegisterPartnership(toMaiden);
        Assert.assertNull(woman.getPartner());
        Assert.assertEquals(woman.getLastName(),man.getLastName());
    }
    @Test
    public void testIsRetired(){
        Assert.assertFalse(woman.isRetired());
        Assert.assertTrue(woman2.isRetired());
    }
}
