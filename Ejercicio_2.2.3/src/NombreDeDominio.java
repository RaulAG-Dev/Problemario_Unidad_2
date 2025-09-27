
public class NombreDeDominio {
    private String nombre;
    private static final String Prefijo = "www.";
    private static final String Sufijo = ".com";


    public NombreDeDominio(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerDominioCompleto() {
        return Prefijo + this.nombre + Sufijo;
    }

    public String getNombreBase() {
        return nombre;
    }
}