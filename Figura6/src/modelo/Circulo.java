package modelo;

public class Circulo extends Figura {

    //Atributos
    private double radio;
    private Punto puntoMedio; //Aquí usa el punto como objeto, se conecta al punto para sacar información

    //Constructores


    public Circulo(String color, double radio, Punto puntoMedio) {
        super(color);
        this.radio = radio;
        this.puntoMedio = puntoMedio;
    }

    public Circulo(double radio) {
        this(COLOR_POR_DEFECTO, radio, new Punto());
    }

    public Circulo(){
        this(1);
    }

    //Métodos
    public static String definicionCirculo(){
        return "Un circulo es un conglemerado de puntos que equidistan" +
                "a la misma distancia del centro.";
    }

    @Override
    public double calculadorCircunferencia(){
        return  2 * Math.PI * radio;
    }

    @Override
    public double calculadorArea(){
        return  Math.PI * radio * radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        if(radio <= 0){
            System.out.println("El radio debe ser positivo");
            this.radio = 1.0;
        }else{
            this.radio = radio;
        }
    }

    public Punto getPuntoMedio(){
        return puntoMedio;
    }
    public void setPuntoMedio(Punto puntoMedio){
        this.puntoMedio = puntoMedio;
    }

   @Override
    public String toString() {
        return super.toString() + "\nRadio: " + radio + "\nPunto Medio: " + puntoMedio.toString();

    }

    }



