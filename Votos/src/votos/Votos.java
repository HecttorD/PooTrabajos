package votos;

/**
 *
 * @author estudiante
 */
public class Votos {

    /**
     * @param args the command line arguments
     */

	public static void main(String[] args) {
		
                Candidato candidato1 = new Candidato("Juanito perez", 1234, "asdsfa", 'M', 651651, 100);
                Candidato candidato2 = new Candidato("Alejandra Muñoz", 4321, "flkkjgjfg", 'F', 85246, 103);
                Candidato candidato3 = new Candidato("Maria", 8521, "fasdf", 'F', 98796, 92);
                Candidato candidato4 = new Candidato("Alexis Mora", 4563, "fgasdgdg", 'm', 34423, 104);
                Candidato candidato5 = new Candidato("Alexis Mora", 4563, "fgasdgdg", 'm', 34423, 106);
                
                candidato1.VerificarDatos();
                
                candidato1.Votar();
                candidato1.Votar();
                candidato1.Votar();
                candidato1.Votar();
                candidato1.Votar();
                candidato1.Votar();
                
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                
                
                candidato4.Votar();
                candidato4.Votar();
                candidato4.Votar();
                candidato4.Votar();
                candidato4.Votar();
                
                
                
                candidato1.Votar();
                candidato1.Votar();
                candidato1.Votar();
                candidato1.Votar();
                
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                candidato2.Votar();
                
                
                
                candidato3.Votar();
                candidato3.Votar();
                candidato3.Votar();
                candidato3.Votar();
                candidato3.Votar();
                candidato3.Votar();
                

                System.out.println(candidato1.toString());
                System.out.println("Candidato Numero 1: "+candidato1.ImprimirPorcentaje()+"\n");
                System.out.println(candidato2.toString());
                System.out.println("Candidato Numero 2: "+candidato2.ImprimirPorcentaje()+"\n");
                System.out.println(candidato3.toString());
                System.out.println("Candidato Numero 3: "+candidato3.ImprimirPorcentaje()+"\n");
                System.out.println(candidato4.toString());
                System.out.println("Candidato Numero 4: "+candidato4.ImprimirPorcentaje()+"\n");
                
                System.out.println(candidato5.toString());
                System.out.println("Candidato Numero 5: "+candidato5.ImprimirPorcentaje());
                
                
                
                
                
            
                
                
	}
}
    
    
    
    
    
    

