class PracticeEx5 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 2, 4, 6, 8};
        int sumOfEvenElements = 0;  

        for (int ele : arr) {
            if (ele % 2 == 0) {
                sumOfEvenElements += ele;
            }
        }

        System.out.println("Sum of even-index elements: " + sumOfEvenElements);
    }
}
