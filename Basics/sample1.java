class Sample1
{
	static int a=55;
	static void test()
	{
		System.out.println("running satic method...");
	}
	static
	{
		System.out.println("running static block");
	}
	public static void main (String [] args)
	{
		System.out.println("main method started...");
		System.out.println(Sample1.a);
		Sample1.test();
		System.out.println("main method ended...");
	}
}