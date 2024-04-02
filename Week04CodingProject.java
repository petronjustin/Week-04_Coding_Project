package be_CodingProjectsAndAssignments;

public class Week04CodingProject {

	public static void main(String[] args) {
		
	//	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		/*	a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). 
				Print the result to the console. */
			System.out.println("The difference between the last element and the first element is: " + (93 - 3)); //too easy
			//OR
			int agesLastElement = ages[ages.length - 1];
			int agesFirstElement = ages[0];
			System.out.println("This is another way to supply the difference of values of the last element minus the first element: " + (agesLastElement - agesFirstElement));
			
			
		
		/*	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

				i. Make sure that there are 9 elements of type int in this new array.  

				ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

				iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).*/
			int [] ages2 = {4, 10, 13, 27, 34, 45, 2, 56, 102};
			int difference = ages2[ages2.length - 1] - ages2[0];
			System.out.println("This is the difference between the last element and first element of Array ages2: " + difference);
			
					// Here I am going to combine the two age arrays into one combined age array. 
			int agesOne = ages.length;
			int agesTwo = ages2.length;
			int temp = agesOne + agesTwo;
			int[] combinedAges = new int [temp];
			
			for (int i = 0; i < agesOne; i++) {
				combinedAges[i] = ages[i];
				
			}
			for (int i = 0; i < agesTwo; i++) {
				combinedAges[agesOne + i] = ages2[i];
			}
			for (int i = 0; i < temp; i++) {
				
			}
			
			//The below code will iterate the average of both arrays combined to gather a combined average age.
			
			
		//	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			
			double sum = 0;
			for (int combinedAge : combinedAges) {
				sum += combinedAge;
			}
			double combinedAverage = sum / combinedAges.length;
			System.out.println("Average age of the combined two Arrays: " + combinedAverage);
			
			
	/*	2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

			a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

			b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console. */
	
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
			sum = 0;
			for (String name : names) {
				sum += name.length();
			}
			double averageNameLength = sum / names.length;
			System.out.println("The average number of letters per name: " + averageNameLength);
			
			
			String concatenateNames = "";
			for (int i = 0; i < names.length; i++) {
				concatenateNames += names[i];
				if (i < names.length - 1) {
					concatenateNames += " ";
				}
			}
			System.out.println("The concatenated names are as follows: " + concatenateNames);
			
			
	//	3. How do you access the last element of any array?	
			
			String printOutBob = names[names.length - 1];
			System.out.println("The last element of this array is: " + printOutBob);
			
			
	//	4. How do you access the first element of any array?
			
			String printOutSam = names[0];
			System.out.println("The first element of this array is: " + printOutSam);
			
	//	5. Create a new array of int called nameLengths. Write a loop to iterate over 
	//		the previously created names array and add the length of each name to the nameLengths array.	
			int [] nameLengths = new int [names.length];
				
				int i = 0;
				for (String name : names) {
					nameLengths[i] = name.length();
					i++;
				}
	//	6. Write a loop to iterate over the nameLengths 
	//		array and calculate the sum of all the elements in the array. Print the result to the console.		
			
			int total = 0;
			for (int howManyLetters : nameLengths) {
				total += howManyLetters;
			} 
			System.out.println("The sum of all of the letters in each name is: " + total);
			
	/*	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
		concatenated to itself n number of times. 
		(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”)	*/
			
			
			
		//This will print out the method multipyString that I built at the bottom of the code for question 7.
				System.out.println("Repeated word: " + multiplyString("Easter!", 3));
		
	//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
	//	(the full name should be the first and the last name as a String separated by a space).		
			
		//This will print out the method returnFullName that i built at the bottom of the code for question 8.
			String firstName = "Justin";
			String lastName = "Petron";
			String fullName = returnFullName(firstName, lastName);
			System.out.println("Full Name: " + fullName);
			
			
	//	9. Write a method that takes an array of int
	//	and returns true if the sum of all the ints in the array is greater than 100.
			
				//This will print out the method greaterThan100 that I built at the bottom of the code for problem 9.
			int [] numbers = {37, 42, 75};
				System.out.println("I believe the sum of these random numbers is greater than 100: " + greaterThan100(numbers));
			
	//	10. Write a method that takes an array of double and returns
	//	the average of all the elements in the array.	
				
			//This will print out the method arrayAverage that I built at the bottom of the code for problem 10.
			double [] units = {10.372, 20.80, 25, 37.72, 7, 82, 32.5};
			double average = averageOut(units);
			System.out.println("This is the average of this array of double: " + average);
				
	//	11. Write a method that takes two arrays of double and returns true if the average of the elements
	//	in the first array is greater than the average of the elements in the second array.
			
			//This will print out the method averageTwoDoubles that I built at the bottom of the code for problem 11.
			double [] units2 = {78.23423, 50.0023, 23.890, 1, 2, 12, 45.78};
			
			boolean result = averageTwoDoubles(units, units2);
			System.out.println("Is the first array average greater than the second array average? " + result);

	//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	//	and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			
			boolean isHotOutside = true;
			double moneyInPocket = 12.75;
			boolean thirstQuenching = willBuyDrink(isHotOutside, moneyInPocket);
			System.out.println("Will I purchase a drink today? " + thirstQuenching);
			
			
	//	13. Create a method of your own that solves a problem.
	//	In comments, write what the method does and why you created it.
			/*
			 * Having had a newborn baby back in January... my life is diapers! I originally wanted to
			 * create a small supply chain "min/max" system for my diaper inventory... but as I looked at the 
			 * Oracle docs and different StackOverflow forums on this subject, I realized this might be a bit
			 * advanced for me right now (like... what is Private Static Final anyways?!?)... So I simplified
			 * it to basically tell me if I need to reorder diapers. I hope to potentially do something robust
			 * like this for my final project or a future project depending on what it entails.
			 * 
			 * Lines 233 - 235 represent a boolean method that will return true if my current diaper quantity
			 * is less than or equal to the reorder threshold in my personal inventory.
			 * 
			 * Below, I have created two ints called currentDiaperQuantity and minInventory and did an 
			 * if/else statement to decide if I need to reorder. If the method returns true, it will print out
			 * my need for diapers, else it will tell me to not order diapers.
			 * 
			 */
			
			int currentDiaperQuantity = 128;
			int minInventory = 25;
			if (shouldIOrderDiapers(currentDiaperQuantity, minInventory)) {
				System.out.println("Baby needs some more diapers!");
			}else {
				System.out.println("STOP! You are overflowing with diapers!");
			}
		
				
	}
	public static String multiplyString(String word, int n) {
		String result = "";
		for(int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}	
	public static String returnFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static boolean greaterThan100(int[] randomNumbers) {
		int sum = 0;
		for(int i = 0; i < randomNumbers.length; i++) {
			sum += randomNumbers[i];
		}
		return sum > 100;
	}
	public static double averageOut(double [] arrayAverage) {
		double amount = 0;
		for (double digit : arrayAverage) {
			amount += digit;
		}
		double average = amount / arrayAverage.length;
		return average;
	}
	
	public static boolean averageTwoDoubles (double [] doubleNumbaOne, double [] doubleNumba2) {
		double average1 = averageOut(doubleNumbaOne);
		double average2 = averageOut(doubleNumba2);
		
			return average1 > average2;
	} 
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.50;
	}
	public static boolean shouldIOrderDiapers (int currentDiaperQuantity, int reorderThreshold) {
			return currentDiaperQuantity <= reorderThreshold;
	}
	
  }

