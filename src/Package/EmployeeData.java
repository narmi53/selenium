package Package;

public class EmployeeData {


 String name;
 int age;
 double salary;
 double height;
 String company;
 
 
 public void getname (String name) {
	 System.out.println("String name-"+name);
	 System.out.println("\n");

 }
   
 public void getage (int age) {
	 System.out.println("int age-"+age);
	 System.out.println("\n");
 }
 
  public void getsalary (double salary) {
	  System.out.println("double salary-"+salary);
	  System.out.println("\n");
  }
 
  
  public void getheight (double height) {
	  System.out.println("double height-"+height);
	  System.out.println("\n");
  }
 
  
  public void getcompany (String Company) {
	  System.out.println("string company-"+company);
	  System.out.println("\n");
  }
  
  
  
  public static void main(String[]args) {
	  EmployeeData myteam=new EmployeeData();
	  myteam.getname("jason huggins");
	  myteam.getage(22);
	  myteam.getsalary(8.50);
	  myteam.getheight(5.5);
	  myteam.getcompany("infosys");
  }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}