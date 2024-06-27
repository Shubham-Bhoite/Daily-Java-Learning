public class PracticeEx11 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 11, 13, 17, 4};
        
        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
