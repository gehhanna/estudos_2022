package com.hackaton.vetores.vetorAluguel.entities;

public class Estudante {

	private String nome;
	private String mail;
	
	public Estudante(String nome, String mail ) {
		
		this.nome = nome;
		this.mail = mail;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
