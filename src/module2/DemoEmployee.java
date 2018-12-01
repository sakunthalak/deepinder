package module2;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int EmployeeID[]= {00,002,003,004,005};
	    String EmployeeName[] = {"John","Clark","Nancy","Joe","Mary"};
	    float Salary[]= {600000,550000,500000,500000,300000};
		String Search="John";
	    EmployeeID ee=new EmployeeID();
	ee.display(EmployeeID, EmployeeName);
	ee.display(EmployeeID, EmployeeName, Salary);
	ee.display(EmployeeID, EmployeeName, Salary, Search);
	
	if ("John"=="John") {
		System.out.println("yes");
	}

	}

}
