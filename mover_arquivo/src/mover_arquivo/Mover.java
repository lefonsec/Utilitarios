package mover_arquivo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Mover {

	public static void main(String[] args) {

		String sourcePath = "E:\\source location\\delftstack.txt";
		String destinationPath = "E:\\destination location\\";
		File sourceFile = new File(sourcePath); 
		File destinationFile = new File(destinationPath + sourceFile.getName());
		try {
			Files.copy(sourceFile.toPath(), destinationFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println(e); 
		}
	}
}
