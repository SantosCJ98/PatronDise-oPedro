package principal;

import java.time.LocalDate;
import java.time.LocalTime;

import factorias.*;

import clases.*;

import static teclado.Teclado.*;

public class principal {

	public static void main(String args[]) {

		//Ej1
		
		FactoriaPrincipal facto1 = Factoria1.getFactoria1();
		
		FactoriaPrincipal facto2 = Factoria2.getFactoria2();
		  
		  Guerrero ninja = new GuerreroNinja();
		  
		  GuerreroNinja.Builder ninja2 = new GuerreroNinja.Builder("Greninja");
		  
		  Guerrero samurai = new GuerreroSamurai();
		  
		  GuerreroSamurai samurai2 = new GuerreroSamurai();
		  
		  Guerrero barbaro = new GuerreroBarbaro();
		  
		  ninja.display();
		  
		  samurai.display();
		  
		  barbaro.display();
		  
		//Ej2
		  
		  System.out.println("Factoria 1:\nElige una fase: (1-6)");
		  
		  System.out.println("Jugará el " + facto1.crear_guerrero(readRange(1, 6, Rangos.AMBOSIN)).tipoGuerrero());
		  
		  System.out.printf("Factoria 2:\n%s: %s\n", LocalDate.now().getDayOfWeek(), facto1.crear_guerrero(1).tipoGuerrero());
		  
		  
		//Ej3
		  
		  System.out.println("Builder:");
		  
		  System.out.println(ninja2.setFuerza(8000).build().toString());
		  
		  
		 //Ej4
		  
		  System.out.println("State:");
		  
		  for (int i = 0; i < 3; i++) {
			  
			  samurai2.verestado();
			  
		  }
		  
		  
		
		
	}

}
