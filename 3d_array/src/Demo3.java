
public class Demo3 
{
	public static void main(String[]args) {
		
	
	int arr3[][][]= {
					
				{
					{1,1,1},{2,2,2},{3,3,3}
				},
				{
					{4,4,4},{5,5,5},{6,6,6}
				},
				{
					{7,7,7},{8,8,8},{9,9,9}
				}
			
					};
	
	for (int i = 0; i < arr3.length; i++) 
	{
		for (int j = 0; j < arr3[i].length; j++)
		{
			for (int k= 0; k < arr3[i][j].length; k++) 
			{
				System.out.print(arr3[i][j][k]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
}
}