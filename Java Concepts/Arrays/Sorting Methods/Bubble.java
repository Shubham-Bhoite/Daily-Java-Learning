import java.util.Arrays;
class Bubble{
	public static void main(String[] args) {
		int []a={5,3,6,4,7,2,8,1,9};
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void bubbleSort(int[]a)
	{
		for(int i=0; i<a.length;i++)
		{
			for(int j=i;j<a.length;j++){
				if (a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}