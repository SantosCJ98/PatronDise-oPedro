package principal;

import java.time.LocalDate;

import factorias.*;

public class principal {

	public static void main(String args[]) {

		/*
		 * 
		 * Guerrero ninja = new GuerreroNinja("Naruto");
		 * 
		 * Guerrero samurai = new GuerreroSamurai("Keanu Reeves");
		 * 
		 * Guerrero barbaro = new GuerreroBarbaro("Conan");
		 * 
		 * ninja.display();
		 * 
		 * System.out.println();
		 * 
		 * samurai.display();
		 * 
		 * System.out.println();
		 * 
		 * barbaro.display();
		 * 
		 */
		
		FactoriaPrincipal facto1 = Factoria1.getFactoria1();
		
		FactoriaPrincipal facto2 = Factoria2.getFactoria2();
	
		
		for (int i = 0; i < 6; i++) {
			
			System.out.printf("%d: %s\n", (i+1), facto1.crear_guerrero(i+1).getClass().getSimpleName());
			
		}
		
		System.out.println();
		
		System.out.printf("%s: %s\n", LocalDate.now().getDayOfWeek(), facto2.crear_guerrero(1).getClass().getSimpleName());
		
		
	}

}
