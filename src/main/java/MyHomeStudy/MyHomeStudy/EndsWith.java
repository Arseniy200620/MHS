package MyHomeStudy.MyHomeStudy;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;

        for (int index = post.length - 1; index > -1; index--) {
            int indexmin = index + (word.length - post.length);
            if (word[indexmin] != post[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
