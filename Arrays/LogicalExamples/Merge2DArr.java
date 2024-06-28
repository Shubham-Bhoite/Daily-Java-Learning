import java.util.Arrays;
public class Merge2DArr {

  public static void main(String[] args) {
    int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
    int[][] arr2 = {{7, 8, 9}, {10, 11, 12}};

    int rows1 = arr1.length;
    int cols = arr1[0].length; // Assuming both arrays have the same number of columns
    int rows2 = arr2.length;
    int totalRows = rows1 + rows2;

    int[][] mergedArray = new int[totalRows][cols];

    // Copy elements from arr1
    System.arraycopy(arr1, 0, mergedArray, 0, rows1);

    // Copy elements from arr2 after arr1 elements
    System.arraycopy(arr2, 0, mergedArray, rows1, rows2);

    // Print the merged array
    System.out.println("Merged Array:");
    for (int i = 0; i < totalRows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(mergedArray[i][j] + " ");
      }
     
    }
  }
}
