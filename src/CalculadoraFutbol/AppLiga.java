package CalculadoraFutbol;

import java.util.Scanner;

public class AppLiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre del equipo: ");
        String nombreEquipo = sc.nextLine();
        System.out.println("Escribe el numero de victorias del equipo: ");
        int victorias = sc.nextInt();
        System.out.println("Escribe el numero de empates del equipo: ");
        int empates = sc.nextInt();
        CalculadoraLiga.ObtenerMensajeAficion(nombreEquipo);
        int resultados=CalculadoraLiga.calcularpuntos(victorias, empates);
        if(CalculadoraLiga.esDescenso(resultados)){
            System.out.println(nombreEquipo+ " ha descendido.");
        }else {
            System.out.println(nombreEquipo+ " ha ascendido.");
        }
    }
}
