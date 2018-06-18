package simulador;
/**
*@author Óscar Meléndez
* @version 8.2
* Esta clase hace referencia al tipo de animal cerdo el cual puede emitir un 
* sonido y puede tener un nombre
*/
public class Cerdo {
    private final  String SONIDO_CHANCO="Oing, oing ";
    public String nombreCerdo;
    public Cerdo(){//Constructor
        this.nombreCerdo="Cerdo";
    }
    /*
    *El metodo gruñir retorna el sonido del animal "Cerdo"
    */
    public String grunir(){
        return this.SONIDO_CHANCO;
    }
}

