import java.util.Random;

/**
 * Main class. 
 **/

public class Main {
	public static void main(String[] args){
		Calculator cal = new Calculator();
		Random ran = new Random();
		
		int firstSmallPosNumber = ran.nextInt(11);
		int secondSmallPosNumber = ran.nextInt(11);
		
		cal.add(firstSmallPosNumber, secondSmallPosNumber);
		
		//System.out.println(cal.add(firstNumber, secondNumber));
	}

}
