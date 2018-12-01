package module2;

public class Drinks {
	int i;
	float total,total1,bill;
	
	void display(String CoolDrinks[],double Price[])
	{for(i=0;i<2;i++)
	{
		System.out.println(CoolDrinks[i]+"    "+Price[i]);
	}
		
		
	}
	void Order(String Drinks,int Quantity) {
		
		if(Drinks=="Pepsi") {
			total=Quantity*25;
			}
			else if(Drinks=="Coca-Cola")
			{
				total1=Quantity*30;
			}
		bill=total+total1;
		
		System.out.println("Bill to pay for Drinks"+bill);
		}
	}


