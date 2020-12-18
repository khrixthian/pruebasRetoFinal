package PruebaTestGradlePullRequest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadora {
	int resultado;
	int resulesperado;
	Calculadora calcu = new Calculadora();

	// comentario 2
	@Test
	public void SumaTest() {
		resultado = calcu.suma(5, 6);
		resulesperado = 11;

		assertEquals(resultado, resulesperado);
	}

	@Test
	public void RestaTest() {
		resultado = calcu.resta(9, 6);
		resulesperado = 3;

		assertEquals(resultado, resulesperado);
	}

}
