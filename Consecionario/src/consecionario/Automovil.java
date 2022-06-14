package consecionario;

/**
 *
 * @author hecto
 */
public class Automovil {
    
    
    private Motor motor;
    private Chasis chasis;
    private String marca;
    private String modelo;
    private int nPuertas;

    public Automovil(Motor motor, Chasis chasis, String marca, String modelo, int nPuertas) {
        this.motor = motor;
        this.chasis = chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.nPuertas = nPuertas;
    }
    
    
    
    public void Automovil(){
        
    }
            

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
    
    public void actualizarInfo(String motorC, String motorS, int nChasis, String pChasis, String marca, String modelo, int nPuertas){
        
        this.motor.setCapacidad(motorC);
        this.motor.setnSerie(motorS);
        this.chasis.setNumero(nChasis);
        this.chasis.setProcedencia(pChasis);
        this.marca = marca;
        this.modelo = modelo;
        this.nPuertas = nPuertas;
           
    }
    
    
}
