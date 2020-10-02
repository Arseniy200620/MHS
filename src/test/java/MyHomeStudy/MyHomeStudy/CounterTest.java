package MyHomeStudy.MyHomeStudy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    public void eight() {
            int rsla = Counter.sum(3, 8);
            int expecteda = 18;
            assertThat(rsla, is(expecteda));
    }
}
