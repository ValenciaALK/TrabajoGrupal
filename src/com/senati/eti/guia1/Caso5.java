package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer n�mero: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo n�mero: ");
		n2 = sc.nextFloat();
		
		// Operaciones
		
		float promedio = (n1 + n2) / 2;
		float n1au = (float)(n1 * 1.2);
		float n2dis = (float)(n2 * 0.7); 
		
		// Impresi�n
		
		System.out.println("\n=========== Valores Ingresados ===========");
		System.out.println("N�mero 1..........: " + promedio);
		System.out.println("N�mero 2..........: " + n1au);
		System.out.println("N�mero 3..........: " + n2dis);

	}

}
