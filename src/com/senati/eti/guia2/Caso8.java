package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota....: ");
		int n1 = sc.nextInt();
		
		String estado = "";
		
		if (n1 >= 0 && n1 <= 7)
			estado = "Sin palabras";
		else if (n1 >= 8 && n1 <= 10)
			estado = "Malo";
		else if (n1 >= 11 && n1 <= 14)
			estado = "Regular";
		else if (n1 >= 15 && n1 <= 17)
			estado = "Notable";
		else if (n1 >= 18 && n1 <= 20)
			estado = "Excelente";
		
		System.out.println("========= Resultados ========");
		System.out.println("Estado obtenido....: " + estado);

	}

}
