package com.senati.eti.model.guia5;

public class Publicación {
	//Atributos
	private String titulo;
	private String autor;
	private String tipo;
	
	// Gatters and Setters
	public String getTitulo() {
		return this.titulo;
		
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
	}
	public String getAutor() {
		return this.autor;
		
	}
	public void setAutor(String autor) {
		this.autor = autor;
		
	}
	public String getTipo() {
		return this.tipo;
		
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
		
	}
	public Publicación(String titulo, String autor, String tipo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
	}
	// Contructores
	public Publicación() {
		super();
	}
	
	public String MostrarTipo() {
		
		String valor = "Libro";
		if (this.tipo.equals("2")) {
			valor = "Revista";
			return valor;
		}
		return valor;
	
		
	}

}
