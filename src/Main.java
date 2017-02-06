import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sergey on 06.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        StringBuilder text1 = new StringBuilder("Привет   пока давай    досвидос     дружище    ...");
        StringBuilder text2 = new StringBuilder("Привет   пока давай    досвидос     дружище    ...");
        StringBuilder text3 = new StringBuilder("Привет   пока давай    досвидос     дружище    ...");
        StringBuilder text4 = new StringBuilder("Привет   пока давай    досвидос     дружище    ...");
        for (int i = 0; i < 14; i++) {
            text1.append(text1);
            text2.append(text2);
            text3.append(text3);
            text4.append(text4);
        }
        long startTime3 = System.currentTimeMillis();
        regMethodRemoveSpaces(text3.toString());
        long regexSpeed = speed(startTime3);
        System.out.println("Regexp method speed " + regexSpeed);
        System.out.println();

        long startTime4 = System.currentTimeMillis();
        myScannerMethodRemoveSpaces(text4.toString());
        System.out.println("myScannerMethod method speed " + speed(startTime4));
        System.out.println("Regexp method быстрее чем myScannerMethod method в " + speedToRegexp(speed(startTime4), regexSpeed) + " раза");


        long startTime1 = System.currentTimeMillis();
        removeWhiteSpaces(text1.toString());
        System.out.println("Victor method speed " + speed(startTime1));
        System.out.println("Regexp method быстрее чем Victor method в " + speedToRegexp(speed(startTime1), regexSpeed) + " раза");
        System.out.println();

        long startTime2 = System.currentTimeMillis();
        removeSpaces(text2.toString());
        System.out.println("while method speed " + speed(startTime2));
        System.out.println("Regexp method быстрее чем while method в " + speedToRegexp(speed(startTime2), regexSpeed) + " раза");
        System.out.println();

    }

    private static String removeWhiteSpaces(String string) {
        StringBuilder str = new StringBuilder(string);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                while (++i < str.length() && str.charAt(i) == ' ') {
                    str.deleteCharAt(i--);
                }
            }
        }
        return str.toString();
    }

    private static String removeSpaces(String text){
        while (text.contains("  "))
        {
            text = text.replace("  ", " ");
        }
        return text;
    }

    private static String regMethodRemoveSpaces(String text){

        text = text.replaceAll("  *", " ");
        return text;
    }

    private static String myScannerMethodRemoveSpaces(String text){
        Scanner scanner = new Scanner(text);
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNext())
        {
            list.add(scanner.next() + " ");
        }
        StringBuilder builder = new StringBuilder();
        for(String str: list)
        {
            builder.append(str);
        }
        return builder.toString();
    }


    private static long speed(long startTime)
    {
        return (System.currentTimeMillis() - startTime);
    }

    private static double speedToRegexp(long speed, long regexpSpeed)
    {
        return (((double) speed/regexpSpeed));
    }

}
