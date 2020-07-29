class Demo1
{
	static int x=65;
	void view()
	{
		System.out.println("running non-static method...");
	}
	
	{
		System.out.println("running non-static block");
	}
	Demo1()
	{
		System.out.println("running non-static constructor");
	}
	public static void main (String [] args)
	{
		System.out.println("main method started...");
		Demo1 d1=new Demo1();
		System.out.println(d1.x);
		d1.view();
		System.out.println("main method ended...");
	}
}