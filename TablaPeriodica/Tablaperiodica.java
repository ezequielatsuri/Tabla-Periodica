
/**
 * Write a description of class Tablaperiodica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablaperiodica
{
     ST <String, Elemento>   st = new  ST<String, Elemento>();
     ST<String, Clasificacion> st1 = new ST<String, Clasificacion>();
     public  void crear(String archivo){
         st = rellenar(archivo);
         st1 = clasificar(archivo);
        }
     
     public  void buscarE(String elemento){
           boolean found = false;
            for (String sk: st.keys()) {
            
            if (st.get(sk).getNombre().equalsIgnoreCase(elemento) || st.get(sk).getSimbolo().equalsIgnoreCase(elemento) || st.get(sk).getNumeroA().equals(elemento)){
                System.out.printf("--->%-12s %-12s %-12s %-12s %-18s %-21s %-15s %-15s %-12s %-12s %-12s %-5s %-7s%n","Nombre","NumeroA","Simbolo","Peso","Punto Fusion","Punto Ebullicion","Fase","Configuracio","Oxidacion","Valencias","Naturaleza","Grupo","Periodo");
                StdOut.println("--->"+st.get(sk));
                found = true;
            }
           }
           if(found == false ) 
              StdOut.println("Not found");
          
            System.out.println();
            System.out.println();
    }
    
   public  void buscarC( String clasifi){
              
                  System.out.println();
                  SinglyLinkedList<String> simbolos = new SinglyLinkedList<String>();
                  SinglyLinkedList<Elemento> seleccion = new SinglyLinkedList<Elemento>();
                  SinglyLinkedList<Elemento> element = new SinglyLinkedList<Elemento>();
                  SinglyLinkedList<Elemento> todos4 = new SinglyLinkedList<Elemento>();
                  
                  todos4 = st1.get("Todos").getTabla();
                  //Se realiza la busqueda dentro de la tabla de simbolos
                 boolean found1 = false;
                  for (String sk: st1.keys()) {
            
                    if (sk.equals(clasifi)){
                        seleccion = st1.get(sk).getTabla();
                        found1 = true;
                    }
               }
               if(found1 == false ) 
                      StdOut.println("Not found");
                 
                // Se crea la tabla para mostrar la informacion en pantalla 
                      for(int i = 1; i <= 156; i++ ){
                    boolean found = false;
                    boolean exist = false;
                    String j = String.valueOf(i);
                   
                   
                    for (Node<Elemento> walk = seleccion.getHead(); walk != null; walk = walk.getNext()) {
                        
                        
                            if(walk.getElement().getGrilla().equals(j)){
                             simbolos.addLast( walk.getElement().getSimbolo());
                             element.addLast( walk.getElement());
                            found = true;
                           
                         }
                        
                   }
                  
                       for (Node<Elemento> walk = todos4.getHead(); walk != null; walk = walk.getNext()) {
                        
                            if(walk.getElement().getGrilla().equals(j)){
                                 exist = true;
                                
            
                         } 
                     }
                      if(exist == true && found == false)
                           simbolos.addLast("*");
                       else if( found == false)
                           simbolos.addLast("  ");
                    
                }
                System.out.println("-------------------------------------------------------"+clasifi+"---------------------------------------------------------------");
                int contador = 1;
                //Se imprimen los valores de que fueron almacenados y que seran imprimidos inclidos los espacios en blanco los * y los simbolos de los elementos seleccionados
                for (Node<Elemento> walk = element.getHead(); walk != null; walk = walk.getNext()) {
                      
                         System.out.format("|%-12s %-5s %-4s|    ",walk.getElement().getNombre(),walk.getElement().getSimbolo(),walk.getElement().getNumeroA());
                     
                     if ((contador % 5) == 0 ){
                       System.out.println();
                     }
                     contador++;
                }
                System.out.println();
                System.out.println();
                
                int contador3 = 0;
                for (Node<String> walk = simbolos.getHead(); walk != null; walk = walk.getNext()) {//aqui vamos a leer los distintos productos que quiere el cliente
                   //if (contador3 <= 126)
                      System.out.format("%-5s",walk.getElement()); contador3++; 
                   if (contador3 == 126 || contador3 == 141)
                        System.out.println();
                       
                    if ((contador3 % 18) == 0 && contador3 <= 126){
                       System.out.println();
                     }
                     
                }
                System.out.println();
                System.out.println();
    }
   
        
    
    public static  ST<String, Elemento>  rellenar( String args) {
      
        In in = new In(args);
        String[] database = in.readAllLines();
        ST<String, Elemento> st = new ST<String, Elemento>(); 
        for (int i = 0; i < database.length; i++) {
            String[] tokens = database[i].split(",");
              String nombre = tokens[0];
             String numeroA = tokens[1];
             String simbolo = tokens[2];
             String descripcion = tokens[3];
             String pesoatomico = tokens[4];
             String puntofusion = tokens[5];
             String puntoebullicion = tokens[6];
             String fase = tokens[7];
             String configuracion = tokens[8];
             String oxidacion = tokens[9];
             String valencias = tokens[10];
             
             String naturaleza = tokens[11];
             String tipoM = tokens[12];
             String grupo = tokens[13];
             String grilla = tokens[14];
             String periodo = tokens[15];
             
             String key = tokens[1];
             Elemento element = new Elemento(nombre,numeroA,simbolo,pesoatomico,puntofusion,puntoebullicion,fase,configuracion,oxidacion,valencias,descripcion,naturaleza,tipoM,grupo,grilla,periodo);
             st.put(key, element);
            
        }
       
         return st;
    }
    
    public ST<String, Clasificacion> clasificar(String archivo){
        
         
        SinglyLinkedList<Elemento> todos = new SinglyLinkedList<Elemento>();
        
        SinglyLinkedList<Elemento> metales = new SinglyLinkedList<Elemento>();
        SinglyLinkedList<Elemento> nometales = new SinglyLinkedList<Elemento>();
        SinglyLinkedList<Elemento> solidos = new SinglyLinkedList<Elemento>();
        SinglyLinkedList<Elemento> liquidos = new SinglyLinkedList<Elemento>();
        SinglyLinkedList<Elemento> gas = new SinglyLinkedList<Elemento>();
        
        In in = new In(archivo);
        String[] database = in.readAllLines();
        ST<String, Clasificacion> st1 = new ST<String, Clasificacion>();
        
        String[] keysClaficacion = {"Metal","Nometal","Alcalino","Alcalinoterreos","Transicion","Postransicionales","Metaloides ","Lactinidos","Actinidos","No metal","Halogenos","Gasesnobles","Liquido","Gas","Solido","Desconocido"};
       //String[] keysEstado = {"Liquido","Gas","Solido","Desconocido"};
        
        for (int i = 0; i < database.length; i++) {
            String[] tokens = database[i].split(",");
              String nombre = tokens[0];
             String numeroA = tokens[1];
             String simbolo = tokens[2];
             String pesoatomico = tokens[4];
             String puntofusion = tokens[5];
             String puntoebullicion = tokens[6];
             String fase = tokens[7];
             String configuracion = tokens[8];
             String oxidacion = tokens[9];
             String valencias = tokens[10];
             String descripcion = tokens[3];
             String naturaleza = tokens[11];
             String tipoM = tokens[12];
             String grupo = tokens[13];
              String grilla = tokens[14];
              String periodo = tokens[15];
             
             String key = tokens[1];
             Elemento element = new Elemento(nombre,numeroA,simbolo,pesoatomico,puntofusion,puntoebullicion,fase,configuracion,oxidacion,valencias,descripcion,naturaleza,tipoM,grupo,grilla,periodo);
             
             todos.addLast(element);
             
            
            
        }
        Clasificacion C0 = new Clasificacion("Todos",todos);
         st1.put("Todos",C0);
        for(int i = 0; i < 16 ; i++){
            String key = keysClaficacion[i];
            SinglyLinkedList<Elemento> clasi = new SinglyLinkedList<Elemento>();
            for (Node<Elemento> walk = todos.getHead(); walk != null; walk = walk.getNext()) {
                if(walk.getElement().getFase().equals(key)){
                    clasi.addLast((walk.getElement()));
            
                }else if(walk.getElement().getNaturaleza().equals(key)) {
                    clasi.addLast((walk.getElement()));
                
                }else if(walk.getElement().getTipoM().equals(key)){
                    clasi.addLast((walk.getElement()));
                }   
                }
            Clasificacion c1 = new Clasificacion(key,clasi);
            st1.put(key,c1);
        }
        
        
          for(int i = 1; i <= 18; i++){
              String j = String.valueOf(i);
              SinglyLinkedList<Elemento> grupos = new SinglyLinkedList<Elemento>();
            for (Node<Elemento> walk = todos.getHead(); walk != null; walk = walk.getNext()) {
                if(walk.getElement().getGrupo().equals(j)){
                    grupos.addLast(walk.getElement());
                    
                }
            
            }
            Clasificacion gr = new Clasificacion(j,grupos);
            st1.put(j,gr );
        }
          return st1;
    }
   
    
}
