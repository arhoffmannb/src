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

            int posicion = rutaArchivo.lastIndexOf("\\");
            String nuevaRuta = rutaArchivo.substring(0, posicion);
            nuevaRuta = nuevaRuta + "\\HablandoEnLenguas_201314357.txt";
            System.out.print(nuevaRuta);

            int valor = 0;
            int contador = 1;

            FileWriter fileWriter = new FileWriter(nuevaRuta);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            while((valor = bufferedReader.read())!= -1){
                if((char)valor !='\n'){
                   char caracter = (char)valor;
                    if(caracter == 'a'){
                        System.out.print('y');
                        printWriter.write('y');
                    }else if(caracter == 'b'){
                        System.out.print('h');
                        printWriter.write('h');
                    }else if(caracter == 'c'){
                        System.out.print('e');
                        printWriter.write('e');
                    }else if (caracter == 'd'){
                        System.out.print('s');
                        printWriter.write('s');
                    }else if (caracter == 'e'){
                        System.out.print('o');
                        printWriter.write('o');
                    }else if (caracter == 'f'){
                        System.out.print('c');
                        printWriter.write('c');
                    }else if (caracter == 'g'){
                        System.out.print('v');
                        printWriter.write('v');
                    }else if (caracter == 'h'){
                        System.out.print('x');
                        printWriter.write('x');
                    }else if (caracter == 'i'){
                        System.out.print('d');
                        printWriter.write('d');
                    }else if (caracter == 'j'){
                        System.out.print('u');
                        printWriter.write('u');
                    }else if (caracter == 'k'){
                        System.out.print('i');
                        printWriter.write('i');
                    }else if (caracter == 'l'){
                        System.out.print('g');
                        printWriter.write('g');
                    }else if (caracter == 'm'){
                        System.out.print('l');
                        printWriter.write('l');
                    }else if (caracter == 'n'){
                        System.out.print('b');
                        printWriter.write('b');
                    }else if (caracter == 'o'){
                        System.out.print('k');
                        printWriter.write('k');
                    }else if (caracter == 'p'){
                        System.out.print('r');
                        printWriter.write('r');
                    }else if (caracter == 'r'){
                        System.out.print('t');
                        printWriter.write('t');
                    }else if (caracter == 's'){
                        System.out.print('n');
                        printWriter.write('n');
                    }else if (caracter == 't'){
                        System.out.print('w');
                        printWriter.write('w');
                    }else if (caracter == 'u'){
                        System.out.print('j');
                        printWriter.write('j');
                    }else if (caracter == 'v'){
                        System.out.print('p');
                        printWriter.write('p');
                    }else if(caracter == 'q'){
                        System.out.print('z');
                        printWriter.write('z');
                    }else if (caracter == 'w'){
                        System.out.print('f');
                        printWriter.write('f');
                    }else if (caracter == 'x'){
                        System.out.print('m');
                        printWriter.write('m');
                    }else if (caracter == 'y'){
                        System.out.print('a');
                        printWriter.write('a');
                    }else if (caracter == 'z'){
                        System.out.print('q');
                        printWriter.write('q');
                    }else{
                        System.out.print(" ");
                        printWriter.write(' ');
                    }
                }else{
                    System.out.print("\n " + "Caso #"+contador + " ");
                    printWriter.write("\r\n " + "Caso #"+contador + " ");
                    contador++;

                }
            }

            printWriter.close();
            bufferedWriter.close();

        } catch (IOException ioe){
            System.out.print(":(");
        }

    }

}



