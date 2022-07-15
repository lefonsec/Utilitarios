package com.manipulacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWirterr {

//	private final String SEPARADOR = System.getProperty("File.separador");
	private final String NOME_ARQUIVO = "biv.txt";
	private final String CAMINHO =  "D:\\workspace\\" + NOME_ARQUIVO;

	private File file = new File(CAMINHO);
	private FileWriter writer = null;
	private BufferedWriter bufferedWriter = null;

	public boolean openFile() {
		try {
			this.writer = new FileWriter(file, true);
			this.bufferedWriter = new BufferedWriter(this.writer);
			System.out.println("chegou aqui");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean closeFile() {
		try {
			this.bufferedWriter.flush();
			this.writer.flush();
			this.bufferedWriter.close();
			this.writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean gravaLinha(String linha) {
		try {
			this.bufferedWriter.write(linha);
			this.bufferedWriter.newLine();
			this.bufferedWriter.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}

}
