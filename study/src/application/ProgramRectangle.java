package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Rectangle rect = new Rectangle();
		Scanner	sc = new Scanner(System.in);		
		
		System.out.println("Enter rectangle widht e height");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER  = %.2f%n", rect.perimeter()); 
		System.out.printf("DIAGONAL  = %.2f%n", rect.diagonal());
		sc.close();
				

	}

}
