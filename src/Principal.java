import java.io.BufferedReader;
import java.io.FileReader;

public class Principal {

    //UNICODE LETRAS MAYUSCULAS : 65 - 90
    //unicode letras minusculas : 97 - 122
    //192 a 255

    public static void main(String[] args) {

        //definimos lo que necesitaremos
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        //variable que leerá los caracteres del archivo divina comedia
        int dato = 0;

        //contara las letras para clasificarlas , 2 ... al 10
        int cuentaLetras = 0;

        //datos para el histograma (cant. de veces que aparece cada tipo de palabra) int dos = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;
        int siete = 0;
        int ocho = 0;
        int nueve = 0;
        int diez = 0;


        try {
            fileReader = new FileReader("divina_comedia_sp.txt");
            bufferedReader  = new BufferedReader(fileReader);
            //variable que leerá los datos
            dato = bufferedReader.read();
            while (dato != -1){//leeremos hasta que acabe el archivo

                        while(((dato >= 65 && dato<= 90) || (dato >= 97 && dato <=122) || (dato >= 192 && dato <= 255)) && dato != 32){// Y si es una letra del alfabeto latin entonces...
                            System.out.print((char) dato);
                        //estamos leyendo letras latinas, ahora que
                        cuentaLetras++;
                        dato = bufferedReader.read();
                        }//fin de if (SI ES QUE ESTAMOS LEYENDO UNA LETRA DEL LATÍN
                System.out.print((char) 32);
                switch (cuentaLetras){

                    case 2:
                        dos++;
                        break;

                    case 3:
                        tres++;
                        break;

                    case 4:
                        cuatro++;
                        break;

                    case 5:
                        cinco++;
                        break;

                    case 6:
                        seis++;
                        break;

                    case 7:
                        siete++;
                        break;

                    case 8:
                        ocho++;
                        break;

                    case 9:
                        nueve++;
                        break;

                    case 10:
                        diez++;
                        break;
                }


                cuentaLetras = 0;
                dato = bufferedReader.read();
            }//fin while
        }catch (Exception e){}//fin catch
        //area de impresion de datos
        System.out.println();
        System.out.println();
        System.out.println("La divina comedia analizada:");
        System.out.println("Palabras de 2 letras: "+dos);
        System.out.println("Palabras de 3 letras: "+tres);
        System.out.println("Palabras de 4 letras: "+cuatro);
        System.out.println("Palabras de 5 letras: "+cinco);
        System.out.println("Palabras de 6 letras: "+seis);
        System.out.println("Palabras de 7 letras: "+siete);
        System.out.println("Palabras de 8 letras: "+ocho);
        System.out.println("Palabras de 9 letras: "+nueve);
        System.out.println("Palabras de 10 letras: "+diez);

    }//fin main
}//fin class
