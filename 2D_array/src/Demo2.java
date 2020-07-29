
public class Demo2 {

	public static void main(String[] args) {
		
		double arr2[][]=new double [4][3];
		
		arr2[0][1]=6.1;
		arr2[0][2]=8.4;
		arr2[1][0]=9.8;
		arr2[1][2]=3.9;
		arr2[2][1]=3.3;
		arr2[2][2]=8.6;
		arr2[3][0]=1.2;
		arr2[3][1]=2.8;
		
		System.out.println(arr2[3][0]);
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.println(arr2[i][j]+" ");
			}
			System.out.println();
		}

	}

}
