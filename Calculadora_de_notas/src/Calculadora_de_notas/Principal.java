package Calculadora_de_notas;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de notas a ingresar: ");
		int cantidadNotas = tec.nextInt();

		double[] notas = new double[cantidadNotas];
		Metodos.ingresarNotas(notas);

		double promedio = Metodos.obtenerPromedio(notas);
		double notaMasAlta = Metodos.obtenerNotaMasAlta(notas);
		double notaMasBaja = Metodos.obtenerNotaMasBaja(notas);

		System.out.println("El promedio es: " + promedio);
		System.out.println("La nota más baja es: " + notaMasBaja);
		System.out.println("La nota más alta es: " + notaMasAlta);
	}
} // FINAL CLASS