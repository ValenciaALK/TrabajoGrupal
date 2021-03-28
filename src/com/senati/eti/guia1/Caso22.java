package com.senati.eti.guia1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombres y Apellidos del alumno(a): ");
		String nombre = sc.nextLine();
		
		System.out.print("Nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Nota 3: ");
		float nota3 = sc.nextFloat();
		
		float promedio = (float)(nota1 * 0.20 + nota2 * 0.30 + nota3 * 0.50);
		
		System.out.println("\n===================== Resultados =====================");
		System.out.println("Promedio del alumno(a) " + nombre + " es: " + df.format(promedio));
		

	}

}
