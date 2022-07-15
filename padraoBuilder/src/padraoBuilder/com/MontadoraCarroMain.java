package padraoBuilder.com;

public class MontadoraCarroMain {

	public static void main(String[] args) {

		Carro c1,c2,c3;
		
		CarroBuilder builder = new CarroBuilder();
		
		c1 = builder.definirMotor(new Motor("1.6 Turbo"))
				.definirTransmissao(new Transmissao("Automatico"))
				.definirCor(new Cor("Preto"))
				.build();
		
		c2 =  builder.definirMotor(new Motor("2.0 Turbo"))
				.definirTransmissao(new Transmissao("Automatico com borboleta"))
				.definirCor(new Cor("Azul esmeralda"))
				.definirOpcinais(new Opcional("Multimidia"))
				.definirOpcinais(new Opcional("alarme"))
				.build();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
