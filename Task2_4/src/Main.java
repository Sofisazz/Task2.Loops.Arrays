import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы (больше 2): ");
        int size = in.nextInt();

        if (size <= 2) {
            System.out.println("Количество элементов массива должно быть больше 2!");
            return;
        }

        int[][] arr = new int[size][size];
        for (int j = 0 ,  k = arr[j].length - 1; j < arr.length; j++, k--) {
            for(int i = j; i <= arr[j].length / 2 ; i++) {
                arr[i][j] = new Random().nextInt(9) + 1 ;
                arr[i][k] = new Random().nextInt(9) + 1 ;
            }

            for(int i = k; i > arr[j].length / 2 ; i--) {
                arr[i][j] = new Random().nextInt(9) + 1 ;
                arr[i][k] = new Random().nextInt(9) + 1 ;
            }
        }

    System.out.println("\nМатрица в виде бабочки:");
    for (int[] el : arr){
        System.out.println(Arrays.toString(el));
    }
    }
}