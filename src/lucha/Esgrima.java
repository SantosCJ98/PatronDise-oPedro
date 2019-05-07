package lucha;

import clases.Guerrero;
import interfaces.FormaLuchar;

public class Esgrima implements FormaLuchar {
	
	@Override
	
	public void luchar(Guerrero guerrero) {
		
		System.out.printf("%s utiliza la Esgrima\n", guerrero.tipoGuerrero());
		
	}

}
