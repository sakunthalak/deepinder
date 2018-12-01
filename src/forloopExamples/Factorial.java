package forloopExamples;

public class Factorial {
	
	int n,i,f=1;
	void fact() {
		
		n=5;
		for(i=1;i<=n;i++)
		{
			f=i*f;
		}System.out.println("The Factorial of a Given Number "+f);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial ff=new Factorial();
		ff.fact();
		
	}

}
