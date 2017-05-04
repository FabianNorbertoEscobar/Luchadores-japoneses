package MiPackage;

import java.io.IOException;
import java.util.Scanner;

public class Test {

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
			if (LuchadoresJaponeses.compararSalida("../Lote de Prueba/Salida Esperada/" + archivo + ".out")) {
				
				System.out.println("La salida esperada NO es correcta");
			}
			else {
				System.out.println("La salida esperada ES correcta");
			}
		} 
		catch (IOException e) {
			System.out.println("Error al abrir el archivo de salida");
			System.exit(0);
		}
		
		scan.close();
	}
}
