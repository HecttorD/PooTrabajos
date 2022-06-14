package imc;


/**
 * 
 */
public class Carrera {

    /**
     * Default constructor
     */
    public Carrera(String Nombre, String Codigo, int Creditos) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Creditos = Creditos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int Creditos) {
        this.Creditos = Creditos;
    }

    public Carrera() {
    }

    /**
     * 
     */
    private String Nombre;

    /**
     * 
     */
    private String Codigo;

    /**
     * 
     */
    private int Creditos;

}