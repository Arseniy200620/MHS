package MyHomeStudy.MyHomeStudy.Womanandman;

import org.junit.Assert;
import org.junit.Test;

public class WeightTest {

    @org.junit.Test
    public void testmanweight() {
        int hi = 187;
        int expected = (short) 100.05;
        int out = (short) Weight.manWeight((short) hi);
        Assert.assertEquals(expected, out);
    }

    @org.junit.Test
    public void womanWeight() {
        int hw = 187;
        int expectedw = (short) 88.55;
        int outw = (short) Weight.womanWeight((short) hw);
        Assert.assertEquals(expectedw, outw);
    }
}