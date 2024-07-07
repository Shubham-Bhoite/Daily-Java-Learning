class LabelFor
{
	public static void main(String[] args) {
		ramesh:
			for (int i=1;i<=2 ;i++ ) {
				for (int j=2;j<=3 ;j++ ) {
					if (j==3) {
						break ramesh;
					}
					System.out.println("i-" + i + "/" + "j-" + j);
				}
			}
		}
	}
