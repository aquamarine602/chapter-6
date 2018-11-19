package c.spik3_chapter6;

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

public class Computer_guess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		out.println("Welcome to the number guessing game!\n"
				+ "However, you won't be the one guessing this time.\n\n"
				+ "Enter a number between 1 and 100 for the computer to guess:");
		
		int num = input.nextInt();
		
		while (num < 1 || num > 100 ) {
			out.println("\nI said a number between 1 and 100!");
			num = input.nextInt();
		}
		
		int guesses_num = 0;
		int high = 100;
		int low = 1;
		int guess = rand.nextInt(high) + low;
		
		while (guess != num) {
			guesses_num ++;
			
			if (guess > num) {
				high = guess;
				guess = rand.nextInt(high) + low;
				out.println(high + " is too high.");
				
			} else if (guess < num) {
				low = guess;
				guess = rand.nextInt(high) + low;
				out.println(low + " is too low.");
				
			}
		}
		
		out.println("The computer took " + guesses_num + " guesses to get your number, " + guess + ".");
				

	}

}
