import java.util.Scanner;

	public class Question2 {
	public static void main(String[] args) {

    String num1;
	String num2;
	
	Scanner sc = new Scanner(System.in);
    System.out.println("\nPlease enter two integers");
	//ask the user for two integers
       
	while (!sc.hasNextInt()) {
	System.out.println("Try again");
	// the user is asked to try again until they enter integers
	num1 = sc.nextLine();
	num2 = sc.nextLine();
	}
	   
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
			
	while (number1 != number2) {
    // number1 is subtracted from number2 to make it equal to number2    	
	if(number1 > number2)
    number1 = number1 - number2;
    else
    number2 = number2 - number1;
    }
		
    System.out.println("\nGCD of the given numbers is "+number2);
    // prints the GCD of the numbers   

}

}