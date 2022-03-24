package lanzadorFigura;

//Libreria y utilidades
import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Punto;

public class LanzadorCirculo {
    public static final Circulo[] CIRCULO_ARRAY = new Circulo[3];

    public static void main(String[] args) {
        //Ejercico nro1.
        //--------------------------------------------------------------------------------//

       /* //Creo mi primer objeto

        Circulo miPrimerCirculo = new Circulo(); //Este es la manera de conectar con la otra clase.
        miPrimerCirculo.radio = 3; // Este es la manera de ingresar por atrabuto al objeto.
        miPrimerCirculo.puntoMedioX = 3;
        miPrimerCirculo.puntoMedioY = -2;
        miPrimerCirculo.color = "Azul";

        //Imprimimos los calculos usando los métodos definidos en la clase circulo.
        //Los atributos se ingresan como cualquier variable.
        System.out.println(miPrimerCirculo.calculadorAreadelCirculo());
        System.out.println(miPrimerCirculo.calcularCircunferencia());

        //---------------------------------------------------------------------------------//*/

        // Ejercicio Nro 2.

        /*//Llamando el objeto circulo creamos el primer objeto e ingresar los en el argumento de liguiente manera:

        Circulo miPrimerCirculo = new Circulo( 2, 3, -2, "Verde"  );
        System.out.println(miPrimerCirculo.calcularCircunferencia());
        System.out.println(miPrimerCirculo.calculadorAreadelCirculo());

        //Para el segundo constructo vamos ingresar un valor y con este valor va calcular lo que se le pida.
        Circulo radioCirculo = new Circulo( 4);
        System.out.println(radioCirculo.calculadorAreadelCirculo());
        System.out.println(radioCirculo.calcularCircunferencia());

        //Aquí usamos el constructor por defecto. Aquí no se ingresa valor alguna, solo se le pide que haga algo sin valores dado,
        //El sistema va asigna un valor por defecto. un constructor por defecto no tiene cuerpo, solo es un argumento en vacio.

        Circulo circuloPorDefecto = new Circulo();
        System.out.println(circuloPorDefecto.calcularCircunferencia());
        System.out.println(circuloPorDefecto.calculadorAreadelCirculo());*/
        //---------------------------------------------------------------------------------//

        //Ejercicio numero 3: Sobrecarga de métodos
       /* Circulo miPrimerCirculo = new Circulo( 3, 1, 4, "Verde" );
        System.out.println(miPrimerCirculo.calcularCircunferencia());
        System.out.println(miPrimerCirculo.calculadorAreadelCirculo());

        //Para el segundo constructo vamos ingresar un valor y con este valor va calcular lo que se le pida.
        Circulo radioCirculo = new Circulo( 4);
        System.out.println(radioCirculo.calculadorAreadelCirculo());
        System.out.println(radioCirculo.calcularCircunferencia());

        //Aquí usamos el constructor por defecto. Aquí no se ingresa valor alguna, solo se le pide que haga algo sin valores dado,
        //El sistema va asigna un valor por defecto. un constructor por defecto no tiene cuerpo, solo es un argumento en vacio.

        Circulo circuloPorDefecto = new Circulo();
        System.out.println(circuloPorDefecto.calcularCircunferencia());
        System.out.println(circuloPorDefecto.calculadorAreadelCirculo());

        // Ejercicio 3.5 / 1.4 static vs non-static
        System.out.println(Circulo.retornarDefinición());*/

        //---------------------------------------------------------------------------------//

        // Dagdeel 2: Encapsulation en constructor chaining

       /* Circulo ciruloPorDefecto = new Circulo(); //Crear el objeto se llama instanciar o iniciar
        System.out.println(ciruloPorDefecto.retornarDefinición());
        System.out.println(ciruloPorDefecto.getRadio());
        System.out.println(ciruloPorDefecto.calculadorAreadelCirculo());
        System.out.println(ciruloPorDefecto.calcularCircunferencia());

        ciruloPorDefecto.setRadio(-3);

        System.out.println(ciruloPorDefecto.calculadorAreadelCirculo());
        System.out.println(ciruloPorDefecto.calcularCircunferencia());*/
//----------------------------------------------------------------------------//
// Los constantes  2.2
     /* Circulo circuloPorDefecto = new Circulo();
       System.out.println(circuloPorDefecto.getRadio());
        System.out.println(circuloPorDefecto.calculadorAreadelCirculo());
        System.out.println(circuloPorDefecto.calcularCircunferencia());

      circuloPorDefecto.setRadio(12);

       System.out.println(circuloPorDefecto.calcularCircunferencia());
        System.out.println(circuloPorDefecto.calculadorAreadelCirculo());

        circuloPorDefecto.setRadio(1);

        System.out.println(circuloPorDefecto.calculadorAreadelCirculo());
        System.out.println(circuloPorDefecto.traduceLaSobreDimension());*/

        //-----------------------------------------------------------------------------//
        //4.4 /2.3 constructores en cadena
/*Circulo circulo1 = new Circulo(3,1,4,"verde");
        System.out.println(circulo1.calcularCircunferencia());
        System.out.println(circulo1.calculadorAreadelCirculo());

        Circulo circuloPorDefecto = new Circulo();
        System.out.println(circulo1.calculadorAreadelCirculo());
        System.out.println(circulo1.calcularCircunferencia());

        Circulo circuloRadio = new Circulo(6);
        System.out.println(circuloRadio.calcularCircunferencia());
        System.out.println(circuloRadio.calculadorAreadelCirculo());*/
//______________________________________________________________//
        // // 4.5 - 2.4 Arrays de objetos
        //
        //  Circulo[] circuloArray = new Circulo[3];
        //  circuloArray[0] = new Circulo(3, 1, 4, "verde");
        //  circuloArray[1] = new Circulo();
        //  circuloArray[2] = new Circulo(6);
        //  for (int contador = 0; contador < circuloArray.length; contador++) {
        //      System.out.println(circuloArray[contador].calculadorAreadelCirculo());
        //      System.out.println(circuloArray[contador].calcularCircunferencia());
        //
        //  }

        //___________________________________________________________//
        // 3.1 Clase como atributos

      /*  Circulo[] circuloArray  = new Circulo[3];
        circuloArray [0] = new Circulo(3, new Punto(1,4), "verde");
        circuloArray[1] = new Circulo();
        circuloArray[2] = new Circulo(6);
        for (int i = 0; i < circuloArray.length ; i++) {
            System.out.println(circuloArray[i].calculadorAreadelCirculo());
            System.out.println(circuloArray[i].calcularCircunferencia());
            System.out.println("Hola ");
            System.out.println(circuloArray[i].getPuntoMedio().getCordenadaX());
            System.out.println(circuloArray[i].getPuntoMedio().getCordenadaY());
        }*/

        System.out.println(Cuadrado.retornarDefinición());
        Cuadrado[] arrayCuadrado = new Cuadrado[3];
        arrayCuadrado[0] = new Cuadrado(4, 4, new Punto(2, 5), "azul");
        arrayCuadrado[1] = new Cuadrado();
        arrayCuadrado[2] = new Cuadrado(20, 10);

        for (int i = 0; i < arrayCuadrado.length; i++) {

            System.out.println(arrayCuadrado[i].circunferenciaCuadrado());
            System.out.println(arrayCuadrado[i].areaCuadrado());
            System.out.println(arrayCuadrado[i].getPuntoDeLaEzquinaSuperIzquierdo().getCordenadaX());
            System.out.println(arrayCuadrado[i].getPuntoDeLaEzquinaSuperIzquierdo().getCordenadaY());
            System.out.println(arrayCuadrado[i].getPuntoDeLaEzquinaSuperIzquierdo().);

        }
    }
}
