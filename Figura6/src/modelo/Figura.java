package modelo;

public class Figura {
    //Atributos
    protected final static double DIMENSIONES_MAXIMOS_FIGURA = 100.0;
    protected final static  String COLOR_POR_DEFECTO = "blanco";
    protected String color;

    //Constructores

    public Figura(String color) {
        this.color = color;
    }

    public Figura() {
        this(COLOR_POR_DEFECTO);
    }

    //Método.

    public static String definicionFigura(){
        return "Una figura es un conglomerado de puntos";
    }

    public double calculadorCircunferencia(){
        return  0;
    }

    public double calculadorArea(){
        return  0;
    }

    public String determinadorDeDimensiones(){
        if(calculadorArea() >DIMENSIONES_MAXIMOS_FIGURA){
            return "Excede el tana;o limite.";
        }else{
            return "Dentro del tamano  estandar.";
        }
    }

    @Override
    public String toString() {
        return "Color: " + color + "\n Periferia: " + calculadorCircunferencia() +
                "\nArea" + calculadorArea() + ".";
    }

    //Getter y setter
    public String getColor(){
        return  color;
    }

    public void setColor(String color){
        this.color = color;
    }

}
