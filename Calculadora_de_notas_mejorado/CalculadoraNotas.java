package Calculadora_de_notas_mejorado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CalculadoraNotas {
	private List<Double> notas;

	public CalculadoraNotas() {
		notas = new ArrayList<>();
	}

	public void ingresarNotas(int cantidad) {
		Scanner tec = new Scanner(System.in);
		for (int i = 0; i < cantidad; i++) {
			System.out.print("Ingrese la nota " + (i + 1) + ": ");
			double nota = tec.nextDouble();
			notas.add(nota);
		}
	}

	public double obtenerNotaMasAlta() {
		return notas.stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
	}

	public double obtenerNotaMasBaja() {
		return notas.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
	}

	public double obtenerPromedio() {
		double sum = 0.0;
		for (double nota : notas) {
			sum += nota;
		}
		return sum / notas.size();
	}
} // FINAL CLASS
