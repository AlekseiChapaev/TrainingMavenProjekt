import org.testng.Assert;
import org.testng.annotations.Test;

public class GradeBookTest {

    @Test
    public void testGradeBook1(){
        Assert.assertEquals(GradeBook.getGrade(54, 60, 85), 'D');
    }

    @Test
    public void testGradeBook2(){
        Assert.assertEquals(GradeBook.getGrade(99, 95, 90), 'A');
    }

    @Test
    public void testGradeBook3(){
        Assert.assertEquals(GradeBook.getGrade(78, 75, 70), 'C');
    }

    @Test
    public void testGradeBook4(){
        Assert.assertEquals(GradeBook.getGrade(54, 0, 20), 'F');
    }

    @Test
    public void testGradeBookNegative(){
        Assert.assertEquals(GradeBook.getGrade(544, 95, 80), '0');
    }
}
