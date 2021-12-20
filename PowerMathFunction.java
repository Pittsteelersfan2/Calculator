
/**
 * 
 * @author Aaron Leonard
 * 
 * This method extends an abstract method and defines it to return the result of two doubles with the second
 * number as the exponent for the first number. It returns the first number to the power of the second
 * number.
 *
 */

public class PowerMathFunction extends DoMath{
	
	public Double calculate(double inputOne, double inputTwo) {
		
		//returning the result of power math from two doubles.
		
		double result;
		
		result = Math.pow(inputOne, inputTwo);
		return result;
		
	}

}
