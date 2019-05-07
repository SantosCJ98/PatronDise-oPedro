package estado;

import clases.GuerreroSamurai;

public class Normal implements Estado {

	@Override
	public void estado(GuerreroSamurai samurai) {

		System.out.println("El samurái lucha de forma normal");
		
		samurai.movetoDormido();
		
		System.out.println("El samurái se durmió.");
		
	}

}
