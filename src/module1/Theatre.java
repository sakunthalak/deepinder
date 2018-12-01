package module1;

public class Theatre {
	
	String Gold,Silver,category;
	int Total,NumberT;
	void Billing(String category, int NumberT) {
		if(category=="Gold")
		{
			Total=NumberT*200;
		}
		else if(category=="Silver")
		{
			Total=NumberT*150;
		}
		System.out.println("The total Ticket Price="+Total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre tt=new Theatre();
		tt.Billing("Gold",40);
		
	}

}
