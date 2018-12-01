

public class AddingDigits {
	
int i=256;
void sum() {
	int sum=0;
	String n=Integer.toString(i);
	for(int j=0;j<n.length();j++) {
		String s=String.valueOf(n.charAt(j));
		sum+=Integer.parseInt(s);
		
		
	}System.out.println("the given string"+i);
	System.out.println("The sum is "+sum);
	
}
public static void main(String[] args) {
	AddingDigits aa=new AddingDigits();
	aa.sum();
	
}

}
