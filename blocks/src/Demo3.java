
public class Demo3 
{
	static int a=10;
		   int b=20;
		   
  static 
  {
	  System.out.println("running static bock of demo3");
	  System.out.println(a);
	  a=66;
  }
  
  {
	  System.out.println("running nonstatic block of demo3");
	  System.out.println(a);
	  System.out.println(b);
	  a=21;
	  b=23;
  }

}
