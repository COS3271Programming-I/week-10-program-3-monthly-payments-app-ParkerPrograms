package Week10;
import java.util.Scanner;
class Monthly_Payments_App {
	static Scanner userinput = new Scanner(System.in);
	
	static double computePayment(double loanAmt, double rate, int numPeriods) {
		double monthlyInterest = (rate / 100.0) / 12;
		int numMonths = numPeriods * 12;
		double partial1 = Math.pow((1+monthlyInterest), numMonths);
		double answer = (loanAmt * monthlyInterest * partial1) / (partial1 - 1);
		return answer;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Monthly Morgate Calculator");
		System.out.print("\nEnter principle: ");
		double a = userinput.nextDouble();
		System.out.print("Enter yearly interest rate without the percent sign: ");
		double b = userinput.nextDouble();
		System.out.print("Enter number of years: ");
		int c = userinput.nextInt();
		System.out.format("\nThe monthly payment is $%.2f", computePayment(a, b, c));
		
	}
}
