import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++){
            arr[i] = new Random().nextInt(10);
        }

        System.out.print("Array: " + Arrays.toString(arr));

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            if(j <= i) break;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.print("\nNew array: " + Arrays.toString(arr));
    }
}