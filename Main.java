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
            int contador = 0;
            char caracterCambio = 0;

            while((valor = bufferedReader.read())!= -1){
                if((char)valor !='\n'){
                   char caracter = (char)valor;
                    if(caracter == 'a'){
                        System.out.print('y');

                    } else if(caracter == 'b'){
                        System.out.print('h');
                    } else if(caracter == 'c'){
                        System.out.print('e');
                    }else if (caracter == 'd'){
                        System.out.print('s');
                    }else if (caracter == 'e'){
                        System.out.print('o');
                    }else if (caracter == 'f'){
                        System.out.print('c');
                    }else if (caracter == 'g'){
                        System.out.print('v');
                    }else if (caracter == 'h'){
                        System.out.print('x');
                    }else if (caracter == 'i'){
                        System.out.print('d');
                    }else if (caracter == 'j'){
                        System.out.print('u');
                    }else if (caracter == 'k'){
                        System.out.print('i');
                    }else if (caracter == 'l'){
                        System.out.print('g');
                    }else if (caracter == 'm'){
                        System.out.print('l');
                    }else if (caracter == 'n'){
                        System.out.print('b');
                    }else if (caracter == 'o'){
                        System.out.print('k');
                    }else if (caracter == 'p'){
                        System.out.print('r');
                    }else if (caracter == 'r'){
                        System.out.print('t');
                    }else if (caracter == 's'){
                        System.out.print('n');
                    }else if (caracter == 't'){
                        System.out.print('w');
                    }else if (caracter == 'u'){
                        System.out.print('j');
                    }else if (caracter == 'v'){
                        System.out.print('p');
                    }else if(caracter == 'q'){
                        System.out.print('z');
                    }else if (caracter == 'w'){
                        System.out.print('f');
                    }else if (caracter == 'x'){
                        System.out.print('m');
                    }else if (caracter == 'y'){
                        System.out.print('a');
                    }else if (caracter == 'z'){
                        System.out.print('q');
                    }else{
                        System.out.print(caracter);
                    }
                }else{
                    System.out.print("\n");
                }
            }

        } catch (IOException ioe){
            System.out.print(":(");
        }
    }
}
