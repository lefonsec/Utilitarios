package com.detail;

public class Detalhe {

	private String codDestino;
	private String dataReferencia;
	private String dataHora;
	private String concentID;
	private String idEtapa;

	public String getCodDestino() {
		return codDestino;
	}

	public void setCodDestino(String codDestino) {
		this.codDestino = codDestino;
	}

	public String getDataReferencia() {
		return dataReferencia;
	}

	public void setDataReferencia(String dataReferencia) {
		this.dataReferencia = dataReferencia;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getConcentID() {
		return concentID;
	}

	public void setConcentID(String concentID) {
		this.concentID = concentID;
	}

	public String getIdEtapa() {
		return idEtapa;
	}

	public void setIdEtapa(String idEtapa) {
		this.idEtapa = idEtapa;
	}

	// metodo vai gerar a sequencia do arquivo
	@Override
	public String toString() {
		return codDestino + dataReferencia + dataHora + concentID + idEtapa;
	}

}
