package MyHomeStudy.MyHomeStudy;

public class Bot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            /* заменить ... на правильный ответ rsl = "ответ по заданию". */
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            /* заменить ... на правильный ответ rsl = "ответ по заданию". */
            rsl = "До скорой встречи.";
        } else {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rsl;
    }
    public static void main(String[] args) {
        String rsl = Bot.answer("Привет, Бот");
        System.out.println(rsl);
        rsl = Bot.answer("Пока.");
        System.out.println(rsl);
    }
}