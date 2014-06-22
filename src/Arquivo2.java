import javax.swing.text.ChangedCharSetException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by luizcarlos on 21/06/14.
 */
public class Arquivo2 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("files/texto.txt");


        //java 6
        /*BufferedWriter bufferedWriter = null;
        try
        {
            bufferedWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
            bufferedWriter.write("Luiz\n");
            bufferedWriter.write("Carlos\n");
            bufferedWriter.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            if( bufferedWriter != null){
                bufferedWriter.close();
            }
        }*/

        //java 7
        //Escrita
        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8))
        {
            bufferedWriter.write("Luiz\n");
            bufferedWriter.write("Carlos\n");
            bufferedWriter.write("Gonçalves dos Anjos");

        }catch (IOException e)
        {
            e.printStackTrace();
        }

        //Leitura
        try(BufferedReader bufferedReader = Files.newBufferedReader(path, StandardCharsets.UTF_8))
        {
            String str;
            do{
                str = bufferedReader.readLine();
                System.out.println("line: " + str);
            }while (str != null);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
