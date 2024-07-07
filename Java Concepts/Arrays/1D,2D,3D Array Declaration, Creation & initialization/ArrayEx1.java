import java.util.Arrays;
class ArrayEx1
{
	public static void main(String[] args) {
		char[][]a = new char [2][];
		a[0] = new char[2];
		a[1] = new char[4];
		System.out.println(Arrays.deepToString(a));
		a[0][0] = 'A';
		a[0][1] = 'B';
		a[1][0] = 'C';
		a[1][1] = 'D';
		a[1][2] = 'E';
		a[1][3] = 'F';
		System.out.println(Arrays.deepToString(a));
	}
}