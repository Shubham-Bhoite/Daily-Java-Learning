import java.util.Arrays;

public class DivideAndReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int mid = arr.length / 2;

        // Reverse the first half
        for (int i = 0; i < mid / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[mid - 1 - i];
            arr[mid - 1 - i] = temp;
        }

        // Reverse the second half
        for (int i = mid; i < (arr.length + mid) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - (i - mid)];
            arr[arr.length - 1 - (i - mid)] = temp;
        }

        // Print the result
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
