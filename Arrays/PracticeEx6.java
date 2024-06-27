class PracticeEx6
{
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
		int sum = 0;
		int i = 0;

		while (i < num.length) {
 		 if (i % 2 != 0) {
  		  sum += num[i];
  		}
 		 i++;
		}

		System.out.println("Sum of odd-index elements: " + sum);

	}
}