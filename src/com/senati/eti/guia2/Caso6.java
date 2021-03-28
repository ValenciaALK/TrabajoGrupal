package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int sueldo = 0;
		float impuesto = 0;
		
		
		System.out.print("Ingrese sueldo....: ");
		sueldo = sc.nextInt();
		
		if (sueldo > 2800)
			impuesto = sueldo * 0.05f;
		else
			impuesto = sueldo * 0.02f;
			
        System.out.println("\n======== Resultados ========");
        System.out.println("Impuesto calculado....: " + df.format(impuesto));

	}

}
