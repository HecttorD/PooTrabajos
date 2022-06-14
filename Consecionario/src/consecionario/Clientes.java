package consecionario;


/**
 *
 * @author hector
 */
public class Clientes {
    
    private String documento;
    private String nombre;
    private String apellido;
    private char genero;
    private String direccion;
    private Automovil automovil;

    private static int cMujeres=0;
    private static int cHombres=0;
    
                
    public Clientes(String documento, String nombre, String apellido, char genero, String direccion, Automovil automovil) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
        this.automovil = automovil;
    }
                    
    
    
    public void Clientes(){
        
    }
    
    
    

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    
    
    public String  imprimirAuto(){
        String r;
        
        r= "El modelo del Auto es " + automovil.getModelo()+" de la marca " + automovil.getMarca()+ " la capacidad de su motor es " +  automovil.getMotor().getCapacidad()+ " y su chasis proviene de " +    automovil.getChasis().getProcedencia();
        
       
        
        return r;
    }
   
    
    public String contadorPorGenero(){
        String r=null;
        
            if(genero =='f'|| genero == 'F')
                cMujeres++;
            else if(genero =='m'|| genero == 'M')
                cHombres++;
            
        return r="La cantidad de hombres es: "+ cHombres + " Y la cantidad de Mujeres es: "+cMujeres;
    }
}

