package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class RentRoom {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will by rented?");
		int quantytiRent = sc.nextInt();

		Room[] room = new Room[10];

		int numberRoom = 0;
		String name = "";
		String email = ""; 
		

		sc.hasNextLine();
		for (int i = 0; i < quantytiRent; i++) {
			System.out.print("Rent:");
			numberRoom = sc.nextInt();

			sc.nextLine();
			System.out.print("name:");
			name = sc.nextLine();

			System.out.print("email:");
			email = sc.nextLine();

			room[numberRoom] = new Room(name, email);			
		}
		
		System.out.println();
		for (int i = 0; i < room.length; i++) {
			if (room[i] != null) {
				System.out.println(i + ": " + room[i].getName() + ", " + room[i].getEmail());
			}
		}

		sc.close();

	}

}
