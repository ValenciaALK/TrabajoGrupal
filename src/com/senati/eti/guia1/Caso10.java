package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso10 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Radio: ");
			int radio = sc.nextInt();
			
			
			float area = (float) 3.1416 * (int)Math.pow(radio,2);
			float perimetro =(float)((float) 2 * 3.1416 * (radio));
			
			System.out.println("\n======== Resultados ========");
			System.out.println("Área del círculo....: " + area);
			System.out.println("Perímetro...........: " + perimetro);


	}

}
