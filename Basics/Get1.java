class Get1
{
	static int a=55;
	static void test()
	{
		System.out.println("running static method...");
	}
	static
	{
		System.out.println("running static block...");
	}
	int x=55;
	void view()
	{
		System.out.println("running non-satic method...");
	}
	{
		System.out.println("running non-satic block...");
	}
	Get1()
	{
		System.out.println("running non-satic constructor...");
	}
	public static void main (String [] args)
	{
		System.out.println("main method started...");
		System.out.println(Get1.a);
		Get1.test();
		Get1 g1=new Get1();
		System.out.println(g1.x);
		g1.view();
		Get1 g2=new Get1();
		System.out.println(g2.x);
		g2.view();
		System.out.println("Main method ended...");
	}
}