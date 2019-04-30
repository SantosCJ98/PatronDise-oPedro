package clases;

import lucha.Ninjutsu;
import saludos.Inclinarse;

public class GuerreroNinja extends Guerrero {

	public GuerreroNinja (String nombre) {
		
		super(nombre, new Inclinarse(), new Ninjutsu());
		
	}
	
}
