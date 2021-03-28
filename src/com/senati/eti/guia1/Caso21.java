package com.senati.eti.guia1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresos: ");
		float ingresos = sc.nextFloat();
		
		System.out.print("Ganancia Neta: ");
		float gananciaNeta = sc.nextFloat();
		
		float gasto = (float) ((ingresos - gananciaNeta) * 0.88);
		
		System.out.println("\n=============== Resultados ===============");
		System.out.println("Gasto.....................: " +"S/. " + df.format(gasto));

	}

}
