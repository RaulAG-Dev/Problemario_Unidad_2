import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese el radio del círculo (double): ");
        double radioIngresado = scanner.nextDouble();
        Circulo miCirculo = new Circulo(radioIngresado);

        double area = miCirculo.calcularArea();
        double perimetro = miCirculo.calcularPerimetro();

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }
}
