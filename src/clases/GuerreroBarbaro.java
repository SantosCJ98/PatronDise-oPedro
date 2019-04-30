package clases;

import interfaces.*;
import lucha.Esgrima;
import saludos.GritoGuerra;

public class GuerreroBarbaro extends Guerrero {

	public GuerreroBarbaro (String nombre) {
		
		super(nombre, new GritoGuerra(), new Esgrima());
		
	}
	
}
