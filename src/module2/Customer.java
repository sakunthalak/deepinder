package module2;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String CoolDrinks[]= {"Pepsi","Coca-Cola"};
		double Price[]= {25,30};
		
		Drinks dd=new Drinks();
		dd.display(CoolDrinks, Price);
		
		dd.Order("Coca-Cola", 5);

	}

}
