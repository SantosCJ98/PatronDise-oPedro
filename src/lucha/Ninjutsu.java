package lucha;

import clases.Guerrero;
import interfaces.FormaLuchar;

public class Ninjutsu implements FormaLuchar {
	
	@Override
	
	public void luchar(Guerrero guerrero) {
		
		System.out.printf("%s utiliza el Ninjutsu.\n", guerrero.tipoGuerrero());
		
	}

}
