import java.util.Scanner;

/**
 * Calculator Program
 * 
 * @author Aaron Leonard
 * 
 * version 1.0.0
 * 
 * This class gets the user input for all the required methods for the calculator and then continues 
 * to print Help for the user if required. It then calls the methods needed and returns and prints
 * the result for the user as needed through a series of if-else if statements.
 *
 */

public class CalculatorPrintMain {
	
	public static void main(String[] args) {
		
		//declaring all the variables I will need and making a scanner object for input
		
		String mathPi = "Pi";
		String mathE = "E";
		String helpUser = "HELP";
		String userFirstNumber = "";
		String userSecondNumber = "";
		String userOperation = "";
		double newUserFirst, newUserSecond;
		Scanner userInput = new Scanner(System.in);
		
		//turn the calculator on by asking the user to type on into the prompt
		
		String calcOn = "";
		System.out.println("To turn the calculator on, type 'On'.");
		Scanner turnCalcOn = new Scanner(System.in);
		calcOn = turnCalcOn.next();
				
		while(calcOn.equalsIgnoreCase("On")) {
			
			try {
				
				System.out.println("(If you require assistance, type in 'help'.)");
							
				//printing a prompt for input and taking the user's input
				
				System.out.println("Please input your first number: ");
				userFirstNumber = userInput.next().trim();
				
				//while there is 'help' printed, display the prompt for help and retake the user's input until it
				//is a number
						
				while(userFirstNumber.equalsIgnoreCase(helpUser)) {
					System.out.println("Symbols: + for Addition, - for Subtraction, * for Multiplication, / for Division, % for Modulo(Remainder) Division, ^ for Power Math, and { for Root Math.");
					System.out.println("To do root math, type the number of the root as your second number. 2 = square root, 3 = cube root, 4 = 4th root, etc.");
					System.out.println("To turn the calculator off, please type 'off'.");
					System.out.println("Please input your first number: ");
					userFirstNumber = userInput.next().trim();
				}
				
				//checking if the user needed to use Pi as a number.
				
				if(userFirstNumber.equalsIgnoreCase("off")) {
					break;
				}
				else if(userFirstNumber.equalsIgnoreCase(mathE)) {
					newUserFirst = Math.E;
				}
				else if(userFirstNumber.equalsIgnoreCase(mathPi)) {
					newUserFirst = Math.PI;
				}
				else {
					newUserFirst = Double.valueOf(userFirstNumber);
				}
				
				//printing a prompt for the operand the user will need, then taking the input again.
				
				System.out.println("Please enter an operation: ");
				userOperation = userInput.next().trim();;
				
				//checking again if the user needs help.
				
				while(userOperation.equalsIgnoreCase(helpUser)) {
					System.out.println("Symbols: + for Addition, - for Subtraction, * for Multiplication, / for Division, % for Modulo(Remainder) Division, ^ for Power Math, and { for Root Math.");
					System.out.println("To do root math, type the number of the root as your second number. 2 = square root, 3 = cube root, 4 = 4th root, etc.");
					System.out.println("To turn the calculator off, please type 'off'.");
					System.out.println("Please enter an operation: ");
					userOperation = userInput.next();
				}
				
				if(userOperation.equalsIgnoreCase("off")) {
					break;
				}
				
				//taking the last of the data needed, second number prompt and input.
				
				System.out.println("Please enter your second number: ");
				userSecondNumber = userInput.next().trim();
				
				//checking if the user needs help, being thorough.
				
				while(userSecondNumber.equalsIgnoreCase(helpUser)) {
					System.out.println("Symbols: + for Addition, - for Subtraction, * for Multiplication, / for Division, % for Modulo(Remainder) Division, ^ for Power Math, and { for Root Math.");
					System.out.println("To do root math, type the number of the root as your second number. 2 = square root, 3 = cube root, 4 = 4th root, etc.");
					System.out.println("To turn the calculator off, please type 'off'.");
					System.out.println("Please enter your second number: ");
					userSecondNumber = userInput.next().trim();
				}
				
				//checking to see if the user needed Pi for the second number.
				
				if(userSecondNumber.equalsIgnoreCase("off")) {
					break;
				}
				else if(userSecondNumber.equalsIgnoreCase(mathE)) {
					newUserSecond = Math.E;
				}
				else if(userSecondNumber.equalsIgnoreCase(mathPi)) {
					newUserSecond = Math.PI;
				}
				else {
					newUserSecond = Double.valueOf(userSecondNumber);
				}
							
				//declaring objects for the methods made to do the math required
						
				AdditionFunction userAdd = new AdditionFunction();
				SubtractionFunction userSubtract = new SubtractionFunction();
				MultiplicationFunction userMultiply = new MultiplicationFunction();
				DivisionFunction userDivide = new DivisionFunction();
				ModuloFunction userModulo = new ModuloFunction();
				PowerMathFunction userPower = new PowerMathFunction();
				
				//series of if and else if statements to do the math based on the user's operand inputed above.
				//Use the newly created objects to call the correct operation
				
				if(userOperation.equals("+")) {
						System.out.println("Your answer is: " + userAdd.calculate(newUserFirst, newUserSecond));
				}
				
				else if(userOperation.equals("-")) {
						System.out.println("Your answer is: " + userSubtract.calculate(newUserFirst, newUserSecond));
				}
				
				else if(userOperation.equals("*")) {
						System.out.println("Your answer is: " + userMultiply.calculate(newUserFirst, newUserSecond));
				}
				
				else if(userOperation.equals("/")) {
						System.out.println("Your answer is: " + userDivide.calculate(newUserFirst, newUserSecond));
				}
				
				else if(userOperation.equals("%")) {
						System.out.println("Your answer is: " + userModulo.calculate(newUserFirst, newUserSecond));
				}
				
				else if(userOperation.equals("^")) {
						System.out.println("Your answer is: " + userPower.calculate(newUserFirst, newUserSecond));
				}
				else if(userOperation.equals("{")) {
						System.out.println("Your answer is: " + userPower.calculate(newUserFirst, (1/newUserSecond)));
				}
				
			}
			catch(Exception e) {
				System.out.println("Action couldn't be completed, please try again.");
			}
		
		}
		
		//close each scanner object when the while loop is done.
		
		userInput.close();
		turnCalcOn.close();
		
	}
}
