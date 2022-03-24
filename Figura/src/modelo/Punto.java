package modelo;

public class Punto {

    private double cordenadaX;
    private double cordenadaY;

    public Punto(){
        this(0,0);
    }

    public Punto(double x, double y){
        this.cordenadaX= x;
        this.cordenadaY = y;
    }
    // Setter y Getter
    public double getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(double cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public double getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(double cordenadaY) {
        this.cordenadaY = cordenadaY;
    }
}
