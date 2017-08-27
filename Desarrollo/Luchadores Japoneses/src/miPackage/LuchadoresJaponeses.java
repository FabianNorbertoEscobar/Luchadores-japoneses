package miPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuchadoresJaponeses extends EjercicioOIA {

	private int cantidadLuchadores;
	private List<Luchador> luchadores;
	private static int dominados[];

	public LuchadoresJaponeses(File entrada, File salida) throws FileNotFoundException, IOException {
		super(entrada, salida);
		this.cargarLuchadores();
	}

	private void cargarLuchadores() throws FileNotFoundException, IOException {
		FileReader file = new FileReader(this.entrada);
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

	private void contarDominados() {
		dominados = new int[cantidadLuchadores];
		for (Luchador luchador : luchadores) {
			for (Luchador rival : luchadores) {
				if (luchador.domina(rival)) {
					dominados[luchador.getNumero()]++;
				}
			}
		}
	}

	private void crearArchivoSalida() throws IOException {
		FileWriter file = new FileWriter(this.salida);
		BufferedWriter buffer = new BufferedWriter(file);

		for (int dominado : dominados) {
			buffer.write(Integer.toString(dominado));
			buffer.newLine();
		}
		buffer.close();
	}

	@Override
	public void resolver() throws FileNotFoundException, IOException {
		this.contarDominados();
		this.crearArchivoSalida();
	}
}