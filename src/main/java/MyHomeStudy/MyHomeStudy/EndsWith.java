package MyHomeStudy.MyHomeStudy;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int delta = word.length - post.length;
        for (int index = post.length - 1; index > -1; index--) {
            if (word[delta+index] != post[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
