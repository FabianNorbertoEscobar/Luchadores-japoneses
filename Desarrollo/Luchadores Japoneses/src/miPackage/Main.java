package miPackage;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del archivo de entrada (sin extensión):");
		String archivo = scan.nextLine();
		
		try {
			LuchadoresJaponeses.cargarLuchadores("../Lote de Prueba/Entrada/" + archivo + ".in");
		}
		catch (IOException e) {
			
			System.out.println("Error al abrir el archivo de entrada");
			System.exit(0);
		}
		
		LuchadoresJaponeses.contarDominados();
		
		try {
			LuchadoresJaponeses.crearArchivoSalida("../Lote de Prueba/Salida Producida/" + archivo + ".out");
		} 
		catch (IOException e) {
			System.out.println("Error al crear el archivo de salida");
			System.exit(0);
		}
		
		scan.close();
		
		System.out.println("El archivo de salida ha sido generado exitosamente");
	}

}
