package clases;

import interfaces.*;
import lucha.Esgrima;
import saludos.Inclinarse;

import estado.*;

public class GuerreroSamurai extends Guerrero {
	
	private final Normal normal = new Normal();
	
	private final Dormido dormido = new Dormido();
	
	private final Deprimido deprimido = new Deprimido();
	
	private Estado estado;
	
	public GuerreroSamurai () {
		
		super(new Inclinarse(), new Esgrima());
		
		estado = normal;
		
	}
	
	public void movetoNormal() {
		
		this.estado = normal;
		
	}
	
	public void movetoDormido() {
		
		this.estado = dormido;
		
	}
	
	public void movetoDeprimido() {
		
		this.estado = deprimido;
		
	}
	
	public void verestado() {
		
		estado.estado(this);
		
	}
	
}
