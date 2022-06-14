package imc;

/**
 *
 * @author hecto
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Docente docente1 = new Docente("Ing. Sistemas", 1500000.00,1.72f , 78.5f, "Juanito", "Perez", "1151555");
        Docente docente2 = new Docente("Ing. Civil", 1300000.00,1.62f , 52.5f, "Maria", "Ortiz", "1224644");
        Docente docente3 = new Docente("Ing. Biotecnologico", 1800000.00,1.42f , 110.5f, "Alexander", "Urtado", "1448821");
        Docente docente4 = new Docente("Ing. Industrial", 1200000.00,2.10f , 30.0f, "Alejandro", "Espinoza", "1148521");
        
        System.out.println("El imc del docente "+docente1.nombre+" es " +docente1.calcularIMC()+" Y su composición corporal es"+ docente1.composicionCorporal());
        System.out.println(docente1.salarioNuevo(2165655.22)+"\n");
        System.out.println("El imc del docente "+docente2.nombre+" es " +docente2.calcularIMC()+" Y su composición corporal es"+ docente2.composicionCorporal());
        System.out.println(docente2.salarioNuevo(6546874.222)+"\n");
        System.out.println("El imc del docente "+docente3.nombre+" es " +docente3.calcularIMC()+" Y su composición corporal es"+ docente3.composicionCorporal());
        System.out.println(docente3.salarioNuevo(879421.123)+"\n");
        System.out.println("El imc del docente "+docente4.nombre+" es " +docente4.calcularIMC()+" Y su composición corporal es"+ docente4.composicionCorporal());
        System.out.println(docente4.salarioNuevo(4874658.4652)+"\n");
        
        Carrera carrera1= new Carrera("Ingenieria de Sitemas", "115", 164);
        Carrera carrera2= new Carrera("Ingenieria Civil", "122", 164);
        Carrera carrera3= new Carrera("Ingenieria Biotecnologica", "144", 164);
        Carrera carrera4= new Carrera("Ingenieria Industrial", "114", 164);

        Estudiante estudiante1 = new Estudiante(carrera1, 7, 154, "Pedro", "Picapiedra", "1159872");
        Estudiante estudiante2 = new Estudiante(carrera2, 9, 155, "Maria", "Picapiedra", "1229512");
        Estudiante estudiante3 = new Estudiante(carrera3, 5, 40, "Andreh", "Vaquita", "14441235");
        Estudiante estudiante4 = new Estudiante(carrera4, 6, 77, "Angelika", "Singer", "1141789");
        
        System.out.println(estudiante1.proyetoGrado());
        System.out.println(estudiante2.proyetoGrado());
        System.out.println(estudiante3.proyetoGrado());
        System.out.println(estudiante4.proyetoGrado()+"\n");
        
        
        
        
        Administrativo administrativo1 = new Administrativo(2016, "Paco", "Pereh", "802530");
        Administrativo administrativo2 = new Administrativo(1986, "Paca", "Pereh", "802531");
        Administrativo administrativo3 = new Administrativo(1982, "Peque", "Pereh", "802532");
        Administrativo administrativo4 = new Administrativo(2000, "Pico", "Pereh", "802533");
        
        
        
        System.out.println("La antiguedad del Administrativo " +administrativo1.nombre+ " es " +administrativo1.calcularAntiguedad());
        System.out.println("La antiguedad del Administrativo " +administrativo2.nombre+ " es " +administrativo2.calcularAntiguedad());
        System.out.println("La antiguedad del Administrativo " +administrativo3.nombre+ " es " +administrativo3.calcularAntiguedad());
        System.out.println("La antiguedad del Administrativo " +administrativo4.nombre+ " es " +administrativo4.calcularAntiguedad());
        
        
        
    }
    
}
