public class LargestElement {

  public static void main(String[] args) {
    int[] arr = {15, 8, 32, 1, 16};
    int max = arr[0]; 

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println("Largest element in the array: " + max);
  }
}
