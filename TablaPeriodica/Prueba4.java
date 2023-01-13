
/**
 * Write a description of class Prueba4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba4
{    /**
     * args[0] contiene el nombre del archivo de elementos: elementos.csv
     *Active buffering ilimitado
     *  
     */
    public static void main(String[] args){
        String archivo = args[0];
        Tablaperiodica t = new Tablaperiodica() ;
        t.crear(archivo);
       // String[] keys = {"Liquido","Gas","Solido","Desconocido"};
        String[] keys = {"Metal","Alcalino","Alcalinoterreos","Transicion","Postransicionales","Metaloides ","Lactinidos","Actinidos","Nometal","No metal","Halogenos","Gasesnobles"};
        //String[] keys = {"Metales","Nometales","Gases","Liquidos","Gases"};
        System.out.println(">>>>>>>>>>>>>>>>CLASIFICACIÓN POR METALES Y NO METALES<<<<<<<<<<<<<<<");
        for(int i = 0; i < 12; i++){
            t.buscarC(keys[i]);
        
        }
         
    
    
    }
}
