package auditorium.utils;


import javax.swing.*;

public class StringUtil {

    public static void main(String[] args) {

        System.out.println(calculateCount("kuku", 'u'));

        System.out.println(subString("hello world", 1, 7));

        System.out.println("trim '   text '|" + trim("   text ") + "|");
        System.out.println("trim 'text '   |" + trim("text ") + "|");
        System.out.println("trim 'te xt'   |" + trim("te xt") + "|");
        System.out.println("trim '   '     |" + trim("   ") + "|");
        System.out.println("trim ''        |" + trim("") + "|");


        System.out.println("------------------");

        String[] array = split("      He llo Ja v a          7");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("------------------" + array.length);

    }

    public static int parsInt(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                JOptionPane.showMessageDialog(null,
                        "Failed to parse string to int: '" + str + '\'');
                return Integer.MIN_VALUE;
            }
            res = res * 10 + ch - '0';
        }
        return res;
    }


    public static String[] split(String text) {
        String[] wordList = new String[text.length() / 2];
        int count = 0;
        int index = 0;
        int length = text.length();

        String res = "";

        while (index < length) {
            while (index < length && text.charAt(index) == ' ') {
                index++;
            }

            while (index < length && text.charAt(index) != ' ') {
                res += text.charAt(index);
                index++;
            }
            if (!res.isEmpty()) {
                wordList[count++] = res;
                res = "";
            }
        }

        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = wordList[i];
        }

        return result;
    }


    public static String trim(String text) {

        int start = 0;
        int end = text.length() - 1;
        int length = text.length();

        while (start < length && text.charAt(start) == ' ') {
            start++;
        }

        while (end > start && text.charAt(end) == ' ') {
            end--;
        }

        return subString(text, start, end + 1);
    }

    public static String subString(String text, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += text.charAt(i);
        }
        return res;
    }

    public static int calculateCount(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static String  toLowerCase(String text){
        if(text == null || text.isEmpty()){
            return text;
        }
        return changeCase(text, 'A', 'Z');
    }

    public static String  toUpperCase(String text){
        if(text == null || text.isEmpty()){
            return text;
        }
        return changeCase(text, 'a', 'z');
    }

    private static String changeCase(String text, char startRange, char endRange) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= startRange && ch <= endRange) {
                ch = (char) (ch ^ 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

}
