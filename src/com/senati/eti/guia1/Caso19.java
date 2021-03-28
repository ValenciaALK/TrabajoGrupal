package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1: ");
		float lado1 = sc.nextFloat();
		
		System.out.print("Ingrese lado 2: ");
		float lado2 = sc.nextFloat();
		
		System.out.print("Ingrese lado 3: ");
		float lado3 = sc.nextFloat();
		
		float perimetro = lado1 + lado2 + lado3;
		
		System.out.println("\n========= Resultados ========");
		System.out.println("Perímetro del triángulo: " + perimetro);


	}

}
