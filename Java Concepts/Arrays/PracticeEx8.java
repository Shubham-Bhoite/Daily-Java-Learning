import java.util.Arrays;

class PracticeEx8 {

    public static void main(String[] args) {
        int[] arr = {12, 34, 65, 74, 23, 8, 98, 43, 9, 13, 354};
        Arrays.sort(arr);  

        System.out.println("Largest element in the array: " + arr[arr.length - 1]);
    }
}
