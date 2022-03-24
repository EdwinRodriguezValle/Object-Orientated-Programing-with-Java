package modelo;

public class Circulo extends Figura {

    //Atributos
   /*final static double LIMITE_DE_LA_FIGURA = 100.0;*/
    private double radio;
  /*  private double puntoMedioX;
    private double puntoMedioY;*/
    private Punto puntoMedio;
   /* private String color;*/

    //Constructores. Están encargado de iniciar y constrolar las atributos.
    //También se le llama como instanciación. En realidad son pequenos metodos que van a relaciona
    //los atributos con el lugar donde se vaya a usar y también van a permitir ponerle valores.
    //En ela rgumento se le pone los atributos con las cuales va trabajar este constructor.
    //Un constructor te da elvalor de retorno.
    //Tiene exactamente el mismo nombre como la clase Circulo circulo
    //Podemos tener muchos constructores, siempre en cuando tengamos asignados distintos valores
    //Un constructor tiene que tener el mismo nombre que una clase
    //Un constructor nunca te da una valor de retorno
    //POdemos tener constructores con el mismo nombr een la medida que tenga
    //distinto argumentos o tipos de datos en sus argumentos.



    /*public Circulo(double radio, double puntoMedioX, double puntoMedioY, String color){
        //Aquí va se;alar y relacionar los atributos para inicializar con la palabra this.
        this.radio = radio; // El radio dado en este constructor apunta al atributo.
        this.puntoMedioX = puntoMedioX;
        this.puntoMedioY = puntoMedioY;
        this.color = color;

    }

    public Circulo(double radio){
        this.radio = radio;
        this.puntoMedioX = 0;
        this.puntoMedioY = 0;
        this.color = "blanco";
    }

    //Un constructor por defecto defoult no tiene argumento:
    /*El constructor por defecto es un constructor sin parámetros que no hace nada.
    Los atributos del objeto son iniciados con los valores predeterminados por
    el sistema. no se ha definido ningún constructor, por lo que al declarar un objeto
    el compilador utilizará un constructor por defecto.

    public Circulo() {
        this.radio = 1;
        this.puntoMedioX = 0;
        this.puntoMedioY = 0;
        this.color = "blanco";
    } */

    //_____________________________________________________________//
    // Constructores en cadena

   /* public Circulo(double radio, double puntoMedioX, double puntoMedioY, String color) {
        this.radio = radio;
*//*
       this.puntoMedioX = puntoMedioX;
        this.puntoMedioY = puntoMedioY;
*//*
        this.color = color;
    }
// Cuando se construye un constructor en cade se
    // de da los argumentos y tambien contenido a ejecutarse es un indicación
    //o se;alamiento al anteior constructor y se ingresa entre paraentesis

    public Circulo(double radio) {
        this(radio, "blanco");
    }

    // En caso del constrcutor por defecto, este av se;alar al anterior constructor y va heredar sus valores
    public Circulo(){
        this (1);
    }

    //Dagdeel 2: Encapsulation en constructor chaining GETTER en SETTER


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if(radio <= 0 ){
            System.out.println("Ingrese un numero positivo");
            this.radio = 1.0;
        }
        this.radio = radio;
    }


   *//* public double getPuntoMedioX() {
        return puntoMedioX;
    }

    public void setPuntoMedioX(double puntoMedioX) {
        this.puntoMedioX = puntoMedioX;
    }

    public double getPuntoMedioY() {
        return puntoMedioY;
    }

    public void setPuntoMedioY(double puntoMedioY) {
        this.puntoMedioY = puntoMedioY;
    }*//*

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
*/
// Contructores.

   /* public Circulo(double radio, Punto puntoMedio, String color) {
        this.radio = radio;
        this.puntoMedio = puntoMedio;
        this.color = color;
    }

    public Circulo(double radio) {
        this(radio, new Punto(), "blanco");
    }

    public Circulo() {
        this(1);
    }

    // Getter y Setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio <= 0) {
            System.out.println("El radio debe ser un número positivo entero.");
            this.radio = 1.0;
        } else {
            this.radio = radio;
        }
    }

    public Punto getPuntoMedio() {
        return puntoMedio;
    }

    public void setPuntoMedio(Punto puntoMedio) {
        this.puntoMedio = puntoMedio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }*/



    //Herencia Constructores

  

    //Métodos

    public  double calcularCircunferencia(){
        return 2 * Math.PI * radio;
    }

    public double calculadorAreadelCirculo(){
        return Math.PI * radio * radio;
    }

    //Ejercico 3.5 / 1.4 Statico versus no Statico
    //Este metodo esta disponible sin tener que ser instaciado en la clase circulo
    //Pero el metodo es llamado por medio de la clase

    public static String retornarDefinición(){
        return "Un circulo es un acumulado de puntos que equidistan en" +
                " la misma medida del centro";
    }

    public String dimenciónCirculo() {
        if (calculadorAreadelCirculo() > LIMITE_DE_LA_FIGURA) {
            return "Soy muy grande.";
        } else {
            return "Soy pequeno.";
        }

    }

}

