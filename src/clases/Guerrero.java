package clases;

import interfaces.FormaLuchar;
import interfaces.FormaSaludar;

public class Guerrero {
	
	FormaSaludar formasaludar;
	
	FormaLuchar formaluchar;
	
	//1
	
	public Guerrero(FormaSaludar formasaludar, FormaLuchar formaluchar) {
		
		this.formasaludar = formasaludar;
		
		this.formaluchar = formaluchar;
		
	}
	
	public Guerrero () {
		
		
	}
	
	void saludar() {
		
		formasaludar.saludar(this);
		
	}
	
	public void luchar() {
		
		formaluchar.luchar(this);
		
	}
	
	public void display() {
		
		System.out.println("El guerrero es un " + tipoGuerrero());
		
		saludar();
		
		luchar();
		
		System.out.println();
		
	}
	
	public String tipoGuerrero() {
		
		if (this instanceof GuerreroBarbaro) {
			
			return "Barbaro";
			
		}
		
		else if (this instanceof GuerreroNinja) {
			
			return "Ninja";
			
		}
		
		else {
			
			return "Samurai";
			
		}
			
		
	}

}
