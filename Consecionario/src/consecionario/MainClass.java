package consecionario;

import static java.lang.System.out;



/**
 *
 * @author hecto
 */
public class MainClass {

    public static void main(String[] args) {
        
       
        
        
        
        
        
        Motor motor1 = new Motor();
        motor1.setCapacidad("600caballitos");
        motor1.setnSerie("111222");

        Chasis chasis1 = new Chasis();
        chasis1.setNumero(123);
        chasis1.setProcedencia("USA");
        
        Automovil automovil1 = new Automovil(motor1,chasis1,"FORD","Fiesta",4);
        
        
        Clientes cliente1 = new Clientes("1090515151", "Hector", "Duarte ", 'M', "La hermita",automovil1);
        Clientes cliente2 = new Clientes("1090515152", "Alexander", "Arevalo ", 'M', "La hermita",automovil1);
        Clientes cliente3 = new Clientes("1090515153", "Yurley", "Camacho ", 'F', "La hermita",automovil1);
        Clientes cliente4 = new Clientes("1090515154", "Viviana", "Plata ", 'F', "La hermita",automovil1);
        out.println(cliente1.imprimirAuto());
        
        automovil1.actualizarInfo("500Caballitos", "222333", 234, "COL", "CHEVROLET", "Onix", 4);
        out.println(cliente1.imprimirAuto());
        
        out.println(cliente1.contadorPorGenero());
        out.println(cliente2.contadorPorGenero());
        out.println(cliente3.contadorPorGenero());
        out.println(cliente4.contadorPorGenero());
       
    }
}
   
    
