package Calculadora_de_notas;

import java.util.Scanner;

class Metodos {
	public static void ingresarNotas(double[] notas) {
		Scanner tec = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Ingrese la nota " + (i + 1) + ": ");
			notas[i] = tec.nextDouble();
		}
	}

	public static double obtenerNotaMasAlta(double[] notas) {
		double maxNota = notas[0];
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] > maxNota) {
				maxNota = notas[i];
			}
		}
		return maxNota;
	}

	public static double obtenerNotaMasBaja(double[] notas) {
		double minNota = notas[0];
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] < minNota) {
				minNota = notas[i];
			}
		}
		return minNota;
	}

	public static double obtenerPromedio(double[] notas) {
		double sum = 0.0;
		for (double nota : notas) {
			sum += nota;
		}
		return sum / notas.length;
	}
}// FINAL CLASS
