package modelo;
 
import modelo.Feligres;
import modelo.Iglesia;
import modelo.Diezmo;
import Vista.Vista;
import Control.Control;
import java.awt.event.ActionEvent;

public class Iglesia {

    public static void main(String[] args) {

        Vista vista = new Vista();
        Feligres feligres = new Feligres();
        Iglesia iglesia = new Iglesia();
        Diezmo diezmo = new Diezmo();
        Control control = new Control(feligres, iglesia, vista, diezmo);

        
        vista.setVisible(true);
    }
}
