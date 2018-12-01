package forloopExamples;

public class TentheTable {
	
	
	int m=10,i,t;
	void Table() {
		
		
		for(i=1;i<=10;i++)
		{
		  t=m*i;
		  System.out.println(m+"*"+i+"="+t);
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Tenth table");
		TentheTable t1=new TentheTable();
		t1.Table();
		
		

	}

}
