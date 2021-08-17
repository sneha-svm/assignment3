package switchcase;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint choice;
		System.out.println("Pick one : 1. Hey\t 2. Hello\t 3. Hi\t");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
				switch(choice)
				{
				case 1 : System.out.println("You said Hey");
						break;
						
				case 2 : System.out.println("You said Hello");
						break;
			
				case 3 : System.out.println("You said Hi");
						break;
				default : System.out.println("Invalid Choice.");
				}

	}

}
