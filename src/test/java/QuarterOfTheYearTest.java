import org.testng.Assert;
import org.testng.annotations.Test;

public class QuarterOfTheYearTest {

    @Test
    public void testCheckFirstQuarter(){
        Assert.assertEquals(QuarterOfTheYear.quarterOf(3), "first quarter");
    }

    @Test
    public void testCheckThirdQuarter(){
        Assert.assertEquals(QuarterOfTheYear.quarterOf(5), "second quarter");
    }

    @Test
    public void testCheckSecondQuarter(){
        Assert.assertEquals(QuarterOfTheYear.quarterOf(8), "third quarter");
    }

    @Test
    public void testCheckFourQuarter(){
        Assert.assertEquals(QuarterOfTheYear.quarterOf(11), "four quarter");
    }
}