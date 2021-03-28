package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Alumno...............: ");
		String nombre = sc.nextLine();
		
		System.out.print("Nota 1...............: ");
		int nota1 = sc.nextInt();
		
		System.out.print("Nota 2...............: ");
		int nota2 = sc.nextInt();
		
		System.out.print("Asistencia [1-12]....:");
		int na = sc.nextInt();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f;
		float pa = na / 12;
		
		String estado = "Desaprobado";
		if (promedio >= 11 && pa >= 0.7)
			estado = "Aprobado";
		
		System.out.println("\n======== Resultados ========");
		System.out.println("Alumno........: " + nombre);
		System.out.println("Promedio......: " + df.format(promedio));
		System.out.println("Asistencia....: " + df.format(pa * 100) + "%");
		System.out.println("Estado........: " + estado);

	}

}
