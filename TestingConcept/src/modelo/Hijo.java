package modelo;

public class Hijo extends Padre{

    protected String oficio;
    protected  int amigos;

    public Hijo(String nombre, String apellido, int edad, String oficio, int amigos, Hermanos) {
        super(nombre, apellido, edad);
        this.oficio = oficio;
        this.amigos = amigos;
    }

    public Hijo(int amigos){
         this(amigos, new Hermanos())
    }

}



