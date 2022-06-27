import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraySumTest {
    static ArraySum sum;
    @BeforeClass
    public static void setUp(){
        sum = new ArraySum();
    }
    @Test
    public void arraySumTest1(){
        int[] input = {0,1,2,3,4};
        int expected = 10;
        Assert.assertEquals(expected, sum.getSum(input));
    }
}
