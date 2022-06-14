package imc;


/**
 * 
 */
public class Estudiante extends Persona {

    /**
     * Default constructor
     */
    public Estudiante() {
    }

    /**
     * 
     */
    private Carrera carrera;

    /**
     * 
     */
    private int semestreActual;

    /**
     * 
     */
    private int numeroDeCreditos;

    public Estudiante(Carrera carrera, int semestreActual, int numeroDeCreditos) {
        this.carrera = carrera;
        this.semestreActual = semestreActual;
        this.numeroDeCreditos = numeroDeCreditos;
    }

    public Estudiante(Carrera carrera, int semestreActual, int numeroDeCreditos, String nombre, String apellido, String codigo) {
        super(nombre, apellido, codigo);
        this.carrera = carrera;
        this.semestreActual = semestreActual;
        this.numeroDeCreditos = numeroDeCreditos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public int getNumeroDeCreditos() {
        return numeroDeCreditos;
    }

    public void setNumeroDeCreditos(int numeroDeCreditos) {
        this.numeroDeCreditos = numeroDeCreditos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    //Porcentaje = (Puntaje obtenido x 100) / Puntaje total
    public String proyetoGrado(){
        String valido="El Estudiante "+ nombre+" " +apellido + " aun no puede matricular el Proyecto de Grado";
        int proyecto = (numeroDeCreditos *100)/carrera.getCreditos();
        if(proyecto > 89)
            return valido= "El Estudiante "+ nombre+" " +apellido + " ya puede matricular Proyecto de Grado";
        
        return valido;
    }
    
}