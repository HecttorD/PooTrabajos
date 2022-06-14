package votos;



/**
 * 
 */
public class Candidato {

    /**
     * Default constructor
     */
    public Candidato() {
    }

    /**
     * 
     */
    private String nombre ;

    /**
     * 
     */
    private int numeroID ;

    /**
     * 
     */
    private String email ;

    /**
     * 
     */
    private char genero ;

    /**
     * 
     */
    private int telefono ;

    /**
     * 
     */
    
    private int numeroInscripcion ;

    static double votos;
    static double votosSenado;
    static double votosCamara;
     double votoCandidatoS= 0;
     double votoCandidatoC= 0;
    
    
    
    
    public Candidato(String nombre, int numeroID, String email, char genero, int telefono, int numeroInscripcion) {
        this.nombre =  nombre;
        this.numeroID =  numeroID;
        this.email =  email;
        this.genero =  genero;
        this.telefono =  telefono;
        this.numeroInscripcion =  numeroInscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre =  nombre;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID =  numeroID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email =  email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero =  genero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono =  telefono;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion =  numeroInscripcion;
    }


    
    
    
    /**
     * 
     */
    public boolean  VerificarDatos() {
        // TODO implement here
        
     
         return (numeroInscripcion>0 && numeroInscripcion<106) ;
    }
    
    /**
     * 
     */
    public void Votar() {
        // TODO implement here
        
        if( VerificarDatos()== true){
        votos++;
        if(numeroInscripcion<101){
        votosSenado++;
        votoCandidatoS++;
        }else if(numeroInscripcion>100){
        votosCamara++;
        votoCandidatoC++;
        }
    }
        
    }

    /**
     * 
     */
    public String ImprimirPorcentaje() {
        // TODO implement here
        double r= 0;
        if(numeroInscripcion<101)
        r=  (votoCandidatoS/votosSenado)*100;

        else if(numeroInscripcion>100)
        r=  (votoCandidatoC/votosCamara)*100;
        
        return r+"%";
    }

    @Override
    public String toString() {
        String r=null;
        if(VerificarDatos())
        r= "Candidato {" + "\nnombre= " + nombre + "\nnumeroID= " + numeroID + "\nemail= " + email + "\ngenero= " + genero + "\ntelefono= " + telefono + "\nnumeroInscripcion= " + numeroInscripcion + '}';
        else r= "------------------------CANDIDATO NO VALIDO ------------------------------"+
                "\nCandidato {" + "\nnombre= " + nombre + "\nnumeroID= " + numeroID + "\nemail= " + email + "\ngenero= " + genero + "\ntelefono= " + telefono + "\nnumeroInscripcion= " + numeroInscripcion + '}';;
        
        
    return r;
    }

    /**
     * 
     */
    
    
    
    
}