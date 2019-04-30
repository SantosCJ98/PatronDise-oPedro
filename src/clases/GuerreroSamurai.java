package clases;

import interfaces.*;
import lucha.Esgrima;
import saludos.Inclinarse;

public class GuerreroSamurai extends Guerrero {

	public GuerreroSamurai (String nombre) {
		
		super(nombre, new Inclinarse(), new Esgrima());
		
	}
	
}
