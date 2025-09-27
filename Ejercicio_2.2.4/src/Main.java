import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número (double): ");
        double valorIngresado = scanner.nextDouble();

        Calculadora calculadora = new Calculadora();
        double resultadoCubo = calculadora.calcularCubo(valorIngresado);

        System.out.println("El cubo del número es: " + resultadoCubo);

        scanner.close();
    }
}