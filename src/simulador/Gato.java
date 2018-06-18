package simulador;
/**
*@author Óscar Meléndez
* @version 8.2
* Esta clase hace referencia al tipo de animal cerdo el cual puede emitir un 
* sonido y puede tener un nombre
*/
public class Gato {
    private final String SONIDO_GATO="Miau, miau";
    public String nombreGato;
    public Gato(){
        this.nombreGato="Gato";
    }
    /*
    *El metodo gruñir retorna el sonido del animal "Gato"
    */
    public String maullar(){
        return this.SONIDO_GATO;
    }
}
