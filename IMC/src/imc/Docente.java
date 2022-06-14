package imc;


/**
 * 
 */
public class Docente extends Persona {

    /**
     * Default constructor
     */
    public Docente() {
    }

    /**
     * 
     */
    private String profesion;

    /**
     * 
     */
    private Double salario;

    /**
     * 
     */
    private Float estatura;

    /**
     * 
     */
    private Float peso;
    
    
    
    
    

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Float getEstatura() {
        return estatura;
    }

    public void setEstatura(Float estatura) {
        this.estatura = estatura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
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

    public Docente(String profesion, Double salario, Float estatura, Float peso) {
        this.profesion = profesion;
        this.salario = salario;
        this.estatura = estatura;
        this.peso = peso;
    }

    public Docente(String profesion, Double salario, Float estatura, Float peso, String nombre, String apellido, String codigo) {
        super(nombre, apellido, codigo);
        this.profesion = profesion;
        this.salario = salario;
        this.estatura = estatura;
        this.peso = peso;
    }

   

    public double calcularIMC() {
        // TODO implement here
        double imcPersona;
        
        imcPersona = peso/(estatura*estatura);
        
        return imcPersona;
    }

    
    public String composicionCorporal(){
        String r = "Dato invalido";
       if(calcularIMC()<18.5)
           r = " peso inferior al normal"; 
       else if(calcularIMC()>18.6 && calcularIMC()<25.0 )
           r =" peso normal";
       else if(calcularIMC()>24.9 && calcularIMC()<30.0 )
           r =" peso superior normal";
       else if(calcularIMC()>30.0 )
           r =" obesidad";
       
        return r;
    } 
    
    public String salarioNuevo(double salario){
        this.salario =salario;
        String r="El salario Nuevo del docente es " + salario ;
        return r;
    }
}