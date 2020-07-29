
public class Demo1 {

	public static void main(String[] args) {
		int arr1[] [];
		
		arr1=new int[3][4];
		
		arr1[0][0] =6;
		arr1[0][1] =8;
		arr1[0][3] =9;
		arr1[1][0] =3;
		arr1[1][2] =1;
		arr1[2][1] =2;
		arr1[2][3] =4;
		
		System.out.println(arr1[1][2]);
		System.out.println("-------------------");
		
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr1[i].length; j++) 
			{
				System.out.print(arr1[i][j]+" ");
				
			}
			
			System.out.println();
		}
		

	}

}
