package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Cliente...................: ");
		String nombre = sc.nextLine();
		
		System.out.print("Producto [TB/LT/MN/IM]....: ");
		String producto = sc.nextLine();
		
		System.out.print("Cantidad..................: ");
		int cantidad = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Forma de pago [C1/C2].....: ");
		String pago = sc.nextLine();
		
		int valor = 0;
		float descuento = 0, aumento = 0, importe = 0, total_p = 0;
		
		
		if (producto.equals("TB") || producto.equals("tb")) {
			producto = "Tablet";
			valor = 350;
		}
	
		else if (producto.equals("LT") || producto.equals("lt")) {
			producto = "Laptop";
			valor = 2300;	
		}
	
		else if (producto.equals("MN") || producto.equals("mn")) {
			pago = "Monitor";
			valor = 850;
		}
				
		else if (producto.equals("IM") || producto.equals("im")) {
			producto = "Impresora";
			valor = 680;
			
			}
			
		if (pago.equals("C1") || pago.equals("c1")) {
			pago = "Contado";
			importe = valor * cantidad;
			descuento = importe * 0.05f;
			total_p = importe - descuento;
			
			System.out.println("\n======== Resultados ========");
			System.out.println("Cliente..........: " + nombre);
			System.out.println("Producto.........: " + producto);
			System.out.println("Precio...........: " + valor);
			System.out.println("Cantidad.........: " + cantidad);
			System.out.println("Importe..........: " + df.format(importe));
			System.out.println("Forma de pago....: " + pago);
			System.out.println("Descuento........: " + df.format(descuento));
			System.out.println("Total a pagar....: S/." + df.format(total_p));

			
		}
		else if (pago.equals("C2") || pago.equals("c2")) {
			
			pago = "Crédito";
			importe = valor * cantidad;
			aumento = importe * 0.12f;
			total_p = importe + aumento;
			
			System.out.println("\n======== Resultados ========");
			System.out.println("Cliente..........: " + nombre);
			System.out.println("Producto.........: " + producto);
			System.out.println("Precio...........: " + valor);
			System.out.println("Cantidad.........: " + cantidad);
			System.out.println("Importe..........: " + df.format(importe));
			System.out.println("Forma de pago....: " + pago);
			System.out.println("Incremento.......: " + df.format(aumento));
			System.out.println("Total a pagar....: S/." + df.format(total_p));

		}

	}

}
