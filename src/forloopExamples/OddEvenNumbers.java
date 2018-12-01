package forloopExamples;



public class OddEvenNumbers {
	
	int OD,i,j;
	int a[] = new int [10];
	int b[]=new int[10];
	void Odd() {
	
	for (OD=1;OD<=20;OD++)
		
	{	
		if(OD%2==0)
			
			{a[i]=OD;
			i++;
			}
		
		else
			{b[j]=OD;
			j++;
			}
	
	}
			for(i=0;i<10;i++)
			{System.out.println(a[i]);
				}
			for(j=0;j<10;j++)
			{
				System.out.println("The Oddnumbers are "+b[j]);
			}
			
		   
		
		
	
}}
