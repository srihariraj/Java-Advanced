/////////////leapyear finding program//////////////

import java.util.Scanner;

public class LeapYear {
	
	
	public static String isLeap(int year) {
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		return ": is leap";
		
		else return ": is not leap";
	}
	
	
	public static void main(String[] args) {
	
		Scanner Inp= new Scanner(System.in);
		
		System.out.println("Enter the year:");
		int x = Inp.nextInt();
		System.out.println("given year "+x+isLeap(x) +" year");
	}
}
