package principal;

import clases.*;

public class principal {
	
	public static void main (String args[]) {
		
		Guerrero ninja = new GuerreroNinja("Naruto");
		
		Guerrero samurai = new GuerreroSamurai("Keanu Reeves");
		
		Guerrero barbaro = new GuerreroBarbaro("Conan");
		
		ninja.display();
		
		System.out.println();
		
		samurai.display();
		
		System.out.println();
		
		barbaro.display();
		
	}

}
