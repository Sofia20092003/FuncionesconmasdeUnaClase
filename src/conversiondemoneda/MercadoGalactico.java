package conversiondemoneda;

import java.util.Scanner;

public class MercadoGalactico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenico a tu convertidor de moneda galactica.\nEstas son nuestras tazas: ");
        ConversorEspacial.mostrarTasasdeCambio();
        System.out.println("Que tipo de moneda quieres convertir?: ");
        System.out.println("1.Euros");
        System.out.println("2.Dolares");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Cual es la cantidad de Euros que quiere convertir?: ");
                double euros=sc.nextDouble();
                double cantidadFinaleuros=ConversorEspacial.eurosACreditos(euros);
                System.out.println("Su saldo es de: "+cantidadFinaleuros);
                break;
                case 2:
                    System.out.println("Cual es la cantidad de dolares que quiere convertir?: ");
                    double dolares=sc.nextDouble();
                    double cantidadFinaldolares=ConversorEspacial.dolaresACreditos(dolares);
                    System.out.println("Su saldo es de: "+cantidadFinaldolares);
                    break;
        }
    }
}
