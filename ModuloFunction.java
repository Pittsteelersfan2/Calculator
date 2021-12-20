
/**
 * 
 * @author Aaron Leonard
 * 
 * This method extends an abstract method and defines it to return the result of two doubles with the second
 * number modulo divided from the first number.
 *
 */

public class ModuloFunction extends DoMath{

	public Double calculate(double inputOne, double inputTwo) {
		
		//returning the result of modulo division from two doubles.
		
		double result;
		
		result = inputOne % inputTwo;
		return result;
		
	}
	
}
