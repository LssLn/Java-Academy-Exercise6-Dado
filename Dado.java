package Dadi;

import java.util.Random;

public class Dado {
	private int faces;
	
	public Dado (int faces) {
		this.faces=faces;
	}
	public Dado () { //no args gives error 
		this.faces=6; 
	}
	
	public int getFaces() {
		return faces;
	}
	public void setFaces(int faces) {
		this.faces = faces;
	}
	
	public int Lancia() {
		Random random = new Random();
		
		
		int rand = (random.nextInt(faces));
		
		if(rand==0) return 1;
		return rand;
	}
}
