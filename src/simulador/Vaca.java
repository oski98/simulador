package simulador;
/**
*@author Óscar Meléndez
* @version 8.2
* Esta clase hace referencia al tipo de animal cerdo el cual puede emitir un 
* sonido y puede tener un nombre
*/
public class Vaca {
    private final String SONIDO_VACA="Muuu";
    public String nombreVaca;
    public Vaca(){
        this.nombreVaca="Vaca";
    }
    /*
    *El metodo gruñir retorna el sonido del animal "Vaca"
    */
    public String mujir(){
        return this.SONIDO_VACA;
    }
}
