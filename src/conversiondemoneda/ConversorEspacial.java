package conversiondemoneda;

public class ConversorEspacial {
    public static void mostrarTasasdeCambio(){
        System.out.println("1 Crédito= 1.5 Dólares | 1 Crédito= 0.9 Euros");
    }
    public static double dolaresACreditos(double dolares){
        dolares*= 1.5;
        return dolares;
    }
    public static double eurosACreditos(double euros){
        euros*=0.9;
        return euros;
    }
    public static boolean validarCompra(double precio, double saldo){
        if(saldo<precio){
            return false;
        }else {
            return true;
        }
    }
}
