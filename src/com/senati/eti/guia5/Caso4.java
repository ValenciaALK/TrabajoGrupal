package com.senati.eti.guia5;
import java.util.ArrayList;
import java.util.Scanner;

import com.senati.eti.model.guia5.Publicación;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Publicación> arrPublicacion = new ArrayList<Publicación>();
		
		// Forma 2: Crear el objeto de tipo Publicacion (Tipado con la clase Publicación)
		
		Publicación publi1 = new Publicación("Los perros Hambrientos", "Ciro Alegría", "1");
		Publicación publi2 = new Publicación("Tradiciones peruanas", "Ricardo Palma", "1");
		Publicación publi3 = new Publicación("Informatica Global", "Bill Gates", "2");
		Publicación publi4 = new Publicación("Los Heraldos Negros", "César Vallejo", "1");
		Publicación publi5 = new Publicación("Rev. Dig. Merca2.0", "Mark Zuckerberg", "2");
		
		
		arrPublicacion.add(publi1);
		arrPublicacion.add(publi2);
		arrPublicacion.add(publi3);
		arrPublicacion.add(publi4);
		arrPublicacion.add(publi5);
		
		System.out.println("\n LISTA DE DATOS REGISTRADOS");
		System.out.println("=========================================================");
		String patron = "%-4s %-25s %-18s %-18s";
		
		System.out.println(String.format(patron, "N.", "Título", "Autor", "tipo"));
		System.out.println(String.format(patron, "==", "------", "------", "------"));
		
		for (int x = 0; x < arrPublicacion.size();x++)
			System.out.println(String.format(patron, (x + 1), 
					arrPublicacion.get(x).getTitulo(),
					arrPublicacion.get(x).getAutor(),
					arrPublicacion.get(x).MostrarTipo()));
	}

}

