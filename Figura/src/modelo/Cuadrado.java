package modelo;

public class Cuadrado {
    private final static  double DIMENSIONES_DE_UNA_CAJA = 100.0;
    private double largo;
    private double ancho;
    private Punto puntoDeLaEzquinaSuperIzquierdo;
    private String color = "blanco";

    public Cuadrado(double largo, double ancho, Punto puntoDeLaEzquinaSuperIzquierdo, String color) {
        this.largo = largo;
        this.ancho = ancho;
        this.puntoDeLaEzquinaSuperIzquierdo = puntoDeLaEzquinaSuperIzquierdo;
        this.color = color;
    }

    public Cuadrado(double largo, double ancho) {
        this(largo, ancho, new Punto(), "blanco");
    }

    public Cuadrado() {
        this(2, 1);
    }

    // Métodos.

    public static String retornarDefinición(){
        return "El cuadro esta compuesta por el aldo y ancho de la misma dimensión";
    }

    public double circunferenciaCuadrado (){
        return 2 * (largo + ancho);
    }

    public double areaCuadrado(){
        return largo * ancho;
    }

    public String dimensionesCaja(){
        if(areaCuadrado() > DIMENSIONES_DE_UNA_CAJA){
            return "Demasido grande.";
        }else{
            return "Esta dentro de las medidas.";
        }
    }

    //Getter y setter

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Punto getPuntoDeLaEzquinaSuperIzquierdo() {
        return puntoDeLaEzquinaSuperIzquierdo;
    }

    public void setPuntoDeLaEzquinaSuperIzquierdo(Punto puntoDeLaEzquinaSuperIzquierdo) {
        this.puntoDeLaEzquinaSuperIzquierdo = puntoDeLaEzquinaSuperIzquierdo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}





