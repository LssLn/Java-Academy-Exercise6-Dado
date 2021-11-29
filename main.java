package Dadi;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		System.out.println("Quante facce ha il dado? : ");
		Scanner input = new Scanner(System.in);
		int faces = input.nextInt();
		
		Dado dado = new Dado(faces);
		System.out.println("Il dado con facce "+dado.getFaces()+
				" è stato lanciato: "+dado.Lancia());
	}
}
