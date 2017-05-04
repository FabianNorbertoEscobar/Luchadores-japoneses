package MiPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuchadoresJaponeses {

static int cantidadLuchadores;
	
	static List<Luchador> luchadores;
	
	static int dominados[];
	
	public static void inicializarVector(int[] v) {
		
		for (int i = 0; i < v.length; i++) {
			v[i] = 0;
		}
	}
	
	public static void cargarLuchadores(String path) throws FileNotFoundException, IOException {

		FileReader file = new FileReader(path);
		Scanner scan = new Scanner(file);
		
		luchadores = new ArrayList<Luchador>();
		
		cantidadLuchadores = scan.nextInt();
		
		for (int i = 0; i < cantidadLuchadores; i++) {
			
			Luchador luchador = new Luchador(i);
			luchador.setPeso(scan.nextDouble());
			luchador.setAltura(scan.nextDouble());
			
			luchadores.add(luchador);
		}
		
		scan.close();
	}
	
	public static void contarDominados() {
		
		dominados = new int[cantidadLuchadores];
		inicializarVector(dominados);
		
		for (Luchador luchador: luchadores) {
			for (Luchador rival: luchadores) {
				if (luchador.domina(rival)) {
					dominados[luchador.getNumero()] ++;
				}
			}
		}
	}
	
	public static boolean compararSalida(String path) throws IOException {
		
		FileReader file = new FileReader(path);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		
		for (int dominado: dominados) {
			if (dominado != scan.nextInt()) {
				return false;
			}
		}

		scan.close();
		return true;
	}
}
