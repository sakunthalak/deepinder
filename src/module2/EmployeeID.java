package module2;

public class EmployeeID {
	int i;
		
    
    void display(int EmployeeID[],String EmployeeName[],float Salary[]) {
    	System.out.println("ID  "+"Name  "+"   Salary ");
    	for (i=0;i<5;i++)
    	{
    		
    	System.out.println(EmployeeID[i]+"   "+EmployeeName[i]+"      "+Salary[i]);
    			
    		
    	}
    }
    	
    	void display( int EmployeeID[],String EmployeeName[]) 
    	{System.out.println("ID    "+"  Name");
    		
    	for(i=0;i<5;i++) {
    		System.out.println(EmployeeID[i]+"      "+EmployeeName[i]);
    		
    	}
    		
    	}
    	void display(int EmployeeID[],String EmployeeName[],float Salary[],String Search)
    	{
    		for( i=0;i<5;i++)
    		{
    			if(EmployeeName[i]=="John") {
    				System.out.println(EmployeeID[i]+"   "+EmployeeName[i]+"      "+Salary[i]);
   	
    		}
    			
    			
    			}
    	}
    
    
}
