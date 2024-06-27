public class PracticeEx9 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int first, second;
        first = second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("The second smallest element is: " + second);
        }
    }
}
