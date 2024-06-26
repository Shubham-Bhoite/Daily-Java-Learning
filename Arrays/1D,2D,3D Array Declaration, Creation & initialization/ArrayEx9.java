import java.util.Arrays;
class ArrayEx9
{
	public static void main(String[] args) {
		int [][][]a = new int [3][][];
		a[0] = new int [1][3];
		a[1] = new int [2][1];
		a[2] = new int [3][2];
		
		a[0][0][0] = 10 ;
		a[0][0][1] = 20 ;
		a[0][0][2] = 30 ;
		a[1][0][0] = 40;
		a[1][1][0] = 50;
		a[2][0][0] =60;
		a[2][0][1] =70;
		a[2][1][0] =80;
		a[2][1][1] =90;
		a[2][2][0] =100;
		a[2][2][1] =110;

		
		System.out.println(Arrays.deepToString(a));
	}
}