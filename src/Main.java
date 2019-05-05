import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// *** Part One of Project ***
		
		//Ask for users first name
		System.out.println("Welcome to your fortune! Tell me something... \nLets start with your first name?");
		String userFirst = input.next();
		
		//Text response for users first name
		System.out.println(userFirst + ", I see, I see ...");
		
		//Ask for the users last name
		System.out.println("Now, what is your last name?");
		String userLast = input.next();
		
		//Text response for users last name
		System.out.println("Ah, " + userLast + ", strong last name. Suits you. ");
		
		//Ask for users age
		System.out.println("So " + userFirst + ", what is your age? Don't be shy...");
		int userAge = input.nextInt();
		
		//Text response for users age
		System.out.println("There is no way you're " + userAge + " years old. You look amazing.");
		
		//Users birth month
		System.out.println("Now if you had to number the month of your birth ( between 1-12 ), what would yours be?");
		int userMonth = input.nextInt();
		// number is stored use " userMonth" for your response for the even/odd	
		
		//Users birth month defined as a Month, not a number.
		
		 String futureMonths = "none";
		
		switch (userMonth) {
		case 1: futureMonths ="January";
		break;
		case 2: futureMonths ="February";
		break;
		case 3: futureMonths ="March";
		break;
		case 4: futureMonths ="April";
		break;
		case 5: futureMonths ="May";
		break;
		case 6: futureMonths ="June";
		break;
		case 7: futureMonths ="July";
		break;
		case 8: futureMonths ="August";
		break;
		case 9: futureMonths ="September";
		break;
		case 10: futureMonths ="October";
		break;
		case 11: futureMonths ="November";
		break;
		case 12: futureMonths ="December";
		break;
		default: break;
		}	
			
		// Text response for users month
		System.out.println(futureMonths + ", splendid!");
		
		//Ask for users favorite color using While statement.
		System.out.println("What color is your favorite? You only have a few to choose from. Type \"Help\" if you need ideas.");
		
		String userColor = input.next();
			while(userColor.toLowerCase().contentEquals("help")) {
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, or Violet");
				userColor = input.next();
			}
			
			//Response to Color
			System.out.println("That is a beautiful color!");
			
			//Line Break
			System.out.println("");
			
			//Ask for users number of siblings
			System.out.println("How many siblings do you have?");
			int mySiblings = input.nextInt();
			
			// *** Part Two of Project ****
			//  Age + Odd / Even = Retire
			String retireAge = null;
				if (userAge % 2 == 0) {
					retireAge = "20 years";
				} else if (userAge % 2 == 1) {
					retireAge = "45 years";
				}
				
			// Siblings / Vacation homes
			String vacationSiblings = null;
				if (mySiblings == 0) {
					vacationSiblings = "Paris, France";
				} else if (mySiblings == 1) {
					vacationSiblings = "Bellerophon";
				} else if (mySiblings == 2) {
					vacationSiblings = "Miami, Florida";
				} else if (mySiblings == 3) {
					vacationSiblings ="Tokyo, Japan";
				} else if (mySiblings >= 3) {
					vacationSiblings ="box down by the river";
				} else if (mySiblings <= 0) {
					vacationSiblings ="Iceland";
				}
			
			// Favorite Color / Transportation
			String transportationColor = "car";
				if (userColor.contentEquals("red")) {
					transportationColor ="a Mercedes G Class, stylin'";
				} else if (userColor.contentEquals("orange")) {
					transportationColor ="a horse, neigh";
				} else if (userColor.contentEquals("yellow")) {
					transportationColor ="a yellow Saturn. Good luck not getting laughed at";
				} else if (userColor.contentEquals("green")) {
					transportationColor ="a Lexus 200ct Hybrid. Look at you, helping the earth";
				} else if (userColor.contentEquals("blue")) {
					transportationColor ="a helicopter";
				} else if (userColor.contentEquals("indigo")) {
					transportationColor ="a delorian. Where you will go, you'll need no roads";
				} else if (userColor.contentEquals("violet")) {
					transportationColor ="a mini van. Put some spinners on it, it'll be cool";
					
				}
				
			// Birth Month / Bank Balance
			String moneyMonth = "money";
				if (userMonth >=1 && userMonth <= 4) {
					moneyMonth ="$40,000";
				} else if (userMonth >=5 && userMonth <=8) {
					moneyMonth ="$90,000";
				} else if (userMonth >=9 && userMonth <=12) {
					moneyMonth ="$40000,0000";
				} else if (userMonth >=13) {
					moneyMonth ="$0.00";
				}
				
			// *** Part Three of Project ***
				System.out.println("The gods are talking.");
				System.out.println("Shh... shh...");
				System.out.println("Your fortune is the following...");
				System.out.println(""+ userFirst + " " + userLast + " will retire in " + retireAge + " with " + moneyMonth + " in the bank, a vacation home in " + vacationSiblings + ", and travel by " + transportationColor + ".");
				
		}
		
		
	}

