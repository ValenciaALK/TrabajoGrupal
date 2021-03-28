package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre.................: ");
		String nombre = sc.nextLine();
		
		System.out.print("Carrera [DS/RC/DG].....: ");
		String carrera = sc.nextLine();
		
		System.out.print("Ingrese turno [M/T/N]..: ");
		String turno = sc.nextLine();
		
		int monto = 0;
		float descuento = 0;
		
		if (carrera.equals("DS") || carrera.equals("ds")) {
			carrera = "Desarrollo de Software";
			monto = 1500;
		}
		
		else if (carrera.equals("RC") || carrera.equals("rc")) {
			carrera = "Redes y Conectividad";
			monto = 1400;
		}
		
		else if (carrera.equals("DG") || carrera.equals("dg")) {
			carrera = "Diseño Gráfico";
			monto = 1300;
		}
		else {
			carrera = "Valor ingresado es incorrecto";
			monto = 0;
		}
			
		if (turno.equals("M") || turno.equals("m")) {
			turno = "Mañana";
			descuento = monto * 0.10f;
			
		}
		else if (turno.equals("T") || turno.equals("t")) {
				turno = "Tarde";
				descuento = monto *0.20f;
				
		}
		else if (turno.equals("N") || turno.equals("n")) {
				turno = "Noche";
				descuento = monto * 0.15f;
				
				
		}
		else {
			turno = "Turno desconocido";
			monto = 0;
		}
		 
		float total_p = monto - descuento;
		float cambio = total_p / 3.33f;
		
			
		System.out.println("\n======== Resultados ========");
		System.out.println("Nombre..........: " + nombre);
		System.out.println("Carrera.........: " + carrera);
		System.out.println("Monto...........: " + monto);
		System.out.println("Turno...........: " + turno);
		System.out.println("Descuento.......: " + df.format(descuento));
		System.out.println("Total a pagar...: S/" + df.format(total_p));
		System.out.println("Equivalente.....: $" + df.format(cambio));


	}

}
