package simulador;
/**
*@author Óscar Meléndez
* @version 8.2
* Esta clase hace referencia al tipo de animal cerdo el cual puede emitir un 
* sonido y puede tener un nombre
*/
public class Perro {
    private final String LADRAR="Guau gua";
    public String nombrePerro;
    public Perro(){
        this.nombrePerro="Perro";
    }
    /*
    *El metodo gruñir retorna el sonido del animal "Perro"
    */
    public String ladrar(){
        return this.LADRAR;
    }
}
