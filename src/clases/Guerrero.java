package clases;

import interfaces.FormaLuchar;
import interfaces.FormaSaludar;

public class Guerrero {
	
	String nombre;
	
	FormaSaludar formasaludar;
	
	FormaLuchar formaluchar;
	
	public Guerrero(String nombre, FormaSaludar formasaludar, FormaLuchar formaluchar) {
		
		this.nombre = nombre;
		
		this.formasaludar = formasaludar;
		
		this.formaluchar = formaluchar;
		
	}
	
	void saludar() {
		
		formasaludar.saludar(this);
		
	}
	
	void luchar() {
		
		formaluchar.luchar(this);
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void display() {
		
		System.out.println(getNombre() + " es un " + tipoGuerrero());
		
		saludar();
		
		luchar();
		
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
