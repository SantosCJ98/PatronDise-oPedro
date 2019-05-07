package estado;

import clases.GuerreroSamurai;

public class Dormido implements Estado {

	@Override
	public void estado(GuerreroSamurai samurai) {
		
		System.out.println("El samurái esta dormido");

		samurai.movetoDeprimido();

		System.out.println("Ahora está deprimido.");

	}

}
