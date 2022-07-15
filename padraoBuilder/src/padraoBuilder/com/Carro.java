package padraoBuilder.com;

import java.util.ArrayList;
import java.util.List;

public class Carro {

	private Motor motor;
	private Transmissao trasmissao;
	private Cor cor;
	private List<Opcional> opcionais;

	public Carro() {
		opcionais = new ArrayList<Opcional>();
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Transmissao getTrasmissao() {
		return trasmissao;
	}

	public void setTrasmissao(Transmissao trasmissao) {
		this.trasmissao = trasmissao;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public List<Opcional> getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(List<Opcional> opcionais) {
		this.opcionais = opcionais;
	}

	@Override
	public String toString() {
		return "Carro [motor=" + motor + ", trasmissao=" + trasmissao + ", cor=" + cor + ", opcionais=" + opcionais
				+ "]";
	}

	
}
