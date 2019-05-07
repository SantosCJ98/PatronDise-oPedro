package factorias;

import clases.*;

public class Factoria1 extends FactoriaPrincipal {

	private Factoria1() {

	}

	private static final Factoria1 factoria1 = new Factoria1();

	public static Factoria1 getFactoria1() {

		return factoria1;

	}

	@Override
	public Guerrero crear_guerrero(int fases) {

		if (fases == 1 || fases == 2) {

			return new GuerreroNinja();

		}

		else if (fases == 3 || fases == 4) {

			return new GuerreroSamurai();

		}

		else {

			return new GuerreroBarbaro();

		}

	}

}
