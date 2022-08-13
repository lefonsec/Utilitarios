package com.detail;

public class Detalhe {

	private String nome;
	private String idade;
	private String formatos;

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

	// metodo vai gerar a sequencia do arquivo
	@Override
	public String toString() {
		return  nome + "|" + idade + "|" + formatos;
	}
	
}
