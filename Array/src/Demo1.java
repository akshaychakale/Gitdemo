
public class Demo1 {

	//way1
	public static void main(String [] args) {
		
		//declaration : datatype ref[];
		
	int arr1[] =new int[5];
		
		//initialization ref[indexNo]=value;
		
		arr1[0]=6;
		arr1[1]=8;
		arr1[4]=4;
		
		for(int x:arr1)
		{
			System.out.println(x);
		}
		
		System.out.println("--------------");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("---------------");
		
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.println(arr1[i]);
		}
	}
	
}
