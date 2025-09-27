import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Ingreso de datos para el Estudiante 1 ---");

        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Sexo (H/M): ");
        char sexo1 = scanner.nextLine().charAt(0);
        System.out.print("Peso (kg): ");
        double peso1 = scanner.nextDouble();
        System.out.print("Altura (m): ");
        double altura1 = scanner.nextDouble();
        scanner.nextLine();

        Estudiante estudiante1 = new Estudiante(nombre1, matricula1, sexo1, edad1, peso1, altura1);
        Estudiante estudiante2 = new Estudiante("Ana Lopez", 25, 'M');

        System.out.println("\n--- Datos del estudiante 2 ---");
        System.out.print("Ingrese el peso para estudiante 2: ");
        double peso2 = scanner.nextDouble();
        System.out.print("Ingrese la Altura para estudiante 2: ");
        double altura2 = scanner.nextDouble();
        scanner.nextLine();

        estudiante2.setPeso(peso2);
        estudiante2.setAltura(altura2);

        System.out.println("\n--- Comprobación de peso (IMC) ---");
        comprobarEstadoPeso(estudiante1);
        comprobarEstadoPeso(estudiante2);

        System.out.println("\n--- Comprobación de Mayoría de edad ---");
        System.out.println(estudiante1.getNombre() + ": " +
                (estudiante1.esMayorDeEdad() ? "Es mayor de edad." : "Es menor de edad."));
        System.out.println(estudiante2.getNombre() + ": " +
                (estudiante2.esMayorDeEdad() ? "Es mayor de edad." : "Es menor de edad."));


    }

    public static void comprobarEstadoPeso(Estudiante estudiante) {
        int resultadoIMC = estudiante.calcularIMC();
        String mensaje;

        switch (resultadoIMC) {
            case -1:
                mensaje = " tiene infrapeso.";
                break;
            case 0:
                mensaje = " tiene un peso ideal.";
                break;
            case 1:
                mensaje = " tiene sobrepeso.";
                break;
            case -2:
                mensaje = " tiene datos de peso/altura inválidos.";
                break;
            default:
                mensaje = " tiene un estado de IMC desconocido.";
                break;
        }

        System.out.println(estudiante.getNombre() + mensaje);
    }
}