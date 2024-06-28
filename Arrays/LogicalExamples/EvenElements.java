public class EvenElements {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 7, 30, 25,2,92,77};

        //count the number of even elements
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // Create a new array to store even elements
        int[] evenArr = new int[count];
        int indx = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[indx++] = num;
            }
        }

        // Print the even elements array
        System.out.print("Even elements: ");
        for (int num : evenArr) {
            System.out.print(num + " ");
        }
    }
}
