import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Arquivo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Main");
		
		//caminho absoluto.
		//Path path = Paths.get("/Users/luizcarlos/Desktop/files/texto.txt");
		//caminho relativo
		Path path = Paths.get("files/texto.txt");
		System.out.println("absolut-path: " + path.toAbsolutePath());
		System.out.println("root: " + path.getRoot());
		System.out.println("file-name: " + path.getFileName());
		System.out.println("parent: " + path.getParent());
		
		//cria diretório
		Files.createDirectories(path.getParent());
		StringBuilder str = new StringBuilder("Luiz Carlos Gonçalves dos Anjos\n");
		str.append("Linha2\n").append("Linha3\n").append("Linha4");
		
		//cria, limpa e escreve;
		Files.write(path, str.toString().getBytes());
		
		
		byte[] bytes = Files.readAllBytes(path);
		System.out.println("Conteúdo do arquivo: " + new String(bytes));
	}

}
