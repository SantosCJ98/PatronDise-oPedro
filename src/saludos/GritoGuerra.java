package saludos;

import clases.Guerrero;
import interfaces.FormaSaludar;

public class GritoGuerra implements FormaSaludar {

	@Override
	public void saludar(Guerrero guerrero) {
		
		System.out.printf("%s hizo un Grito de Guerra\n", guerrero.tipoGuerrero());
		
	}

}
