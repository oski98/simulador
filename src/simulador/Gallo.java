package simulador;
/**
*@author Óscar Meléndez
* @version 8.2
* Esta clase hace referencia al tipo de animal cerdo el cual puede emitir un 
* sonido y puede tener un nombre
*/
public class Gallo {
    private final String SONIDO_GALLO="Qui Quiri Qui";
    public String nombreGallo;
    public Gallo(){
        this.nombreGallo="Gallo";
    }
    /*
    *El metodo gruñir retorna el sonido del animal "Gallo"
    */
    public String cacareaquear(){
        return this.SONIDO_GALLO;
    }
}
