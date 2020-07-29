
public class TestDemo3
{
	public static void main(String[] args) 
	{
		System.out.println("mms");
		System.out.println(Demo3.a);

		Demo3 d3=new Demo3();
		System.out.println(d3.b);
		System.out.println("mme");
	}
	{	
		System.out.println("runnng non static block of testDemo3");
		Demo3 d3=new Demo3();
		System.out.println(d3.b);
		System.out.println(d3.a);
	}

	static 
	{
		System.out.println("running statc block of testdemo3");
		TestDemo3 d3=new TestDemo3();

	}

}
