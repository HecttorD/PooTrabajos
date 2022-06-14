package banco;


/**
 * 
 */
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(Double girosM, Double tasaInteres) {
        this.girosM = girosM;
        this.tasaInteres = tasaInteres;
    }

    public CuentaAhorro(Double girosM, Double tasaInteres,int numero, Double monto, Double saldo) {
        super(numero, monto, saldo);
        this.girosM = girosM;
        this.tasaInteres = tasaInteres;
    }

    
    

    /**
     * 
     */
    private Double girosM;

    /**
     * 
     */
    private Double tasaInteres;

    /**
     * Default constructor
     */
    public CuentaAhorro() {
    }

    public Double getGirosM() {
        return girosM;
    }

    public void setGirosM(Double girosM) {
        this.girosM = girosM;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
}