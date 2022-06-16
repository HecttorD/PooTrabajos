package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Feligres;
import modelo.Iglesia;
import Vista.Vista;
import modelo.Diezmo;

public class Control implements ActionListener {

    private Vista vista = null;
    private Feligres feligres = null;
    private Iglesia iglesia = null;
    private Diezmo diezmo = null;

    public Control(Feligres feligres, Iglesia iglesia, Vista vista, Diezmo diezmo) {

        super();
        this.vista = vista;
        this.feligres = feligres;
        this.iglesia = iglesia;
        this.diezmo = diezmo;
        actionListener(this);
    }

    private void actionListener(Control control) {

        System.out.println("Action Listener ");

        vista.btnGuardar.addActionListener(control);
        vista.btnEliminar.addActionListener(control);
        vista.btnActualizar.addActionListener(control);
        vista.btnBuscar.addActionListener(control);
        vista.btnConsultar.addActionListener(control);
        vista.btnPagar.addActionListener(control);
        vista.btnTotalizar.addActionListener(control);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            System.out.println("Action event");

            if (e.getActionCommand().contentEquals("Guardar")) {

                System.out.println("Boton guardar");

                String cedula = vista.txtCedulaR.getText();
                String nombre = vista.txtNombre.getText();
                String direccion = vista.txtDireccion.getText();
                String telefono = vista.txtTelefono.getText();
                String estrato = vista.txtEstrato.getText();
                String estado = vista.txtEstado.getText();

                feligres.setCedula(cedula);
                feligres.setNombre(nombre);
                feligres.setDireccion(direccion);
                feligres.setTelefono(telefono);
                feligres.setEstrato(estrato);
                feligres.setEstado(estado);

                feligres.AñadirFeligres(cedula, nombre, direccion, telefono, estrato, estado);

                vista.txaResultados.setText("Se ha añadido el feligres: " + feligres.getNombre());

            } else if (e.getActionCommand().contentEquals("Buscar")) {
                System.out.println("Boton Buscar");
                String cedula = vista.txtCedulaR.getText();
                String nombre = vista.txtNombre.getText();
                String direccion = vista.txtDireccion.getText();
                String telefono = vista.txtTelefono.getText();
                String estrato = vista.txtEstrato.getText();
                String estado = vista.txtEstado.getText();

                feligres.setCedula(cedula);
                feligres.setNombre(nombre);
                feligres.setDireccion(direccion);
                feligres.setTelefono(telefono);
                feligres.setEstrato(estrato);
                feligres.setEstado(estado);

                feligres.BuscarFeligres(feligres);

            }
            else if (e.getActionCommand().contentEquals("Eliminar")) {

                System.out.println("Boton Eliminar");

                String cedula = vista.txtCedulaR.getText();
                String nombre = vista.txtNombre.getText();
                String direccion = vista.txtDireccion.getText();
                String telefono = vista.txtTelefono.getText();
                String estrato = vista.txtEstrato.getText();
                String estado = vista.txtEstado.getText();

                feligres.setCedula(cedula);
                feligres.setNombre(nombre);
                feligres.setDireccion(direccion);
                feligres.setTelefono(telefono);
                feligres.setEstrato(estrato);
                feligres.setEstado(estado);

                

                vista.txaResultados.setText("Se ha Eliminado el feligres: " + feligres.getNombre());
        }
            else if (e.getActionCommand().contentEquals("Actualizar")) {

                System.out.println("Boton Actualizar");

                String cedula = vista.txtCedulaR.getText();
                String nombre = vista.txtNombre.getText();
                String direccion = vista.txtDireccion.getText();
                String telefono = vista.txtTelefono.getText();
                String estrato = vista.txtEstrato.getText();
                String estado = vista.txtEstado.getText();

                feligres.setCedula(cedula);
                feligres.setNombre(nombre);
                feligres.setDireccion(direccion);
                feligres.setTelefono(telefono);
                feligres.setEstrato(estrato);
                feligres.setEstado(estado);

                

                vista.txaResultados.setText("Se ha actualizado el feligres: " + feligres.getNombre());
        }
            
            else if (e.getActionCommand().contentEquals("Consultar")) {

                System.out.println("Boton Consultar");

                double valorDiezmo = Double.parseDouble(vista.txtValorDiezmo.getText());
                String cedulaD = vista.txtCedulaD.getText();
                String nombre = vista.txtNombre.getText();
                String direccion = vista.txtDireccion.getText();
                String telefono = vista.txtTelefono.getText();
                String estrato = vista.txtEstrato.getText();
                String estado = vista.txtEstado.getText();
                
                diezmo.setDiezmo(valorDiezmo);
                feligres.setCedula(cedulaD);
                feligres.setNombre(nombre);
                feligres.setDireccion(direccion);
                feligres.setTelefono(telefono);
                feligres.setEstrato(estrato);
                feligres.setEstado(estado);
                
                vista.txaResultados.setText("el valor del diezmo es: ....");
                

                vista.txaResultados.setText("Se ha actualizado el feligres: " + feligres.getNombre());
        }
            
            
        }catch (Exception ex) {
            ex.printStackTrace();

            System.out.println("Exeption");
        }

        
        
        
    }
}
