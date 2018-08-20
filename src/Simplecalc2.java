/*
 * Purpose of this programs is to create simple calculator
 * Author:Clarissa Mercado
 * Date: 07-24-18
 * 
 * Simple Calculator
 * Hi! What do you want to do? 1. Add 2.Subtract 3. Divide 4. Multiply 5. Quit
 * Uer iputs something 
 * If user selects 5 quit 
 * Great! Enter the first number
 * user enters first number 
 * Enter Second Number 
 * Here's the answer: Display result
 * Hi! What do you want to do 
 * if used selects 5 quit,
 * else run the questions from line 10 to 12 
 * repeat the menu again 
 * 
 */
import java.util.Scanner;
public class Simplecalc2 {
	public static void main(String args[]) {
		int selection;
		double num1, num2, answer;
		String result = "Your result is: ";
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("Hi! What do you want to do? 1.Add 2. Subtrat 3. Divide 4. Multiply 5. Quit");
				selection = keyboard.nextInt();
			if (selection > 0 && selection < 5) {
			System.out.println("Enter First number: ");
				num1 = keyboard.nextDouble();
			System.out.println("Enter Second number: ");
				num2 = keyboard.nextDouble();
			
			switch(selection) {
					
				case 1: {
						answer = num1 + num2;
						System.out.println(result + answer);
						break;
					}
				case 2: {
						answer = num1 - num2;
						System.out.println(result + answer);
						break;
					}
				case 3: {
						answer = num1/num2;
						System.out.println(result + answer);
						break;
					}
				case 4: {
						answer = num1*num2;
						System.out.println(result + answer);
						break;
					}
			    }
	      }
		
		}while (selection > 0 && selection < 5);	 
	}
}