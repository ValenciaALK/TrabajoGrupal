package com.senati.eti.guia1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Monto 1: ");
		int monto1 = sc.nextInt();
		
		System.out.print("Monto 2: ");
		int monto2 = sc.nextInt();
		
		System.out.print("Monto 3: ");
		int monto3 = sc.nextInt();
		
		float r1 = (monto1 / 5) + (monto2 * 0.20f);
		float r2 = ((monto3 / 2) * 1.60f);
		float r3 = (monto1 + monto2 + monto3) * 0.92f;
		
		System.out.println("\n======== Resultados ========");
		System.out.println("Resultado 1: " + df.format(r1));
		System.out.println("Resultado 2: " + df.format(r2));
		System.out.println("Resultado 3: " + df.format(r3));	

	}

}
