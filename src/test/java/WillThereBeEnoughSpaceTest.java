import org.testng.Assert;
import org.testng.annotations.Test;

public class WillThereBeEnoughSpaceTest {

    @Test
    public void testCheckPassengers(){
        Assert.assertEquals(WillThereBeEnoughSpace.enough(50, 20, 70), 40);
    }

    @Test
    public void testCheckPassengers2(){
        Assert.assertEquals(WillThereBeEnoughSpace.enough(50, 50, 70), 70);
    }

    @Test
    public void testCheckPassengers3(){
        Assert.assertEquals(WillThereBeEnoughSpace.enough(50, 0, 50), 0);
    }
}