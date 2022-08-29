package contadorDeLinhas;

import java.io.FileReader;
import java.io.LineNumberReader;

public class Contador {
		
	public static void main(String[] args) {
		LineNumberReader lineNumberReader = null;
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader("D:\\arq\\fiel.txt");
			lineNumberReader = new LineNumberReader(fileReader);
			String line;
			
			while((line =lineNumberReader.readLine()) != null) {
				lineNumberReader.skip(Long.MAX_VALUE);
				int lineNumber =lineNumberReader.getLineNumber();
			
				System.out.println(lineNumber + "  " + line);
			}
			fileReader.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
