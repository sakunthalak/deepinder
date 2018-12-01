package module1;

public class Amusement {

	double Total;
	int NT=11,PR=400;
	void Billing() {
		if(NT<=10)
		{
			Total=NT*PR;
		}
		else
		{
			Total=((NT*PR)-((NT*PR)*.1));
		}
		System.out.println("The Total  Bill to Pay="+Total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amusement A=new Amusement();
		A.Billing();
	}

}
