package consecionario;

/**
 *
 * @author hector
 */
public class Motor {
    
    
    private String capacidad;
    private String nSerie;
    
    
    public void Motor(String capacidad, String nSerie){
        
        this.capacidad = capacidad;
        this.nSerie = nSerie;
        
    }
    public void Motor(){
        
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }
    
}
