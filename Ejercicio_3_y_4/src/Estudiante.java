import java.lang.Math;

public class Estudiante {

    private String nombre;
    private String matricula;
    private char sexo;
    private int edad;
    private double peso;
    private double altura;

    private static final int MAYORIA_EDAD = 18;

    public Estudiante() {

        this.nombre = "";
        this.matricula = "";
        this.sexo = 'H';
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0.0;
    }


    public Estudiante(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }


    public Estudiante(String nombre, String matricula, char sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.sexo = comprobarSexo(sexo);
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }


    public int calcularIMC() {
        if (this.altura <= 0 || this.peso <= 0) {

            return -2;
        }

        double imc = this.peso / Math.pow(this.altura, 2);

        if (imc < 18) {
            return -1;
        } else if (imc >= 18 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }


    public boolean esMayorDeEdad() {
        return this.edad >= MAYORIA_EDAD;
    }

    private char comprobarSexo(char sexo) {
        char sexoMayus = Character.toUpperCase(sexo);
        if (sexoMayus == 'H' || sexoMayus == 'M') {
            return sexoMayus;
        } else {
            return 'H';
        }
    }

    @Override
    public String toString() {
        return "Estudiante {" +
                "Nombre='" + nombre + '\'' +
                ", Matrícula='" + matricula + '\'' +
                ", Sexo=" + sexo +
                ", Edad=" + edad +
                ", Peso=" + peso + " kg" +
                ", Altura=" + altura + " m" +
                '}';
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }
}