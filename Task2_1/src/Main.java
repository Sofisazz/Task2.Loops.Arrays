import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length ; i++){
        arr[i] = new Random().nextInt(10);
    }

    System.out.print("Array: " + Arrays.toString(arr));

    int max = arr[0];
    int idx = 0;

    for (int i = 0; i < arr.length ; i++){
        if(max < arr[i]) {
            max = arr[i];
            idx = i;
        }
    }

    System.out.println("\n\nMax element: " + max + "\nIndex: " + idx);

    }
}