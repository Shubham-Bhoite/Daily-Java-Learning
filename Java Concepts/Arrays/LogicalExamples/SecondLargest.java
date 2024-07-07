import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 80, 7, 30, 25,100};
        Arrays.sort(arr);

        int secondLargest = arr[arr.length - 2];
        System.out.println("The second largest element is: " + secondLargest);
    }
}
