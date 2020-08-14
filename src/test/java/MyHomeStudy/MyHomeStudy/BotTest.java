package MyHomeStudy.MyHomeStudy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class BotTest {
    @Test
    public void whenGreetBot() {

        assertThat(
                Bot.answer("Привет, Бот."),
                is("Привет, умник.")

        );
    }
    @Test
    public void whenByeBot() {
        assertThat(
                 Bot.answer("Пока."),
                is("До скорой встречи.")
        );
    }
    @Test
    public void whenUnknownBot() {
        assertThat(
                Bot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}
