import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }

        System.out.println("Array: " + Arrays.toString(arr));

        int idxMax = 0, idxMin = 0, sum = 0;
        int firstAppMin = 0, lastAppMin = 0, firstAppMax = 0, lastAppMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[idxMax] < arr[i]) {
                idxMax = i;
                firstAppMax = i;
                lastAppMax = i;
            }
            else if (arr[idxMax] == arr[i]) {
                lastAppMax = i;
            }

            if (arr[idxMin]  > arr[i]) {
                idxMin = i;
                firstAppMin = i;
                lastAppMin = i;
            }
            else if (arr[idxMin] == arr[i]) {
                lastAppMin = i;
            }
        }

        if (firstAppMin != lastAppMin || firstAppMax != lastAppMax) {
            int maxDiff = Math.max(Math.abs(firstAppMax - lastAppMin), Math.abs(lastAppMax - firstAppMin));

            if (Math.abs(firstAppMax - lastAppMin) == maxDiff) {
                idxMax = firstAppMax;
                idxMin = lastAppMin;
            } else {
                idxMax = lastAppMax;
                idxMin = firstAppMin;
            }
       }

        if (idxMin < idxMax) {
            for (int i = idxMin + 1; i < idxMax; i++){
                sum += arr[i];
            }
        } else {
            for (int i = idxMax + 1; i < idxMin; i++) {
                sum += arr[i];
            }
        }

        System.out.printf("\nСумма между максимальным элементом %d с индексом %d и минимальным элементом %d с индексом %d равна %d", arr[idxMax], idxMax, arr[idxMin], idxMin, sum);
    }
}