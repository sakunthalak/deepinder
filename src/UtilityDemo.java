import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UtilityDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		
		System.out.println(date);
		Calendar calender= Calendar.getInstance();
		int hr=calender.get(Calendar.HOUR_OF_DAY);
		int min=calender.get(Calendar.MINUTE);
		int sec=calender.get(Calendar.SECOND);
		System.out.println(hr+":"+min+":"+sec+":");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of A");
		int A=scan.nextInt();
		System.out.println("Enter the value of B");
		int B=scan.nextInt();
		int C=A+B;
		System.out.println("The sum of two numbers is "+C);
		

	}

}
