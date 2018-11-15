package c.spik3_chapter6;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		//int count = 100;		// centry variable
		//while (count > 0) {
			//count -= 1;
			//out.println("I will not be late to class.");
		//}
		
		//out.println("Your lone hero is surrounded by a massive army of trolls.");
		//out.println("Their decaying green bodies stretch out, melting into the horizon");
		//out.println("You hero usheathes his sword for the last of of his life.\n");
		
		//int health = 10;
		//int trolls = 0;
		//int damage = 3;
		
		//while (health > 0) {
			//trolls ++;
			//health = health - damage;
			//out.println("Your hero swings and defeats an evil troll,\n"
					//+ "but takes " + damage + " damage.\n");
		//}
		
		//out.println("Your hero fought valiantly and defeated " + trolls + " trolls.");
		//out.println("But alas, your hero is no more.");
		
		//int sum = 0, i = 1;
		//while (i < 10) {
			//sum = sum + i;
			//i ++;
		//}
		//out.println(sum);
		
		int count = 0;
		
		while (count < 10) {
			
			count = count + 1;
			
			int rand1 = rand.nextInt(10) + 1;
			int rand2 = rand.nextInt(10) + 1;
			
			out.println(count + ". What is " + rand1 + " + " + rand2 + "?");
			int user = input.nextInt();
		
			int answer = rand1 + rand2;
			
			while (answer != user) {
				out.println("\n----------------------------");
				out.println("Incorrect. Please try again.");
				out.println("----------------------------\n");
				
				out.println(count + ". What is " + rand1 + " + " + rand2 + "?");
				user = input.nextInt();
			}
			
			out.println("\n--------");
			out.println("Correct!");
			out.println("--------\n");
			
		}
		
	}

}
