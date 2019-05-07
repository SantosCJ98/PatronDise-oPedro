package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lucha.Ninjutsu;
import saludos.Inclinarse;

public class GuerreroNinja extends Guerrero {

	final String nombre;

	final int fuerza;

	final int valentia;

	final String vestimenta;

	final List<String> armas;
	
	public GuerreroNinja() {
		
		super(new Inclinarse(), new Ninjutsu());
		
		nombre = "";
		
		fuerza = 0;
		
		valentia = 0;
		
		vestimenta = "";
		
		armas = new ArrayList<>();
		
	}
	
	

	public GuerreroNinja(Builder builder) {

		nombre = builder.nombre;
		
		fuerza = builder.fuerza;
		
		valentia = builder.valentia;
		
		vestimenta = builder.vestimenta;
		
		armas = builder.armas;

	}
	
	@Override
	public String toString() {
		String resultado = String.format("Nombre: %s.%n", nombre);
		if (fuerza != 0) {
			resultado += String.format("Nivel de fuerza: %s.%n", fuerza);
		}
		if (valentia != 0) {
			resultado += String.format("Nivel de valentía: %s.%n", valentia);
		}
		if (vestimenta != null) {
			resultado += String.format("Vestimenta: %s.%n", vestimenta.toString());
		}
		if (!armas.isEmpty()) {
			resultado += String.format("Armas: %s.%n",
					armas.stream().map(arma -> arma.toString()).collect(Collectors.joining(", ")));
		}
		return resultado;
	}

	public static class Builder {

		final String nombre; // Obligatorio

		int fuerza;

		int valentia;

		String vestimenta;

		List<String> armas = new ArrayList<>();

		public Builder(String nombre) {

			this.nombre = nombre;

		}

		public Builder setFuerza(int fuerza) {
			this.fuerza = fuerza;
			return this;
		}

		public Builder setValentia(int valentia) {
			this.valentia = valentia;
			return this;
		}

		public Builder setVestimenta(String vestimenta) {
			this.vestimenta = vestimenta;
			return this;
		}

		public Builder addArma(String arma) {
			armas.add(arma);
			return this;
		}
		
		public GuerreroNinja build() {
			
			return new GuerreroNinja(this);
			
		}

	}

}
