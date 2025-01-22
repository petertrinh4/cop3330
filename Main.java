
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
	/*
	 * Random GUI code
	 */
		
	double amountMoney;
	int hundreds, fifties, twenties, tens, fives, ones, quarters, dimes, nickels, cents;
	Scanner scanMoney;
	
	/*
	 * Initialized variables
	 * */

	scanMoney = new Scanner (System.in);
	System.out.print("Enter dollar amount: $");
	amountMoney = scanMoney.nextDouble();
	scanMoney.close();
	
	/*
	 * Scanner for user input
	 */
	
	hundreds = (int)amountMoney / 100;
	amountMoney %= 100;
	
	fifties = (int)amountMoney / 50;
	amountMoney %= 50;
	
	twenties = (int)amountMoney / 20;
	amountMoney %= 20;
	
	tens = (int)amountMoney / 10;
	amountMoney %= 10;
	
	fives = (int)amountMoney / 5;
	amountMoney %= 5;
	
	ones = (int)amountMoney / 1;
	amountMoney %= 1;
	
	quarters = (int)(amountMoney / 0.25);
	amountMoney %= 0.25;
	
	dimes = (int)(amountMoney / 0.10);
	amountMoney %= 0.10;
	
	nickels = (int)(amountMoney / 0.05);
	amountMoney %= 0.05;
	
	cents = (int)(amountMoney / 0.01);
	amountMoney %= 0.01;
	
	/*
	 * Divides amount of money by the denomination value to get remainder
	 */
	
	System.out.println("\nYou have:\n");
	System.out.println(hundreds + " hundreds");
	System.out.println(fifties + " fifties");
	System.out.println(twenties + " twenties");
	System.out.println(tens + " tens");
	System.out.println(fives + " fives");
	System.out.println(ones + " ones");
	System.out.println(quarters + " quarters");
	System.out.println(dimes + " dimes");
	System.out.println(nickels + " nickels");
	System.out.println(cents + " cents");
	
	
	/*
	 * User output
	 * */
		
	}

}
