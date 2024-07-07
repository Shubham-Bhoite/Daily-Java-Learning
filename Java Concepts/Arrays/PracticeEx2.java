import java.util.Arrays;
public class PracticeEx2 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 1.Print using  for loops
        System.out.println("Printing using for loops:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  
        }


        // 2.Print using  while loops
        System.out.println("Printing using while loops:");
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();  
            i++;
            j = 0;  
        }


        // 3.Print using  do-while loops 
        System.out.println("Printing using do-while loops:");
        i = 0;
        j = 0;
        while (true) {
            while (true) {
                System.out.print(arr[i][j] + " ");
                j++;
                if (j >= arr[i].length) {
                    break;
                }
            }
            System.out.println();  
            i++;
            j = 0;  
            if (i >= arr.length) {
                break;
            }
        }


        // 4.Print using foreach loop 
        System.out.println("Printing using foreach loop:");
        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();  
        }

        // 5.Print using toString method
        System.out.println("Printing using toString method:");
        System.out.println(Arrays.deepToString(arr));
    }
}
