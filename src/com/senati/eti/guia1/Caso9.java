package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1 : ");
		int lado1 = sc.nextInt();
		
		System.out.print("Ingrese lado 2 : ");
		int lado2 = sc.nextInt();
		
		int area = lado1 * lado2;
		int perimetro = 2 * (lado1 + lado2);
		
		System.out.println("\n======== Resultados ========");
		System.out.println("Área del rectángulo....: " + area);
		System.out.println("Perímetro..............: " + perimetro);


	}

}
