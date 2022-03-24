package controller;

import java.util.Scanner;

public class PrecioDeCompra {

    //Variables fijos
    final static int CANTIDAD_MAXIMA_HORAS = 24;
    final static int TARIFA_BASICA_POR_HORA = 3;
    final static double TARIFA_BASICA = 3.75;
    final static double TARIFA_NORMAL = 2.75;
    final static double TARIFA_DIARIA = 25.0;

    public static void main(String[] args) {

        //Preguntamos al cliente las cantidades.
        Scanner input = new Scanner(System.in);
        //Pregunta por la cantidad de autos
        System.out.println("Cuántos autos han parqueado? ");
        int numeroAutos = input.nextInt();

        //Crear e inicializar arrays
        String[] placas = new String[numeroAutos];
        int[] duracionParqueo = new int[numeroAutos];
        double[] costoParque = new double[numeroAutos];

        // Preguntar por auto la placa y el tiempo de parque
        for (int contador = 0; contador < numeroAutos; contador++) {
            System.out.println("Auto " + (contador + 1));
            System.out.println("\t ingrese la placa de su auto: ");
            placas[contador] = input.next();
            do {
                System.out.printf("\t  Ingrese la cantidad de horas de parqueo (máximo por día  puede ser 25 horas): ",
                        CANTIDAD_MAXIMA_HORAS);
                duracionParqueo[contador] = input.nextInt();
                if (duracionParqueo[contador] > CANTIDAD_MAXIMA_HORAS) {
                    System.out.printf("\t El parque máximo por día puede ser: " +
                            "\n ", CANTIDAD_MAXIMA_HORAS);
                }
            }
            while (duracionParqueo[contador] > CANTIDAD_MAXIMA_HORAS);

        }
        System.out.println();

        // Guardar los costos por auto en el array con la ayuda del método.
        for (int contador = 0; contador < numeroAutos; contador++) {
            costoParque[contador] = calculoDeCostosParqueo(duracionParqueo[contador]);
        }
        //imprimir la vista por auto
        System.out.println("Costos de parque: ");
        System.out.printf("%8s%8s%10s\n", "Placa: ", "Horas: ", "Monto: ");
        for (int contador = 0; contador < numeroAutos; contador++) {
            System.out.printf("%8s%8d%10.2f\n", placas[contador], duracionParqueo[contador],
                    costoParque[contador]);
        }

        System.out.println();

        //Calcular el costo total
        double costoGlobalDiaGarage = calculadorCostoTotalParquel(costoParque);

        //Imprimir el costo global por día que hizo el garage
        System.out.println("Costo total para el garage : \n" + costoGlobalDiaGarage);

        }

    public static double  calculoDeCostosParqueo(int mpTiempoPaqueo){
        double result;
        if (mpTiempoPaqueo <= TARIFA_BASICA_POR_HORA){
            result = mpTiempoPaqueo * TARIFA_BASICA;
        }else {
            result = TARIFA_BASICA_POR_HORA * TARIFA_BASICA +
                    (mpTiempoPaqueo - TARIFA_BASICA_POR_HORA) * TARIFA_NORMAL;
        }
        if(result > TARIFA_DIARIA){
            result = TARIFA_DIARIA;
        }
        return result;
    }

    //Calcular el costo total
    public static double calculadorCostoTotalParquel(double[] mpCostoTotalParqueo){
        double suma = 0.0;
        for (int contador = 0; contador < mpCostoTotalParqueo.length; contador++) {
            suma += mpCostoTotalParqueo [contador];
        }
        return suma;
    }
}
