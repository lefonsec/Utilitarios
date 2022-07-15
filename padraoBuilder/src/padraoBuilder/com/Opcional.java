package padraoBuilder.com;

public class Opcional {

	private String item;

	public Opcional(String item) {
		super();
		this.item = item;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Opcional [" + item + "]";
	}
	
	
}
