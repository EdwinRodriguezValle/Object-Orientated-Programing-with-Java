package modelo;

public class Figura {
    protected final static double FIGURA_GRANDE_LIMITES = 100.0;
    protected final static  String VALORES_POR_DEFECTO_COLOR = "blanco";
    protected  String color;

    public Figura(String color) {
        this.color = color;
    }

    public Fugura (){
        this(VALORES_POR_DEFECTO_COLOR);
    }

    public String dafiniciónDeFigura (){
        return 'Una figura es una conglomerado de puntos.'
    }

    public double circunferenciaFigura(){
        return "Desconocido";
    }

    public double areaFigura(){
        return "Desconocido";
    }



}
