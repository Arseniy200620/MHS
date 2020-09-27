package MyHomeStudy.MyHomeStudy;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
    public class MilliMaxTest {
        @Test
        public void whenSecondMax() {
            int result = MilitiMax.max(1, 4, 2);
            assertThat(result, is(4));
        }
    }

