import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de dominio: ");
        String nombreIngresado = scanner.nextLine();

        NombreDeDominio dominio = new NombreDeDominio(nombreIngresado);
        String resultado = dominio.obtenerDominioCompleto();

        System.out.println("El dominio asignado es: " + resultado);

        scanner.close();
    }
}