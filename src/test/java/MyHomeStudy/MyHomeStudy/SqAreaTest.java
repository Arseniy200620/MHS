package MyHomeStudy.MyHomeStudy;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @org.junit.Test
    public void testsquare() {
        int expected = 2;
        int out = (int) SqArea.square(6,2);
        Assert.assertEquals(expected, out);
    }
}