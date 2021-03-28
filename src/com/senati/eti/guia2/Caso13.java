package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Primer número.....: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo número....: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Número [1-6]......: ");
		int n = sc.nextInt();
		
		String op = "";
		float rpta = 0;
		
		switch (n) {
			case 1:
			op = "Suma";
			rpta = n1 + n2;
			break;
		    case 2:
		    	op = "Resta";
		    	rpta = n1 - n2;
		    	break;
		    case 3:
				op = "Producto";
				rpta = n1 * n2;
				break;
		    case 4:
				op = "División";
				if (n1 == 0 || n2 == 0)
					op = "No se puede dividir entre cero‬";
				else
					rpta = n1 / n2;
				break;
		    case 5:
				op = "Resto";
				if (n1 == 0 || n2 == 0)
					op = "No es posible hallar el resto entero‬";
				else
					rpta = n1 % n2;
				break;
		    case 6:
				op = "Promedio";
				rpta = (n1 + n2) / 2;
				break;
		    default:
		    	op = "Desconocido";
		}
		System.out.println("\n======== Resultados ========");
		System.out.println("Número 1.....: " + n1);
		System.out.println("Número 2.....: " + n2);
		System.out.println("Operación....: " + op);
		System.out.println("Resultado....: " + df.format(rpta));

	}

}
