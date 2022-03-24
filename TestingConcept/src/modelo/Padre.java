package modelo;

public class Padre {
    protected  final static double SALARIO_POR_MES  = 4000.0;
    protected String nombre;
    protected String apellido;
    protected int  edad;

    public Padre(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //Métodos

    public String dameElNombre(){
        return nombre;
    }

    public String dameElApellido(){
        return apellido;
    }


    public int dameLaEdad(){
        return edad;
    }

    public String dimeQueHace(){return "Es un hombre muy dedicado a su hijos y trabajador. " +
            "Le encanta triunfar";}

    public String toString () {
        return "nombre:  " + nombre + "\nApellido: " + apellido  +
                ", \nEdad " + edad;
    }

    //Exception
       /* public static void main(String[] args) {
                Scanner ingreso = new Scanner(System.in);
                System.out.println("Ingrese dos numeros:");
                int numero1 = ingreso.nextInt();
                int numero2 = ingreso.nextInt();

                int result = cociente(numero1, numero2);
                System.out.println(numero1 + "/" + numero2 + "es:" + "\t" + result);

        }

        public static int cociente(int numero1, int numero2){
                if(numero2 == 0){
                        System.out.println("El divisor no pueder ser cero. Ingrese un número positivo.");
                        System.exit(1);
                }
                return numero1/numero2;
        }*/
}