import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringReverseTest {
    static StringReverse reverse;
    @BeforeClass
    public static void setUp(){
        reverse = new StringReverse();
    }
    @Test
    public void stringReverseTest1(){
        String input = "abcdef";
        String output = "fedcba";
        Assert.assertEquals(output, reverse.reverse(input));
    }
    @Test
    public void stringReverseTest2(){
        String input = "racecar";
        String output = "racecar";
        Assert.assertEquals(output, reverse.reverse(input));
    }
}
