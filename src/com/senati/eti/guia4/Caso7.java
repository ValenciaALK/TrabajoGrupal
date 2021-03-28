package com.senati.eti.guia4;
import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] numero = new int[3][4];
		int num_mayor = 0, num_menor = 0, total = 0;
		float prom = 0;
		
		System.out.println("Lectura de números");
		System.out.println("------------------");
		
		for (int f = 0; f < numero[0].length; f++) {
			
			if (f == 3) {
				break;
			}
			
			System.out.println("Datos de la fila "+ (f + 1));
			System.out.println("---------------------");
			
			for (int c=0; c < numero[0].length; c++) {
				System.out.print("Número " + (c+1) + " : ");
				numero[f][c] = sc.nextInt();
				prom = prom + numero[f][c];
				total++;
				
				if (f == 0 && c == 0) {
					num_mayor = numero[0][0];
					num_menor = numero[0][0];
				}
				if (numero[f][c] > num_mayor) num_mayor = numero[f][c];
				if (numero[f][c] < num_menor) num_menor = numero[f][c];
			}

			
		}
		System.out.println("\n-- Resultados -- ");
		System.out.println("----------------");
		System.out.println("Número mayor............: " + num_mayor);
		System.out.println("Número menor............: " + num_menor);
		System.out.println("Promedio................: " + (prom/total));


	}

}
