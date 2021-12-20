
/**
 * 
 * @author Aaron Leonard
 * 
 * This method extends an abstract method and defines it to return the result of two doubles with the first
 * number divided by the second number.
 *
 */

public class DivisionFunction extends DoMath{
	
	public Double calculate(double inputOne, double inputTwo) {
		
		//returning the result of division from two doubles.
		
		double result;
		
		result = inputOne / inputTwo;
		return result;
		
	}

}
