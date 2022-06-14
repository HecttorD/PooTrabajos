package banco;


/**
 * 
 */
public class CuentaCorriente extends Cuenta{

    /**
     * Default constructor
     */
    public CuentaCorriente() {
    }

    public CuentaCorriente(Double credito, double saldoDisponible, double saldoContable) {
        this.credito = credito;
        this.saldoDisponible = saldoDisponible;
        this.saldoContable = saldoContable;
    }

    public CuentaCorriente(Double credito, double saldoDisponible, double saldoContable, int numero, Double monto, Double saldo) {
        super(numero, monto, saldo);
        this.credito = credito;
        this.saldoDisponible = saldoDisponible;
        this.saldoContable = saldoContable;
    }

    

    /**
     * 
     */
    private Double credito;

    /**
     * 
     */
    private double saldoDisponible;

    /**
     * 
     */
    private double saldoContable;

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoContable() {
        return saldoContable;
    }

    public void setSaldoContable(double saldoContable) {
        this.saldoContable = saldoContable;
    }


}