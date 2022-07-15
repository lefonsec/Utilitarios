package file.com;

public class Layout {

	private String nome;
	private String Sobrenome;
	private String idade;

	
	
	public Layout(String nome, String sobrenome, String idade) {
		super();
		this.nome = nome;
		Sobrenome = sobrenome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return  nome + Sobrenome + idade ;
	}

	
}
