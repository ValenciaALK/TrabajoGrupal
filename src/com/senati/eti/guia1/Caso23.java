package com.senati.eti.guia1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
	    System.out.print("Ingrese nombre del producto...: ");
	    String producto = sc.nextLine();
	    
	    System.out.print("Ingrese precio................: ");
	    float precio = sc.nextFloat();
	    
	    System.out.print("Ingrese cantidad..............: ");
	    int cantidad = sc.nextInt();
	    
	    float importe = precio * cantidad;
	    float igv = importe * 0.18f;
	    float descuento = importe * 0.03f;
	    float total = importe - descuento + igv;
	    
	    System.out.println("\n======== Resultados ========");
	    System.out.println("Producto.....: " + producto);
	    System.out.println("Importe......: " + "S/. " + df.format(importe));
	    System.out.println("IGV..........: " + "S/. " + df.format(igv));
	    System.out.println("Descuento....: " + "S/. " + df.format(descuento));
	    System.out.println("Total........: " + "S/. " + df.format(total));
	    

	}

}
