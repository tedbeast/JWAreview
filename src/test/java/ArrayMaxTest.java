import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayMaxTest {
    static ArrayMax max;
//    some amount of annotations in junit that relate themselves to our test suite
//    for instance, run some method before or after every test (before, after),
//    run some method before any test is started (beforeClass)
//    run some method after all tests (afterClass)
    @BeforeClass
    public static void setUp(){
        max = new ArrayMax();
    }
//    the test annotation
//    the junit test runner will run this test
    @Test
    public void arrayMaxTest1 (){
        int[] input = {0, 1, 2, 3, 4};
        int expected = 4;
//        assertions are a part of junit : if all assertions of a test pass, then the test passes.
//        if any fail, the test fails.
//        eg: a test verifies that a method returns a value that we may expect from it.
//        a test might verify that an exception is or is not thrown
//        a test may verify if an object is null
//        etc
        Assert.assertEquals(expected, max.getMax(input));
    }
    @Test
    public void arrayMaxTest2 (){
        int[] input = {1, 1, 1, 1};
        int expected = 1;
        Assert.assertEquals(expected, max.getMax(input));
    }
}
