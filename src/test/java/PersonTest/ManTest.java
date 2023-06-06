package PersonTest;

import hw.Man;
import hw.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(priority = 5)
public class ManTest {
    Man man;
    Man man2;
    Woman woman;
    @BeforeClass
    public void init(){
        man = new Man("Test1", "Last1", 30);
        man2=new Man("Test2", "Last2", 68);
        woman = new Woman("Test2", "Last2", 35);
    }
    @Test
    public void testRegisterPartnership(){
        man.registerPartnership(woman);
        Assert.assertEquals(man.getPartner(),woman);
    }
    @Test
    public void testDeRegisterPartnership(){
        man.deRegisterPartnership();
        Assert.assertNull(man.getPartner());
    }
    @Test
    public void testIsRetired(){
        Assert.assertTrue(man2.isRetired());
        Assert.assertTrue(!man.isRetired());
    }
}
