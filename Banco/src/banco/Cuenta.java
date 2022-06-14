package banco;

/**
 * 
 */
public class Cuenta {

    /**
     * Default constructor
     */
    public Cuenta() {
    }

    public Cuenta(int numero, Double monto, Double saldo) {
        this.numero = numero;
        this.monto = monto;
        this.saldo = saldo;
    }

    /**
     * 
     */
    private int numero;

    /**
     * 
     */
    private Double monto;

    /**
     * 
     */
    private Double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }






}