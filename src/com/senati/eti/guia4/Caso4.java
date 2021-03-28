package com.senati.eti.guia4;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int par = 0, impar = 0, i = 0;
		float promedio = 0;
		
		
		
		while (i < 5) {
			System.out.print("Ingrese número "+ (i+1) +": ");
			i++;
			
			int n = sc.nextInt();
			if ( (n % 2) == 0) {
				par++;
			}
			else {
				impar++;
			}
			promedio = promedio + n;
		}
		
		System.out.println("\nCantidad de números pares....: " + par);
		System.out.println("Cantidad de números impares..: " + impar);
		System.out.println("Promedio.....................: " + (promedio / 5f));
		


	}

}
