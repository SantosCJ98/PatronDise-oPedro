package estado;

import clases.GuerreroSamurai;

public class Deprimido implements Estado {

	@Override
	public void estado(GuerreroSamurai samurai) {
		
		System.out.println("El samurái esta deprimido");
		
		samurai.movetoNormal();
		
		System.out.println("Ahora está como siempre");
		
	}

	


}
