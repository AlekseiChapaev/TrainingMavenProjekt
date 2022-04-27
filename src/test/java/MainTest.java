import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testAbbr(){
        Assert.assertEquals(Main.getAbbr("Sergey", 3), "Se...");
    }
}
