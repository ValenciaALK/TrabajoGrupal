package com.senati.eti.guia4;
import java.util.ArrayList;
import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> arrNombre = new ArrayList<String>();
	ArrayList<Integer> arrEdad = new ArrayList<Integer>();
	
	String rp = "S", nombre = "";
	int num_reg = 0, edad = 0;
	
	while (rp.equals("S") || rp.equals("s")) {
		num_reg++;
		
		System.out.println("REGISTRO " + num_reg);
		System.out.println("----------");
		
		System.out.print("Nombre....: ");
		nombre = sc.nextLine();
		
		System.out.print("Edad......: ");
		edad = sc.nextInt();
		
		arrNombre.add(nombre);
		arrEdad.add(edad);
		
		sc.nextLine();
		
		rp = "";
		
		while (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
			System.out.print("¿Continuar con otro registro <S/N>: ");
			rp = sc.nextLine();
			
			if (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
				System.out.println("Solo escriba S o N");
				
			}
		}
	}

	// Impresion de los datos registrados
	System.out.println("\nLISTA DE DATOS REGISTRADOS");
	System.out.println("--------------------------");
	
	System.out.println("Nombre \t\tEdad \t\tEstado \t\t\tEtapa");
	System.out.println("*************************************");
	
	for (int i = 0; i < arrNombre.size(); i++)
		System.out.println(arrNombre.get(i) + "\t\t" +
						   arrEdad.get(i) + " años\t\t" +
						   VerEstado(arrEdad.get(i)) + " \t\t" +
						   VerMensaje(arrEdad.get(i)));

	}
// Métodos (Funciones) que devuelven un valor
	public static String VerEstado(int edad) {
		String estado = "Menor de edad";
		
		if (edad >= 18) estado = "Mayor de edad";
		return estado;
	} 
	public static String VerMensaje(int edad) {
		// Hasta 10		: Niñez
		// Hasta 17		: Adolescente
		// Hasta 24		: juventud
		// Hasta 59		: Adulto
		// De 60 a más	: Adulto mayor
		String mensaje = "";
		
		if (edad >= 0 && edad <=10) mensaje = "Niñez";
		else if (edad >10 && edad <=17) mensaje = "Adolescente";
		else if (edad >17 && edad <=24) mensaje = "Juventud";
		else if (edad >24 && edad <=59) mensaje = "Adulto";
		else mensaje = "Adulto Mayor";
		
		return mensaje;
	}
}
