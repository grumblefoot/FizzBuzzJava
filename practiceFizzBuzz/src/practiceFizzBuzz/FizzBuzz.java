package practiceFizzBuzz;

import java.util.Scanner;
/**
 *@author Rowan W Osmon version 1.0 
* This is a baisc FizzBuzz I made for practice.
*/
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		runFizzBuzz(inputSelect(s));
	}	
	
static Scanner s = new Scanner(System.in);
	
	
	public static void runFizzBuzz(int[] numbers) {
		
		int current = 1;
		while(current < 100) {
			if(current % numbers[0] == 0 && current % numbers[1] == 0) {
				System.out.println("FizzBuzz!");
			}
			else if(current % numbers[0]== 0) {
				System.out.println("Fizz");
			}
			else if(current % numbers[1] == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(current);
			}
			current++;
		} 
	}
	
	public static int[] inputSelect(Scanner s) {
		int[] numbers = {0, 0};
		int currentNum = 10;
		
		for (int i = 0; i < numbers.length; i++) {
			while(numbers[i] != currentNum) {
				System.out.println("Please choose a number between 2 - 9");
				s.nextLine();
				if(s.hasNextInt()) {
					currentNum = s.nextInt();
					if(currentNum > 9 && currentNum <= 1){
						System.out.println("Not a valid choice!");
					}
					else if(i == 1 && currentNum == numbers[0]) {
						System.out.println("Cannot choose the same number twice!");
					}
					else {
						numbers[i] = currentNum;
						System.out.println("You choose " + numbers[i]);
					}
				}
				else {
					System.out.println("Not a valid choice!");
				}
			}
			
			
			System.out.println(numbers[0]);
			System.out.println(numbers[1]);
		}
		return numbers;
	}
}

