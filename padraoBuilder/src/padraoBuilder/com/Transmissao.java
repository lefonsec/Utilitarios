package padraoBuilder.com;

public class Transmissao {

	private String modo;

	public Transmissao(String modo) {
		super();
		this.modo = modo;
	}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}

	@Override
	public String toString() {
		return "Transmissao [" + modo + "]";
	}

}
