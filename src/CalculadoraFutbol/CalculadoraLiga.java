package CalculadoraFutbol;

public class CalculadoraLiga {
    public static int calcularpuntos(int victorias, int empates){
        return victorias*3+empates;
    }
    public static boolean esDescenso(int puntosTotales){
        if(puntosTotales<400){
            return true;
        }else {
            return false;
        }
    }
    public static void ObtenerMensajeAficion(String nombreEquipo){
        System.out.println("¡Vamos "+nombreEquipo+", a ganar!");
    }
}
