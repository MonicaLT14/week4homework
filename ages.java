package com.promineotech;

public class ages {

	public static void main(String[] args) {
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			int[] ages = {3,9,23,64,2,8,28,93};
		
			//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). 
			//Print the result to the console.  
			int firstElement = ages[0];
			int lastElement = ages[ages.length-1];
			int subtract = lastElement - firstElement;
				System.out.println("Ages "+subtract);
		
		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		//i. Make sure that there are 9 elements of type int in this new array.  
			int[] ages2 = {2,15,22,14,31,5,43,63,78};			
		
		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
			int firstElement2 = ages2[0];
			int lastElement2 = ages2[ages2.length-1];
			int subtract2 = lastElement2 - firstElement2;
				System.out.println("Ages2 "+subtract2);
		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
			int lastElement3 = ages2[ages2.length-3];
			int subtract3 = lastElement3 - firstElement2;
				System.out.println("Dynamic test "+subtract3);
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
//			int sum = 0;
//			for(int ages21:ages2); {
//				sum ages;
//			}

		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		//the list above will give us the list of of names in the array
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int totalLetters = 0;
		for (String name:names) {
			totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters/names.length;
		System.out.println("Average number of letters per name: "+averageLetters);
		//the loop will run the above array through and count the characters then returning the average number of letters in each name 
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		StringBuilder allNames = new StringBuilder();
		for (String name:names) {
			allNames.append(name).append(" ");
		}
		System.out.println("All the names together: "+allNames.toString().trim());
		//the stringbuilder runs all names from the above array through concatenate all name together which will then allow you to do a system print giving you all the names in the array
		
		//3. How do you access the last element of any array?
		String lastName = names[names.length-1];
		//using the string formula listed above you are able to "look" at the array and see the last element which is set to -1 because arrays start at 0
		
		//4. How do you access the first element of any array?
		String firstName = names[0];
		//using the string formula listed above you are able to "look" at the array and see the first element which is set to 0 because arrays start at 0
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int [] nameLengths = new int[names.length];
		for (int i =0; i<names.length; i++) {
			nameLengths[i]=names[i].length();
		}
		//This is using loop to iterate through each element of the names array. Inside the loop it calculates the length of each string in the names array using the .length () method.
		//it is then assigning the value of the corresponding index for the nameLengths array. This will give you the length of each name from nameLengths after the loop completes. 
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumOfElements=0;
		for (int length:nameLengths) {
			sumOfElements += length;
		}
		System.out.println("Sum of all the elements in the array: "+sumOfElements);
		}
		//This is using loop to set up a variable called sumOfElements to zero and this will hold the sum. using an enhanced for loop is going to iterate over each element in the nameLengths array
		//with each iteration it is adding the value of the current element to the sumOfElements. The system print out gives you the "label" plus sum of all the characters. 
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		public static String repeatWord(String word, int n) {
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < n; i++) {
				result.append(word);
			}
			return result.toString();
		}
		//this is concatenates copies of the (word) to itself n number of times
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			public static String fullName(String firstName, String lastName) {
				return firstName+" "+lastName;
			}
		//this is returning a full name by combining a first name and a last name
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			public static boolean sumGreaterThan(int[]array) {
				int sum =0;
				for (int number:array) {
						sum+=number;
				}
				return sum>100;
			}
		//this is checking the sum of all integers in an array that is greater than 100
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
			public static double average(double[]array) {
				double sum = 0;
				for(double number:array) {
					sum+=number;
				}
				return sum/array.length;
			}
		//this is calculating the average of all the elements in an array of double
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			public static boolean isFirstAvg(double[] array1, double[]array2) {
				return average(array1)>average(array2);
			}
		//this is comparing the averages of two arrays of double and the boolean is returning true if the average of the first array is greater than the second.
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
					return isHotOutside && moneyInPocket > 10.50;
			}
		//this is determining if a drink will be bought based on the weather and the amount of money in someones pockets
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			public static boolean isPalindrome(String word) {
				String reverse=new StringBuilder(word).reverse().toString();
				return word.equalsIgnoreCase(reverse);
			}
		}
		//this is using the palindrome method to check to see if a string is the same when read forwards and backwards
