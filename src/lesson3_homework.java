import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.time.LocalDate;
import java.util.Arrays;

public class lesson3_homework {

    public static void main(String[] args) {
       // System.out.println(Arrays.toString(numbersOfFibanachy(20)));
       // whoFasterValueOfOrParse();
        whoFasterValueOfOrQuotes();
    }

    private static int[] numbersOfFibanachy(int number)
    {
        if (number <= 2) return new int[]{1, 1};
        int[] numbers = new int[number];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }

        return numbers;
    }

    private static void whoFasterValueOfOrParse()
    {
        int time = 2017;

        long parseIntStart = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Integer.parseInt("2017");
        }
        long parseIntEnd = System.currentTimeMillis();
        System.out.println("parseInt speed " + ((parseIntEnd - parseIntStart)/1000f));


        long valueOfStart = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
         String.valueOf(time);
        }
        long valueOfEnd = System.currentTimeMillis();
        System.out.println("valueOf speed " + (valueOfEnd - valueOfStart)/1000f);

    }

    private static void whoFasterValueOfOrQuotes()
    {
        long quotesStart = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            String a = 2017 + "";
        }
        long quotesEnd = System.currentTimeMillis();

        float quotesSpeed = (quotesEnd - quotesStart)/1000f;
        System.out.println("quotes speed " + quotesSpeed);


        long valueOfStart = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            String a = String.valueOf(2017);
        }
        long valueOfEnd = System.currentTimeMillis();

        float valueOfSpeed = (valueOfEnd - valueOfStart)/1000f;
        System.out.println("valueOf speed " + valueOfSpeed);
    }





}
