package Package;

public class VehicleClass {

	String name;
	String Color;
	String Model;
	
	
public void start() {
	System.out.println("Vehicle should start");
	System.out.println("\n");
}
public void stop() {
		System.out.println("Vehicle should stop");
		System.out.println("\n");
}
				
public void getname (String name)
{
System.out.println("Vehicle name:"+name);
System.out.println("\n");
}

public void getcolor (String color)
{
	System.out.println("Vehicle color:"+color);
	System.out.println("\n");
}
public void getmodel(String model)
{
System.out.println("vehicle model:"+model );
System.out.println("\n");
}

public static void main(String[]args)
	{
	VehicleClass myvehicle=new VehicleClass();
	myvehicle.getname("toyota");
	myvehicle.getcolor("red");
	myvehicle.getmodel("sun");
	
	}
	
	
	
	

		
		
		
		
		
		
		
		
		
	}
