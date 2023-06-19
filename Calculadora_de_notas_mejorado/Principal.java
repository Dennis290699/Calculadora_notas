package Calculadora_de_notas_mejorado;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		CalculadoraNotas calculadora = new CalculadoraNotas();

		Scanner tec = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de notas a ingresar: ");
		int cantidadNotas = tec.nextInt();

		calculadora.ingresarNotas(cantidadNotas);

		double promedio = calculadora.obtenerPromedio();
		double notaMasAlta = calculadora.obtenerNotaMasAlta();
		double notaMasBaja = calculadora.obtenerNotaMasBaja();

		System.out.println("El promedio es: " + promedio);
		System.out.println("La nota más baja es: " + notaMasBaja);
		System.out.println("La nota más alta es: " + notaMasAlta);

	}

}// FINAL CLASS
