package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import miPackage.LuchadoresJaponeses;

public class TestLuchadores {

	@Test
	public void pruebaCaso00() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/00_CasoEjemplo.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/00_CasoEjemplo.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}
	
	@Test
	public void pruebaCaso01() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/01_UnSoloLuchador.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/01_UnSoloLuchador.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

	@Test
	public void pruebaCaso02() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/02_NadieDominaTodosIguales.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/02_NadieDominaTodosIguales.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

	@Test
	public void pruebaCaso03() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/03_NadieDominaAlgunosIguales.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/03_NadieDominaAlgunosIguales.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

	@Test
	public void pruebaCaso04() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/04_SoloUnoDominaATodos.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/04_SoloUnoDominaATodos.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

	@Test
	public void pruebaCaso05() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/05_SoloUnoEsDominado.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/05_SoloUnoEsDominado.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

	@Test
	public void pruebaCaso06() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/06_CasoFatigaPesoYAlturaExtremos.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/06_CasoFatigaPesoYAlturaExtremos.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

	@Test
	public void pruebaCaso07() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/07_CasoFatigaTodosLosLuchadores.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/07_CasoFatigaTodosLosLuchadores.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

	@Test
	public void pruebaCaso08() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/08_AlgunosDominan.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/08_AlgunosDominan.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

	@Test
	public void pruebaCaso09() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/09_SoloGananPorPeso.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/09_SoloGananPorPeso.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

	@Test
	public void pruebaCaso10() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/10_SoloGananPorAltura.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/10_SoloGananPorAltura.out");
		LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
		lucha.resolver();
	}

}
