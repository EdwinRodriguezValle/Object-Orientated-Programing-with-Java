
package model;

public class Wedstrijd {
    //Atribute
    public String nombreDelOponente;
    public int golesAFavor;
    public int golesEnContra;

    //Constructure


    public Wedstrijd(String nombreDelOponente, int golesAFavor, int golesEnContra) {
        this.nombreDelOponente = nombreDelOponente;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
    }

    public Wedstrijd(String nombreDelOponente) {
        this.nombreDelOponente = nombreDelOponente;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
    }

    public Wedstrijd() {
        this.nombreDelOponente = "Desconocido";
        this.golesAFavor = 0;
        this.golesEnContra = 0;
    }

    //Methods
    public int caluldorDePuntosPorPartido(){
        if(golesAFavor > golesEnContra){
            return 3;
        }else if (golesAFavor == golesEnContra){
            return 1;
        }else{
            return 0;
        }
    }

    public void imprimirElResultado(){
        System.out.println("El resultado del Partido "
        + nombreDelOponente + ", " + golesAFavor + ", " +
                golesEnContra);
    }
    public void imprimirLosPuntos(){
        if(caluldorDePuntosPorPartido() == 1){
            System.out.println("Acumula un punto");
        }else {
            System.out.printf("Acumula %d por partido \n",
                    caluldorDePuntosPorPartido());
        }

    }

}
