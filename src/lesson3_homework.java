import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class lesson3_homework {

    public static void main(String[] args) {
       // System.out.println(Arrays.toString(numbersOfFibanachy(20)));
        for (int i = 0; i < 10000; i++) {
            whoFasterValueOfOrParse();
        }

       // whoFasterValueOfOrQuotes();
       // System.out.println(Arrays.toString(vampires().toArray()));
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
        int max = 10000;
        int min = 100;
        String[] a = new String[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = ((int)(Math.random() * (max - min)) * max) + "";
        }
        long valueOfStart = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 4; j++) {
                Integer.valueOf(a[i]);
            }
        }
        long valueOfEnd = System.currentTimeMillis();
        float valueOfSpeed = (valueOfEnd - valueOfStart)/1000f;
        System.out.println("valueOf speed " + valueOfSpeed);



        long parseIntStart = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 4; j++) {
                Integer.parseInt(a[i]);
            }
        }
        long parseIntEnd = System.currentTimeMillis();
        float parseIntSpeed = (parseIntEnd - parseIntStart)/1000f;
        System.out.println("parseInt speed " + parseIntSpeed);
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

    private static ArrayList<String> vampires()
    {
        String a;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 10; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                a = (i * j) + "";

                char[] c = a.toCharArray();
                char[] b = (i + "" + j).toCharArray();

                Arrays.sort(c);
                Arrays.sort(b);

                if (Arrays.equals(c, b))
                {
                    list.add(a);
                }
            }
        }
        return list;
    }





}
