package imc;


/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    /**
     * 
     */
    protected String nombre;

    /**
     * 
     */
    protected String apellido;

    /**
     * 
     */
    protected String codigo;

    /**
     * @return
     */
    public String getCodigo() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getApellido() {
        // TODO implement here
        return "";
    }

     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    public Persona(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

   

    
    
    
    
}