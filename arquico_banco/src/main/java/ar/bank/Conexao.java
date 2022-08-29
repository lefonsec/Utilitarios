package ar.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Conexao {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/arquivosfood","root", "");
			ResultSet sets = conn.createStatement().executeQuery("SELEC * FROM cleinte");
			while (sets.next()) {
			
				
				
			}
		} catch (ClassNotFoundException e) {

			System.out.println("banco de dados não encontrado");
		}catch (Exception e) {
			System.out.println("erro ao acessar o banco " + e.getMessage());
		}

	}

}
