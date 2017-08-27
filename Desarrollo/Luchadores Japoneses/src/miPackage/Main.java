package miPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			File entrada = new File("entrada.in");
			File salida = new File("salida.out");

			LuchadoresJaponeses lucha = new LuchadoresJaponeses(entrada, salida);
			lucha.resolver();
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el archivo de entrada entrada.in");
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Error al crear el archivo de salida salida.out");
			e1.printStackTrace();
		}

	}
}
