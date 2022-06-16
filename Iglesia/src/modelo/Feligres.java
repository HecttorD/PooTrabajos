package modelo;

import java.util.ArrayList;

public class Feligres {

    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String estrato;
    private String estado;

    public Feligres() {
    }

    public Feligres(String cedula, String nombre, String direccion, String telefono, String estrato, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;
    }

    public ArrayList<Feligres> getFeligres() {
        return ALfeligres;
    }

    public void setFeligres(ArrayList<Feligres> feligres) {
        this.ALfeligres = feligres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    ArrayList<Feligres> ALfeligres = new ArrayList();

    public void AñadirFeligres(String cedula, String nombre, String direccion, String telefono, String estrato, String estado) {
        
        
            ALfeligres.add(new Feligres(cedula, nombre, telefono, direccion, estrato, estado));
            
     
        

    }

    public double CalcularEstratoDiezmo() {
        double valorDiezmo = 0;
        if (null == getEstrato()) {
            valorDiezmo = 0;
        } else switch (getEstrato()) {
            case "1":
                valorDiezmo = 250000;
                break;
            case "2":
                valorDiezmo = 500000;
                break;
            case "3":
                valorDiezmo = 1000000;
                break;
            default:
                valorDiezmo = 0;
                break;
        }

        return valorDiezmo;
    }

    public void BuscarFeligres(Feligres feligres) {
        System.out.println(ALfeligres.size());
       System.out.println("Hola");

        for (int i = 0; ALfeligres.size() > i; i++) {

            System.out.println("CLARAMENTE " + ALfeligres.get(i).getCedula() + " es igual a "+ feligres.cedula );
            System.out.println(ALfeligres.get(i).getCedula());
            System.out.println(feligres.cedula);
            System.out.println("no entiendo :'(");
            if(feligres.cedula == ALfeligres.get(i).getCedula()){
                System.out.println("Si está");
            }else {
                System.out.println("No está");
                System.out.println("NO ENTIENDO POR QUÉ NO");
            }
        }

    }
    
    public void ActualizarFeligres(String cedula, String nombre, String direccion, String telefono, String estrato, String estado){
        
        
        
        
        
    }
}
