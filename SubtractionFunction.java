
/**
 * 
 * @author Aaron Leonard
 * 
 * This method extends an abstract method and defines it to return the result of two doubles with the
 * second number subtracted from the first.
 *
 */

public class SubtractionFunction extends DoMath{
	
	public Double calculate(double inputOne, double inputTwo) {
		
		//returning the result of subtraction from two doubles.
		
		double result;
		
		result = inputOne - inputTwo;
		return result;
		
	}

}
