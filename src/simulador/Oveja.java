package simulador;
/**
*@author Óscar Meléndez
* @version 8.2
* Esta clase hace referencia al tipo de animal cerdo el cual puede emitir un 
* sonido y puede tener un nombre
*/
public class Oveja {
    private final String SONIDO_OVEJA="Beeeee";
    public String nombreOveja;
    public Oveja(){
        this.nombreOveja="Oveja";
    }
    /*
    *El metodo gruñir retorna el sonido del animal "Oveja"
    */
    public String balar(){
        return this.SONIDO_OVEJA;
    }
}
