package clases;

import interfaces.*;
import lucha.Esgrima;
import saludos.GritoGuerra;

public class GuerreroBarbaro extends Guerrero {

	public GuerreroBarbaro () {
		
		super(new GritoGuerra(), new Esgrima());
		
	}
	
}
