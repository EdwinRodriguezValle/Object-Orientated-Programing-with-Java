//Esto es la manera de exportar datos desde JAVA a CVS

package controller;

import model.Punt;
import model.Rechthoek;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ExportarDatosDeJava {

        public static void main(String[] args) {
            ArrayList<String> filasArchivo = new ArrayList<>();
            //Para exportar hay que cree una nuena listaArray
            ArrayList<Rechthoek> rechthoeken =new ArrayList<>();


            File ubicacionArchivo = new File("resources/Rechthoek.csv");// aquí va la ruta del archivo pero solo desde la ubicación del proyecto. No desde las base del disco.
            try {
                Scanner datosArchivo = new Scanner(ubicacionArchivo);//Se leee un archivo con el escaner de esta manera.
                while(datosArchivo.hasNextLine()){// hasNextLina es un ingresador de boolean que va funcionar siempre en cuando haya un nuevo código.
                    filasArchivo.add(datosArchivo.nextLine());//Aquí le dices que ingregue los datos que lee en datosArchivo al Array filasArchivo.
                }
            }catch (FileNotFoundException nietGevonden){
                System.out.println("La dirección del archivo no se encuentra");
            }
            //Una vez que estas afuera de try catch puedes comprobar  si se ha leído correctamente.
            if(filasArchivo.size()> 0){
                for (String contadorDatos : filasArchivo) {
                    //con esto divides los datos del CVS que estan divididos por comas en cuatro colunnas.
                    String[] regelArray = contadorDatos.split( ",");
                    System.out.println(regelArray[0] + " " + regelArray[4]);
                    //Aquí lo convierte de double el dato string. El Double con mayuscula
                    //Aquí migras los datos para hacer el cuadrado que ya esta en rechthoek de java
                    double lengte = Double.parseDouble(regelArray[0]);
                    double breedte = Double.parseDouble(regelArray[1]);
                    double xCoordinate = Double.parseDouble(regelArray[2]);
                    double yCoordinate = Double.parseDouble(regelArray[3]);
                    String kleur = regelArray[4];

                    //Aquí se hace el cuadrado de la siguiente manera.
                    //Es como hacer un objeto.

                    //Para exportar. (hay que fijarse que aún estamos dentro del if.
                    //En lugar crear un objeto para exportar, voy a aguardar en un array list.
                    //Aquí el if va agregar al nuevo array que he creado.
                    rechthoeken.add(new Rechthoek(lengte,breedte,new Punt(xCoordinate,yCoordinate),kleur));


                    /*Rechthoek rechthoek = new Rechthoek(lengte, breedte, new Punt(xCoordinate, yCoordinate), kleur);*/
                    //Este conecta con la clase rechthoek.
                    //System.out.println(rechthoek);
                }
                //Aquí se exporta con el metodo for loop

                for(Rechthoek rechthoek: rechthoeken){
                    //Aquí ubicamos el lugar donde va exportar.
                    File uitvoerBestand = new File("resources/Rechthoeken.txt");
                    //Y con el metodo PrintWrite escribimos el archivo.
                    //Con PrintWriter hay un proble y hay que usar el exception
                    try {//exception ya nos da el error
                        PrintWriter printWriter = new PrintWriter(uitvoerBestand);
                        for (Rechthoek rechthoek1: rechthoeken){
                            printWriter.println(rechthoek1);
                            System.out.println();
                        }
                        //Aquí siempre se cierra, sino lo lo cierrras no se abre el archivo.
                        printWriter.close();

                    }catch (FileNotFoundException nietGemaakt){
                        System.out.println( nietGemaakt.getMessage());
                    }
                }
            }
        }
    }
