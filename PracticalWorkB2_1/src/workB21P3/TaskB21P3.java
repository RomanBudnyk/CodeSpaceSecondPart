//        1. Откройте проект PracticalWorkВ2-1 и добавьте в него пакет workВ21Р3, в
//        котором создайте класс TaskВ21Р3.
//        2. Добавьте в класс TaskВ21Р3 метод public static void
//        permutationRowsAndColumnsMatrix(int[][] matrix, int row, int column),
//        который находит в матрице минимальный элемент и меняет его местами с
//        указанным элементом matrix[row][column] путем последовательной
//        перестановки их строк и столбцов.
//        3. Добавьте в класс TaskВ21Р3 метод public static int[][] createMatrix(int
//        size), который создает матрицу размером size на size и инициализирует ее
//        случайными значениями.
//        4. Добавьте в класс TaskВ21Р3 метод public static void printMatrix(int[][]
//        matrix), который выводит матрицу.
//        5. Добавьте в класс Task7В21Р3 метод public static void main(String[] args),
//        который вводит размерность матрицы, создает и отображает ее, затем
//        вводит позицию элемента матрицы и вызывает метод
//        permutationRowsAndColumnsMatrix() для обработки матрицы, после чего
//        отображает ее в консоль.
//        6. Запустите приложение на исполнение.

package workB21P3;

import java.util.Arrays;
import java.util.Scanner;

public class TaskB21P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the matrix: ");
        int size = scanner.nextInt();

        int[][] arraysTwo = createMatrix(size);
        System.out.println("Matrix:");
        printMatrix(arraysTwo);

        System.out.print("Enter row and column: ");
        permutationRowsAndColumnsMatrix(arraysTwo, scanner.nextInt(), scanner.nextInt());

        System.out.println("---------------------------------------");
        printMatrix(arraysTwo);
    }

    public static void permutationRowsAndColumnsMatrix(int[][] matrix, int row, int column) {
        int min = matrix[0][0];
        int rowMin = 0;
        int columnMin = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    rowMin = i;
                    columnMin = j;
                }
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Minimal element = " + min + "\trow = " + rowMin + "\tcolumn = " + columnMin);

        //сначала смещаем строки, затем столбцы

        int direct = -1;
        if (rowMin < row) {
            direct = -direct;
        }
        for (int count = rowMin; count != row; count = count + direct) {
            int[] temp = matrix[count];
            matrix[count] = matrix[count + direct];
            matrix[count + direct] = temp;
        }
        direct = -1;
        if (columnMin < column) {
            direct = -direct;
        }
        for (int count = columnMin; count != column; count = count + direct) {
            for (int rowC = 0; rowC < matrix.length; rowC++) {
                int temp = matrix[rowC][count];
                matrix[rowC][count] = matrix[rowC][count + direct];
                matrix[rowC][count + direct] = temp;
            }
        }
    }

    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}