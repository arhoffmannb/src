import javax.xml.crypto.Data;
import java.io.*;

public class Main {
    static String rutaArchivo = "";

    public static void main(String[] argumentos){

        rutaArchivo = argumentos[0];
        Main algo = new Main();


    }

    public Main(){
        File archivo = new File(rutaArchivo);
        try{
            FileInputStream fileInputStream = new FileInputStream(archivo);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int valor = 0;

            while((valor = bufferedReader.read())!= -1){
                char caracter = (char)valor;
                System.out.print(caracter);
            }

        } catch (IOException ioe){
            System.out.print(":(");
        }
    }
}
