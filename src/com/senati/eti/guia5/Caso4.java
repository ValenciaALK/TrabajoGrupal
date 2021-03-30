package com.senati.eti.guia5;
import java.util.ArrayList;
import java.util.Scanner;

import com.senati.eti.model.guia5.Publicaci�n;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Publicaci�n> arrPublicacion = new ArrayList<Publicaci�n>();
		
		// Forma 2: Crear el objeto de tipo Publicacion (Tipado con la clase Publicaci�n)
		
		Publicaci�n publi1 = new Publicaci�n("Los perros Hambrientos", "Ciro Alegr�a", "1");
		Publicaci�n publi2 = new Publicaci�n("Tradiciones peruanas", "Ricardo Palma", "1");
		Publicaci�n publi3 = new Publicaci�n("Informatica Global", "Bill Gates", "2");
		Publicaci�n publi4 = new Publicaci�n("Los Heraldos Negros", "C�sar Vallejo", "1");
		Publicaci�n publi5 = new Publicaci�n("Rev. Dig. Merca2.0", "Mark Zuckerberg", "2");
		
		
		arrPublicacion.add(publi1);
		arrPublicacion.add(publi2);
		arrPublicacion.add(publi3);
		arrPublicacion.add(publi4);
		arrPublicacion.add(publi5);
		
		System.out.println("\n LISTA DE DATOS REGISTRADOS");
		System.out.println("=========================================================");
		String patron = "%-4s %-25s %-18s %-18s";
		
		System.out.println(String.format(patron, "N.", "T�tulo", "Autor", "tipo"));
		System.out.println(String.format(patron, "==", "------", "------", "------"));
		
		for (int x = 0; x < arrPublicacion.size();x++)
			System.out.println(String.format(patron, (x + 1), 
					arrPublicacion.get(x).getTitulo(),
					arrPublicacion.get(x).getAutor(),
					arrPublicacion.get(x).MostrarTipo()));
	}

}

