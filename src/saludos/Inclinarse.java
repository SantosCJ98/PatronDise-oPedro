package saludos;

import clases.Guerrero;
import interfaces.FormaSaludar;

public class Inclinarse implements FormaSaludar {

	@Override
	public void saludar(Guerrero guerrero) {
		
		System.out.printf("%s se inclinó.\n", guerrero.getNombre());
		
	}

}
