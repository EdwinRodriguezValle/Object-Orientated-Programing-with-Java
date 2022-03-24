
// El modelo modelo un objeto
package model;

/*Este es clase donde se va construir to_do lo de más. El Cirkel es el
objeto de la clase. EL objeto se escribe con mayuscula. Mientras que la clase con minuscula.
En estas variables se va almacenar la información*/

public class Cirkel {
    //Los soguientes son los atributos del objeto Circkel, definidos en formato de variable.
    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    /*El siguiente es un constructor: Un constructor es un elemento de una
    clase
    cuyo identificador coincide con el de la clase correspondiente
    y que tiene por objetivo obligar a y controlar cómo se inicializa
    una instancia (Es una variable ) de una determinada clase, ya que el lenguaje Java no
    permite que las variables miembro de una nueva instancia queden sin
    inicializar. Recuerda que un constructor se escribe en de manera
    pública o privada y en seguida va el Objeto, en este caso Cirkel.
     Dentro de  constructor Cirkel van las instancias que se van conectar a la clase
     y van ser controlados*/

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        this.straal = straal;
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    /*Aquí puedes definir nuevamente el objeto Cirkel pero más enfocado
    a un solo argumento. Recuerda que se interconectan de manera consecutiva con
    los códigos de encima*/

    public Cirkel(double straal) {
        this.straal = straal;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "wit";
    }

    /*Aquí sucede el mismo fenomenos que en la anterior con el objeto,
    Estos heredan las caracteristicas constructor de encima. Este es default
     */
    public Cirkel() {
        this.straal = 5;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "blanco";
    }

    //Aquí se defini un metodo para que para que retorme unString. Un método
    // retorna un producto específico para que sea procesado por otro.
    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben";
    }

    //ESte es un método para calcular el area de un circulo.

    public double damePeriferia() {
        return 2 * Math.PI * straal;
    }

    // El siguiente método calcula el área de un circulo>

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }
}
