//////////sample exception handing program
public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		int ans ;
		
		try {
			ans = a/b;
		}
		catch(ArithmeticException E) {
			System.out.println("Exception occured...");
		}
		finally {
			System.out.println("deleting the variables");
			ans = 0;
		}

	}

}
