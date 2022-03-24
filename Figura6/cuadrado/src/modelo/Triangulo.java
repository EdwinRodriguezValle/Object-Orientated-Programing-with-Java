package modelo;

public class Triangulo {
    public int largo;
    public  int ancho;
    public int alto;
    public String color;

    public Triangulo(int largo, int ancho, int alto,  String color){
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }
    public Triangulo(int largo){
        this.largo = largo;
        this.ancho = 0;
        this.alto = 0;
        this.color = "azul";
    }


    public Triangulo(){
        this.largo =5;
        this. ancho = 7;
        this.color = "amarrillo";
    }

    public String definirLaFormulaDelTriangulo(){
        return "El area de un triángulo es lado por ancho entre dos";
    }

    public int calculadorDeArea(){
        return largo * ancho / 2;
    }

    public int calculadorDeVolumen(){
        return largo * ancho  * alto;
    }

}
