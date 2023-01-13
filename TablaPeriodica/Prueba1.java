
/**
 * Write a description of class Prueba1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba1
    {
        /**
     * args[0] contiene el nombre del archivo de elementos: elementos.csv
     *Active buffering ilimitado
     *  
     */
    public static void main(String[] args){
        String archivo = args[0];
        Tablaperiodica t = new Tablaperiodica() ;
        t.crear(archivo);
        
        t.buscarC("Todos");
        t.buscarE("H");
        t.buscarE("22");
        t.buscarE("boro");
        t.buscarE("sc");
        t.buscarE("kl");
        t.buscarE("KR");
        t.buscarE("hG");
        
         
    
    
    }
}
