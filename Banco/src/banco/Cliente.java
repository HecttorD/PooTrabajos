package banco;


/**
 * 
 */
public class Cliente {

    /**
     * Default constructor
     */
    public Cliente() {
    }

    /**
     * 
     */
    private String rut;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;
    
    private CuentaAhorro cuentaA;
    private CuentaCorriente cuentaC;

    public Cliente(String rut, String nombre, String apellido, CuentaAhorro cuentaA, CuentaCorriente cuentaC) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentaA = cuentaA;
        this.cuentaC = cuentaC;
    }
    
    public Cliente(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    

    public CuentaAhorro getCuentaA() {
        return cuentaA;
    }

    public void setCuentaA(CuentaAhorro cuentaA) {
        this.cuentaA = cuentaA;
    }

    public CuentaCorriente getCuentaC() {
        return cuentaC;
    }

    /**
     * 
     * @param cuentaC
     */
    public void setCuentaC(CuentaCorriente cuentaC) {    
        this.cuentaC = cuentaC;
    }

    public String getRunt() {
        return rut;
    }

    public void setRunt(String rut) {
        this.rut = rut;
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

    
    public String MostrarCuentas() {
        // TODO implement here
        String r="El Cliente "+nombre +" "+ apellido+" No tiene una cuenta en nuestro banco." ;
        if(cuentaA != null)
            r="El Cliente "+nombre +" "+ apellido+ " tiene una cuenta de Ahorro con el numero "+cuentaA.getNumero();
        if(cuentaC != null)
            r="El Cliente "+nombre +" "+ apellido+ " tiene una cuenta Corriente con el numero "+cuentaC.getNumero();
        if(cuentaA != null && cuentaC != null)
            r="El Cliente "+nombre +" "+ apellido+ " tiene una cuenta de Ahorro con el numero "+cuentaA.getNumero()+" y tiene una cuenta Corriente con el numero "+cuentaC.getNumero();
        return r;
    }

    /**
     * 
     */
    public String DeterminarCuenta() {
        // TODO implement here
        String r="El Cliente "+nombre +" "+ apellido+" No tiene una cuenta en nuestro banco." ;
        if(cuentaA != null||cuentaC != null)
            r="El Cliente "+nombre +" "+ apellido+ " tiene una cuenta con nuestro banco";
        
        if(cuentaA != null && cuentaC != null)
            r="El Cliente "+nombre +" "+ apellido+ " tiene dos cuentas en nuestro banco";
        return r;
    }

    /**
     * 
     */
    public String MostrarSaldoEnCuentas() {
        // TODO implement here
        String r="El Cliente "+nombre +" "+ apellido+" No tiene una cuenta en nuestro banco.";
        if(cuentaA != null)
            r="El Cliente "+nombre +" "+ apellido+ " tiene "+ cuentaA.getSaldo() +" saldo en la cuenta de Ahorro con el numero "+cuentaA.getNumero();
        if(cuentaC != null)
            r="El Cliente "+nombre +" "+ apellido+ " tiene "+ cuentaC.getSaldo() +" saldo en la cuenta Corriente con el numero "+cuentaC.getNumero();
        if(cuentaA != null && cuentaC != null)
            r="El Cliente "+nombre +" "+ apellido+ " tiene "+ cuentaA.getSaldo() +" saldo en la cuenta de Ahorro con el numero "+cuentaA.getNumero()+" y tiene "+ cuentaC.getSaldo() +" saldo en la cuenta Corriente con el numero "+cuentaC.getNumero();
        return r;
    }
    
    
    
}