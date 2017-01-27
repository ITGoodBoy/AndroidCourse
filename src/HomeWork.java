
public class HomeWork {


    public static void main(String[] args) {
        matrix(5);
    }


    private static void matrix(int size)
    {
        if (size % 2 == 0) throw new IndexOutOfBoundsException();

        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) ((Math.random() * 90) + 10);
            }
        }

        printMass(matrix);

        int index = 0;
        int element1 = 0;
        int element2 = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[index][index] > max) {
                    max = matrix[index][index];
                    element1 = index;
                    element2 = index;
                }
                if (matrix[index][matrix.length - 1 - index] > max) {
                    max = matrix[index][matrix.length - 1 - index];
                    element1 = index;
                    element2 = matrix.length - 1 - index;
                }
                index++;
                break;
            }
        }

        int centreMass = ((matrix.length - 1)/2);

        int a = matrix[element1][element2];
        matrix[element1][element2] = matrix[centreMass][centreMass];
        matrix[centreMass][centreMass] = a;

        System.out.println();
        System.out.println();
        printMass(matrix);
    }

    private static void printMass(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
