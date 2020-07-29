
public class demo2 {

	public static void main(String [] args) {
		
		double arr2[] =new double[6];
		
		arr2[0]=2.6;
		arr2[1]=4.3;
		arr2[3]=6.1;
		arr2[5]=3.9;
		
		for(double x:arr2)
		{
			System.out.println(x);
		}
		
		System.out.println("--------------");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		System.out.println("---------------");
		
	}
	
}
