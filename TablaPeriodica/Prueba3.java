
/**
 * Write a description of class Prueba3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba3
{   /**
     * args[0] contiene el nombre del archivo de elementos: elementos.csv
     *Active buffering ilimitado
     *  
     */
    public static void main(String[] args){
        String archivo = args[0];
        Tablaperiodica t = new Tablaperiodica() ;
        t.crear(archivo);
        
        System.out.println(">>>>>>>>>>>>>>>>GRUPOS DE LA TABLA PERIODICA<<<<<<<<<<<<<<<");
        //se imprimen las clasficaciones de los 18 grupos
        for(int i = 1; i <= 18; i++){
            String j = String.valueOf(i);
            t.buscarC(j);
        
        }
    
    }
}
