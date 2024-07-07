import java.util.Arrays;
public class PracticeEx3 {

    public static void main(String[] args) {
        int[][][] arr = { {{1, 2}, {3, 4}}, {{5, 6}, {7, 8}} };
        int i, j, k;

        // 1.Print using for loops
        System.out.println("Printing using for loops:");
        for (i = 0; i < arr.length; i++) {  
            System.out.println("Layer " + (i + 1) + ":");
            for (j = 0; j < arr[i].length; j++) {  
                System.out.print("  Row " + (j + 1) + ": ");
                for (k = 0; k < arr[i][j].length; k++) {  
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }


        // 2.Print using while loops
        System.out.println("Printing using while loops:");
        i = 0;
        j = 0;
        k = 0;
        while (i < arr.length) {
            System.out.println("Layer " + (i + 1) + ":");
            while (j < arr[i].length) {
                System.out.print("  Row " + (j + 1) + ": ");
                while (k < arr[i][j].length) {
                    System.out.print(arr[i][j][k] + " ");
                    k++;
                }
                System.out.println();
                k = 0;  
                j++;
            }
            j = 0;  
            i++;
        }

        // 3.Print using do-while loops 
        System.out.println("Printing using do-while loops :");
        i = 0;
        j = 0;
        k = 0;
        while (true) {
            while (true) {
                while (true) {
                    System.out.print(arr[i][j][k] + " ");
                    k++;
                    if (k >= arr[i][j].length) {
                        break;
                    }
                }
                System.out.println();
                k = 0;  
                j++;
                if (j >= arr[i].length) {
                    break;
                }
            }
            j = 0;  
            i++;
            if (i >= arr.length) {
                break;
            }
        }

        // 4.Print using toString method 
        System.out.println("Printing using toString method:");
        System.out.println(Arrays.deepToString(arr));
    }
}
