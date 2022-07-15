package principal;
public class Mains {

	public static void main(String[] args) {

		int numero = 4;
		String mensagem = "mensagem";
		String str2 = String.format ("|%10d|" , 101); // Especificando o comprimento do inteiro
		String str3 = String.format ("|%-10d|" , 101); // Justificativa à esquerda dentro da largura especificada
		String form = String.format("|%10s|", mensagem);//formataou espaço em branco a esquerda;
		String form2 = String.format("|%-10s|", mensagem);//formataou espaço em branco a esquerda;
		String format = String.format("|%06d|", numero);// formatou 5 zeros a esquerda + o numero;
		
		String s2 = String.valueOf(numero);// substitui para string;
		
		if(numero <5) {
			System.out.println(format);
			System.out.println(form);
			System.out.println(str2);
			System.out.println(str3);
			System.out.println(form2);
		}

	}

}
