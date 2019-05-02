package factorias;

import java.time.DayOfWeek;
import java.time.LocalDate;

import clases.*;

public class Factoria2 extends FactoriaPrincipal {

	private Factoria2() {

	}

	private static final Factoria2 factoria2 = new Factoria2();

	public static Factoria2 getFactoria2() {

		return factoria2;

	}

	@Override
	public Guerrero crear_guerrero(int fases) {

		if (LocalDate.now().getDayOfWeek() == DayOfWeek.MONDAY) {

			return new GuerreroSamurai("Keanu Reeves");

		}

		else {

			return new GuerreroBarbaro("Conan");

		}

	}

}
