
public class Demo2
{

	public static void main(String[] args) 
	{
		char arr2[][][]= new char[3][3][4];
		
		
		arr2[0][0][0] ='a';
		arr2[0][1][1] ='a';
		arr2[0][2][2] ='a';
		arr2[0][2][3] ='a';
		
		arr2[1][0][2] ='b';
		arr2[1][0][3] ='b';
		arr2[1][1][1] ='b';
		arr2[1][2][0] ='b';
		
		arr2[2][0][0] ='c';
		arr2[2][1][1] ='c';
		arr2[2][2][2] ='c';
		arr2[2][2][3] ='c';
		
		for (int i = 0; i < arr2.length; i++) 
		{
			for (int j = 0; j < arr2[i].length; j++)
			{
				for (int k= 0; k < arr2[i][j].length; k++) 
				{
					System.out.print(arr2[i][j][k]+" ");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}

	}

}	

