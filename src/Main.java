//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("------- \uD83D\uDEF8 Escoga una opción \uD83D\uDEF8 -------");
            System.out.println("1) MXN----> USD");
            System.out.println("2) USD ----> MXN");
            System.out.println("3) MXN ----> EUR");
            System.out.println("4) EUR ----> MXN");
            System.out.println("5) MXN ----> JPY");
            System.out.println("6) JPY ----> MXN");
            System.out.println("0) Salir");
            System.out.println("--------------------------------------");
            opcion = sc.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.out.println("Programa finalizado con éxito c:");
                break; // Sale del bucle do-while si opcion es 0
            }
            System.out.println("Introduzca la cantidad a cambiar: ");
            double cantidad = sc.nextDouble();
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");



            Conversor conv = switch (opcion) {
                case 1 -> new Conversor("MXN", "USD", cantidad);
                case 2 -> new Conversor("USD", "MXN", cantidad);
                case 3 -> new Conversor("MXN", "EUR", cantidad);
                case 4 -> new Conversor("EUR", "MXN", cantidad);
                case 5 -> new Conversor("MXN", "JPY", cantidad);
                case 6 -> new Conversor("JPY", "MXN", cantidad);
                default -> null;
            };


        } while (opcion != 0);


    }

}