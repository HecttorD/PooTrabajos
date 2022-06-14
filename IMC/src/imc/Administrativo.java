package imc;


/**
 * 
 */
public class Administrativo extends Persona {

    /**
     * Default constructor
     */
    public Administrativo() {
    }

    /**
     * 
     */
    private int añoDeIngreso;
    int añoActual=2022;

    
    
    
    public Administrativo(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }

    /**
     * @return
     */
    public Administrativo(int añoDeIngreso, String nombre, String apellido, String codigo) {
        super(nombre, apellido, codigo);
        this.añoDeIngreso = añoDeIngreso;
    }

    public int calcularAntiguedad() {
        // TODO implement here
 
        return añoActual-añoDeIngreso;
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }

    public int getAñoActual() {
        return añoActual;
    }

    public void setAñoActual(int añoActual) {
        this.añoActual = añoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    
    
}