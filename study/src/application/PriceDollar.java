package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculateDollar;

public class PriceDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ca = new Scanner(System.in);
		CalculateDollar cd = new CalculateDollar();
		System.out.print("What is the dollar price? ");
		cd.valueDoller = ca.nextDouble();
		System.out.println("");
		System.out.print("How many dollars will be bought?");
		cd.quantyti = ca.nextDouble();
		System.out.println("");
		System.out.println(cd.toString());

		ca.close();

	}

}
