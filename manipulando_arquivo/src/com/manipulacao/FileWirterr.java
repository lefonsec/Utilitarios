package com.manipulacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileWirterr {

	private static final String NOME_ARQUIVO = "bigv2" + (new SimpleDateFormat("yyyyMMdd")).format(new Date()) + ".txt";
	private static final String CAMINHO = File.separator + "arq" + File.separator + "ziapado" + File.separator
			+ NOME_ARQUIVO;

	private File file = new File(FileWirterr.CAMINHO);
	private FileWriter writer = null;
	private BufferedWriter bufferedWriter = null;

	public boolean openFile() {
		try {
			this.writer = new FileWriter(file, false);
			this.bufferedWriter = new BufferedWriter(this.writer);
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
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

}
