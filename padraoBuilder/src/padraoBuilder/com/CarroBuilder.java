package padraoBuilder.com;

public class CarroBuilder {

	private Carro carro;
	
	public CarroBuilder() {
		this.carro = new Carro();
	}
	
	public CarroBuilder definirMotor(Motor motor) {
		this.carro.setMotor(motor);
		return this;
	}
	
	public CarroBuilder definirTransmissao(Transmissao transmissao) {
		this.carro.setTrasmissao(transmissao);
		return this;
	}
	
	public CarroBuilder definirCor(Cor cor) {
		this.carro.setCor(cor);
		return this;
	}
	
	public CarroBuilder definirOpcinais(Opcional opcionais) {
		this.carro.getOpcionais().add(opcionais);
		return this;
	}
	
	public Carro build() {
		Carro c = this.carro;
		this.carro = new Carro();
		return c;
	}
}
