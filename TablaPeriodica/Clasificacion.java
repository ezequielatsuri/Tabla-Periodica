
/**
 * Write a description of class Clasificaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clasificacion
{
   
   String nombre;
   
   SinglyLinkedList<Elemento> clasificacion = new SinglyLinkedList<Elemento>();
   
   public Clasificacion(String nombre,SinglyLinkedList<Elemento> clasificacion){
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }
    public  SinglyLinkedList<Elemento> getTabla(){
        return clasificacion;
    }
    public String getNombre(){
        return nombre;
    }
   

}
