package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {

	@Test
	void CP1() {
		assertFalse(Fecha.validarFecha(1, 1, 0));
	}
	@Test
	void CP2() {
		assertFalse(Fecha.validarFecha(1, 13, 1));
	}
	@Test
	void CP3() {
		assertTrue(Fecha.validarFecha(1, 2, 1));
	}
	@Test
	void CP4() {
		assertTrue(Fecha.validarFecha(1, 7, 1));
	}

}
