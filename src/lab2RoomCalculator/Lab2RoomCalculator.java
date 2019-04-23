package lab2RoomCalculator;

import java.util.Scanner;

public class Lab2RoomCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Enter the rooms length");
			double length = scan.nextDouble();

			System.out.println("Enter the rooms width");
			double width = scan.nextDouble();
			
			System.out.println("Enter the rooms height");
			double height = scan.nextDouble();

			double area = (length * width);
			double perimeter = ((length + width) * 2);
			double volume = (( length * width) * height);
					
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("volume: " + volume);
			System.out.println();

			System.out.println("would you like to continue, Y/N?");
			answer = scan.next();
			System.out.println();

		} while (answer.equalsIgnoreCase("Y"));

		{
		}
	}
}


