
public class Voting {

	
	int a=16,b=49;
	void eligible() {
		if (a<=18)
			System.out.println("The person is Not Eligible for voting");
		else
			System.out.println("The person is Eligible for voting");
	}
	
	void value() {
		if (a<0)
			System.out.println("the given number is Negative");
		else if (a==0)
			System.out.println("The given number is Zero");
		else
			System.out.println("The given numnber is Positive");
	}
	void Greater() {
	if (a>b)
				System.out.println(a+"  is the Bigger than"+b);
	else
		System.out.println(b+"  is the Bigger than"+a);
	}
void OddandEven()
{
	if(a/2==0)
		System.out.println("The Given number is EvenNumber");
	else
		System.out.println("The given number is OddNumber");
		
}
}

