
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a variable to hold the quantity of available plane seats left on plane
		int availSeats = 40;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 32.50;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'K';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isItHotOutside = true;
		
		//create a variable to hold a customer's first name
		String firstName = "Sparky";
		
		//create a variable to hold a street Address
		String streetAddress = "700 Foxtrot Way";
		
		//print all variables to the console 
		System.out.println(availSeats);
		System.out.println(costOfGroceries);
		System.out.println(middleInitial);
		System.out.println(isItHotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);
		
		System.out.println(costOfGroceries + " is the price for groceries.");
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availSeats = availSeats - 2;
		System.out.println(availSeats);
		availSeats -= 2;
		System.out.println(availSeats);
		
		//impulse candy bar purchase add 2.15 to the grocery total
		costOfGroceries = costOfGroceries + 2.15;
		System.out.println(costOfGroceries);
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change the middle initial to something else 
		middleInitial = 'C';
		System.out.println(middleInitial);
		
		//The season has changed, update the hot outside variable to be opposite of what it was 
		//isItHotOutside = false;  - this is one way to do it or
		isItHotOutside = !isItHotOutside;
		System.out.println(isItHotOutside);
		
		// create a new variable called full name using the customer's first name, the middle initial, and last name of your choice
		String fullName = firstName + " " + middleInitial + " " + "Henderson";
		System.out.println(fullName);
		
		//Print a line to the console that introduced the customer and says they live at the address variable
		System.out.println("This is " + fullName + " and they live at " + streetAddress + ".");
				
		int num1 = 5;
		int num2 = 2;
		int num3 = 4;
		
		System.out.println(num1 % num2);
		
		System.out.println(num1 * num2);
		
		System.out.println(num1 * num3 / num2);
		
		System.out.println(num2 / num2 * num1);
		
		System.out.println(num2 / (num2*num1));
		
		System.out.println(num3/ (num2 * 2));
		
		double num4 = 15;
		double num5 = 7;
		double num6 = 2;
		
		double myAnswer = (num4/num5) * num6;
		System.out.println(myAnswer);
		
		
		
	}

}
