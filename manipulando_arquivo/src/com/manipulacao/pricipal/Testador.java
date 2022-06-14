package com.manipulacao.pricipal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.detail.Detalhe;
import com.detail.Tabela;
import com.manipulacao.FileWirterr;

public class Testador {

	private String dataExecucao;
	private String dataProc;
	FileWirterr gravar = new FileWirterr();
	private String conteudo = "consentid;urn:12345678; user:123456;4fgtr67867t";

	public void principal() {

		try {
			this.dataProc = subtrairData();
			this.gravar.openFile();
			this.registro();
			this.gravar.closeFile();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	private String subtrairData() throws ParseException {
		SimpleDateFormat formatador = new SimpleDateFormat("yyyyMMdd");
		Calendar subtrair = Calendar.getInstance();
		subtrair.setTime(formatador.parse(this.dataExecucao));
		subtrair.add(Calendar.DAY_OF_MONTH, -1);
		return formatador.format(subtrair.getTime());

	}

	private boolean registro() {
		List<Tabela> listaRegistro = new ArrayList<>();
		this.gravarRegistro(listaRegistro);

		return true;
	}

	private boolean gravarRegistro(List<Tabela> listaOf) {

		for (Tabela tabela : listaOf) {
			Detalhe detalhe = new Detalhe();
			detalhe.setCodDestino("1098");
			detalhe.setDataReferencia(dataProc);
			detalhe.setDataHora(tabela.getFormatos());

			this.gravar.gravaLinha(detalhe.toString());
		}

		return true;
	}

	//pega a posição da string e corta a string.
	public String PegaConsentId() {
		System.out.println(conteudo.lastIndexOf("urn"));
		System.out.println(conteudo);

		return conteudo.substring(conteudo.lastIndexOf("urn"), 22);
	}
}
