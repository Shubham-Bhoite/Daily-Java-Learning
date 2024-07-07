import java.util.Arrays;

class Selection {
    public static void main(String[] args) {
        int[] a = {5, 3, 6, 4, 7, 2, 8, 1, 9};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}
