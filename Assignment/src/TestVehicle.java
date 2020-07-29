public class TestVehicle
{
public static void main(String[] args)
{
	Vehicle v1=new Vehicle();
	v1.vehicaldetails();
	System.out.println("------------------------------");
	
	Ramesh r1=new Ramesh();
	r1.getvechical(v1,50);
	System.out.println("------------------------------");
	
	Suresh s1=new Suresh();
	s1.getvechical(v1,30);
	
}
}
