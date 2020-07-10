package MyHomeStudy.MyHomeStudy;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @org.junit.Test
    public void testsquare() {
        int a = 6;
        int b = 2;
        int expected = (short) 2.0;
        int out = (int) SqArea.square(a,b);
        Assert.assertEquals(expected, out);
    }
}