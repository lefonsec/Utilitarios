package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zip {

	
	public void zipar(File path) throws IOException {
		File[] files = path.listFiles();
		if(files.length == 0) {
			throw new IllegalArgumentException("no files in path " + path.getAbsolutePath());
		}
		FileOutputStream fos = new FileOutputStream("D:\\arq\\");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		
		for(File zipThis : files) {
			FileInputStream input = new FileInputStream(zipThis);
			ZipEntry zipEntry = new ZipEntry(zipThis.getName());
			zipOut.putNextEntry(zipEntry);
			
			byte[] bytes = new byte[2048];
			boolean lenght;
			while(lenght = input.read(bytes) >= 0) {
				zipOut.write(bytes, 0 ,lenght);
			}
		}
	}
}
