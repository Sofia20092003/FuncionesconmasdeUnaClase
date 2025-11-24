package conversiondemoneda;

public class ConversorEspacial {
    public static void mostrarTasasdeCambio(){
        System.out.println("1 Crédito= 1.5 Dólares | 1 Crédito= 0.9 Euros");
    }
    public static double dolaresACreditos(double dolares){
        return dolares/1.5;
    }
    public static double eurosACreditos(double euros){
        return euros/0.9;
    }
    public static boolean validarCompra(double precio, double saldo){
        return precio>=saldo;
    }
}
