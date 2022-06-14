package banco;


/**
 *
 * @author estudiante
 */
public class Banco {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        CuentaAhorro cuentaA1 = new CuentaAhorro(65463.123, 58654.23, 12, 1837.11, 74135.12);
        CuentaAhorro cuentaA2 = new CuentaAhorro(87621.13, 79541.55, 87, 38754.25, 83234.98);
        CuentaAhorro cuentaA3 = new CuentaAhorro(9782.65, 57821.12, 83, 2143.12, 85146.48);
        
        CuentaCorriente cuentaC1 = new CuentaCorriente(79842.33, 876243.45, 789561.15, 97, 7576.45, 7898.45);
        CuentaCorriente cuentaC2 = new CuentaCorriente(45115.78, 575321.78, 14634.99, 54, 3486.00, 69716.06);
        CuentaCorriente cuentaC3 = new CuentaCorriente(8432.11, 6838.50, 92438.24, 40, 4824.54, 5832.15);
        
        Cliente cliente1 = new Cliente("Az12", "Pepito", "Perez", cuentaA1, cuentaC1);
        Cliente cliente2 = new Cliente("Aw31", "Juancho", "Alvert", cuentaA1, null);
        Cliente cliente3 = new Cliente("Cs541", "Alex", "Flores", null, cuentaC1);
        Cliente cliente4 = new Cliente("Lq34", "Pedro", "Martinez", null, null);
        System.out.println(cliente1.MostrarCuentas());
        System.out.println(cliente2.MostrarCuentas());
        System.out.println(cliente3.MostrarCuentas());
        System.out.println(cliente4.MostrarCuentas()+"\n");
        
        System.out.println(cliente1.DeterminarCuenta());
        System.out.println(cliente2.DeterminarCuenta());
        System.out.println(cliente3.DeterminarCuenta());
        System.out.println(cliente4.DeterminarCuenta()+"\n");
        
        System.out.println(cliente1.MostrarSaldoEnCuentas());
        System.out.println(cliente2.MostrarSaldoEnCuentas());
        System.out.println(cliente3.MostrarSaldoEnCuentas());
        System.out.println(cliente4.MostrarSaldoEnCuentas());
        
    }
}
