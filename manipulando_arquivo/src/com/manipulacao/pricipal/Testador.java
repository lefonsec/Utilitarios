package com.manipulacao.pricipal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

import com.detail.Detalhe;
import com.detail.Tabela;
import com.manipulacao.FileWirterr;

public class Testador {

	private String dataExecucao;
	private String dataProc;
	FileWirterr gravar = new FileWirterr();
	private String conteudo = "consentid;urn:12345678; user:123456;4fgtr67867t";

	public void principal() {

		// this.dataProc = subtrairData();
		gravar.openFile();
		this.registro();
		this.gravar.closeFile();

	}

	private String subtrairData() throws ParseException {
		SimpleDateFormat formatador = new SimpleDateFormat("yyyyMMdd");
		Calendar subtrair = Calendar.getInstance();
		subtrair.setTime(formatador.parse(this.dataExecucao));
		subtrair.add(Calendar.DAY_OF_MONTH, -1);
		return formatador.format(subtrair.getTime());
	}

	private boolean registro() {
		// retorna uma lista
		List<Tabela> listaRegistro = new ArrayList<>();
		listaRegistro.add(new Tabela("arnaldo", "12", "conteudo"));
		listaRegistro.add(new Tabela("MARCELO", "12", "conteudo"));
		listaRegistro.add(new Tabela("aGNALDO", "12", "conteudo"));
		listaRegistro.add(new Tabela("MYLEna TE AMO ", "12", "conteudo"));
		listaRegistro.add(new Tabela("arnaldo", "12", "conteudo"));
		this.gravarRegistro1(listaRegistro);
		return true;
	}

	private boolean gravarRegistro1(List<Tabela> listaRegistro) {

		for (Tabela tabela : listaRegistro) {
			Detalhe detalhe = new Detalhe();
			detalhe.setNome(tabela.getNome());
			detalhe.setIdade(tabela.getIdade());
			detalhe.setFormatos(tabela.getFormatos());

			this.gravar.gravaLinha(detalhe.toString());
		}

		return true;
	}
	
	// pega a posi��o da string e corta a string.
	public String PegaConsentId() {
		System.out.println(conteudo.lastIndexOf("urn"));
		System.out.println(conteudo);

		return conteudo.substring(conteudo.lastIndexOf("urn"), 22);
	}
	
	//metodo para pegar o posi��o em um array
	public void pegaPosica��o() {
		List<Tabela> listaRegistro = new ArrayList<>();
		for(Tabela tabela : listaRegistro) {
			String linha = tabela.toString();
			//tira substitui a barra por espa�o em branco
			linha = linha.replace("\"", "");
			//pega campo pelo divisor.
			String[] col = linha.split(";");
			System.out.println(col[0]);
		}
	}
}
