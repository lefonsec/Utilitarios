package file.com;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Escritor {

  public static void main(String[] args) throws IOException {

      Path path = Paths.get("D:\\arq\\fiel.txt");
      writeBomFile(path, "Áurea Évora Ícaro Óbolo Única Ânfora Ênfase Ônfalo");

  }

  private static void writeBomFile(Path path, String content) {
        // Java 8 default UTF-8
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            bw.write("\ufeff");
            bw.write(content);
            bw.newLine();
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  
}