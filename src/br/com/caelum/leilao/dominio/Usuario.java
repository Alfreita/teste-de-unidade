package br.com.caelum.leilao.dominio;

public class Usuario {

	private int id;
	private String nome;



	public Usuario(String nome) {
		this.id = 0;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}



}
