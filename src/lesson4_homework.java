import java.util.Scanner;

/**
 * Created by Sergey on 06.02.2017.
 */
public class lesson4_homework {

    public static void main(String[] args) {
        String[][] map =
                {{"кредит", "Китай", "пингвин", "киндер-сюрприз", "Марс"},
                 {"тюрьма", "Заец", "Волк", "дед мороз", "Сокровище!"},
                 {"пусто", "Титаник", "Илон Маск", "GOOGLE", "MICROSOFT"},
                 {"Warning, C++", "Украина", "США", "Атлантида", "Марс"}};
        System.out.println(searchTreasure(map, "N 2", "E 4"));
    }

    private static String searchTreasure(String[][] map, String... direction)
    {
        int x = 0;
        int y = map.length - 1;
        for (int i = 0; i < direction.length; i++) {
            String[] coordinates = direction[i].split(" ");
            switch (coordinates[0])
            {
                case "N":
                    y -= Integer.parseInt(coordinates[1]);
                    break;
                case "S":
                    y += Integer.parseInt(coordinates[1]);
                    break;
                case "E":
                    x += Integer.parseInt(coordinates[1]);
                    break;
                case "W":
                    x -= Integer.parseInt(coordinates[1]);
                    break;
            }
        }
        return map[y][x];
    }

    public static class Test {

        public static void main(String[] args) {
            String text = "";
            while (true)
            {
                text = text + new Scanner(System.in).nextLine() + ",";
                if (text.length() >= 5) {
                    if (text.substring(text.length() - 5, text.length()).equals("exit,")) {
                        text = text.substring(0, text.length() - 5);
                        break;
                    }
                }
            }
            //System.out.println(Arrays.toString(new TreeSet<>(Arrays.asList(text.split(","))).toArray()));
            //System.out.println(Arrays.toString(new PriorityQueue<>(Arrays.asList(text.split(","))).toArray()));
        }
    }
}
