package brancos.epa�o;

public class Branco {

	private String concentID;
	
	//pega o tamanho do banco e prenche com  espa�o em branco a direita;
	public void espa�oBranco(String espaco) {
	
		while(espaco.length() != 5) {
			espaco = espaco.concat(" ");
		}
		this.setConcentID(espaco);
	}

	
	public String getConcentID() {
		return concentID;
	}

	public void setConcentID(String concentID) {
		this.concentID = concentID;
	}
}
