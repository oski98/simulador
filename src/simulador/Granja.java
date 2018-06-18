package simulador;

/**
 * En el siguiente bloque de codigo se realiza la importación de librerias
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/**
 * 
 * @author Óscar Meléndez
 * En está clase se granja se crean arreglos dinamicos en los cuales se 
 * almacenan objetos de tipo animal
 */
public class Granja {
    List<String>corralCerdo = new ArrayList();
    List<String>corralGallo = new ArrayList();
    List<String>corralGato = new ArrayList();
    List<String>corralOveja = new ArrayList();
    List<String>corralPerro = new ArrayList();
    List<String>corralVaca = new ArrayList();
    /**
     * Este metodo sin retorno instancia los animales creados en las clases 
     * anteriores, los almacena y los imprime en forma aleatoria
     */
    public void simuladorAnimal(){
        Cerdo miCerdo = new Cerdo();
        Gallo miGallo = new Gallo();
        Gato miGato = new Gato();
        Oveja miOveja = new Oveja();
        Perro miPerro = new Perro();
        Vaca miVaca = new Vaca();
        int iCerdo = 0;
        int iGallo = 0;
        int iGato = 0;
        int iOveja = 0;
        int iPerro = 0;
        int iVaca = 0;
        int random=(int)(Math.random()*6);
        
        while(true){
            switch(random){
                case 0:
                    iCerdo++;
                    random=(int)(Math.random()* corralCerdo.size());
                    corralCerdo.add(miCerdo.nombreCerdo + random + miCerdo.grunir());
                    Iterator miCorral = corralCerdo.iterator();
                    
                   while(miCorral.hasNext()){
                       System.out.println(miCorral.next());
                   }
                   break;
                    
                case 1:
                    iGallo++;
                    random=(int)(Math.random()* corralGallo.size());
                    corralGallo.add(miGallo.nombreGallo + random + miGallo.cacareaquear());
                    Iterator miCorral2 = corralGallo.iterator();
                    
                   while(miCorral2.hasNext()){
                       System.out.println(miCorral2.next());
                   }
                   break;
                case 2:
                    iGato++;
                    random=(int)(Math.random()* corralGato.size());
                    corralGato.add(miGato.nombreGato + random + miGato.maullar());
                    Iterator miCorral3 = corralGato.iterator();
                    
                   while(miCorral3.hasNext()){
                       System.out.println(miCorral3.next());
                   }
                   break;
                case 3:
                    iPerro++;
                    random=(int)(Math.random()* corralPerro.size());
                    corralPerro.add(miPerro.nombrePerro + random + miPerro.ladrar());
                    Iterator miCorral4 = corralPerro.iterator();
                    
                   while(miCorral4.hasNext()){
                       System.out.println(miCorral4.next());
                   }
                   break;
                case 4:
                    iOveja++;
                    random=(int)(Math.random()* corralOveja.size());
                    corralOveja.add(miOveja.nombreOveja + random + miOveja.balar());
                    Iterator miCorral5 = corralOveja.iterator();
                    
                   while(miCorral5.hasNext()){
                       System.out.println(miCorral5.next());
                   }
                   break;
                case 5:
                    iVaca++;
                    random=(int)(Math.random()* corralVaca.size());
                    corralOveja.add(miVaca.nombreVaca + random + miVaca.mujir());
                    Iterator miCorral6 = corralVaca.iterator();
                    
                   while(miCorral6.hasNext()){
                       System.out.println(miCorral6.next());
                   }
                   break;
            }
        
        }
    }
}
