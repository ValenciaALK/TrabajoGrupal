package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero 1....: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 2....: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 3....: ");
		int n3 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 4....: ");
		int n4 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2 && n1 == n3 && n1 == n4)
			estado = "Los cuatro n�meros son iguales";
		else if (n1 < n2 && n1 < n3 && n1 < n4)
			estado = "El primer n�mero " + n1 + " es menor";
		else if (n2 < n1 && n2 < n3 && n2 < n4)
			estado = "El segundo n�mero " + n2 + " es menor";
		else if (n3 < n1 && n3 < n2 && n3 < n4)
			estado = "El tercer n�mero " + n3 + " es menor";
		else
			estado = "El cuarto n�mero " + n4 + " es menor";
		
		System.out.println("\n======== Resultados ========");
		System.out.println("Estado....: " + estado);
		



	}

}
