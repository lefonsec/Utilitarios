package com.detail;

public class Tabela {

	private String nome;
	private String idade;
	private String formatos;
	

	public Tabela(String nome, String idade, String formatos) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.formatos = formatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getFormatos() {
		return formatos;
	}

	public void setFormatos(String formatos) {
		this.formatos = formatos;
	}	

}
