
/**
 * Write a description of class Elemento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elemento
{
    String nombre;
    String numeroA;
    String simbolo;
    String pesoatomico;
    String puntofusion;
    String puntoebullicion;
    String fase;
    String configuracion;
    String oxidacion;
    String valencias;
    String Descripcion;
    String naturaleza;
    String tipoM;
    String grupo;
    String grilla;
    String periodo;
    public Elemento(String nombre, String numeroA,String simbolo, String pesoatomico, String puntofusion, String puntoebullicion, String fase, String configuracion,String oxidacion, String valencias, String Descripcion, String naturaleza,String tipoM, String grupo,String grilla,String periodo)
{
        this.nombre = nombre;
        this.numeroA = numeroA;
        this.simbolo = simbolo;
        this.pesoatomico = pesoatomico;
        this.puntofusion = puntofusion;
        this.puntoebullicion = puntoebullicion;
        this.fase = fase;
        this.configuracion = configuracion;
        this.oxidacion = oxidacion;
        this.valencias = valencias;
        this.Descripcion = Descripcion;
        this.naturaleza = naturaleza;
        this.tipoM = tipoM;
        this.grupo = grupo;
        this.grilla = grilla;
        this.periodo = periodo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getNumeroA(){
        return numeroA;
    }

    public String getSimbolo(){
        return simbolo;
    }

    public String getPesoatomico(){
        return pesoatomico;
    }

    public String getPuntofusion(){
        return puntofusion;
    }

    public String getPuntoebullicion(){
        return puntoebullicion;
    }

    public String getFase(){
        return fase;
    }

    public String getConfiguracion(){
        return configuracion;
    }

    public String getOxidacion(){
        return oxidacion;
    }

    public String getValencias(){
        return valencias;
    }

    public String getDescripcion(){
        return Descripcion;
    }
    public String getNaturaleza(){
        return naturaleza;
    }
    public String getTipoM(){
        return tipoM;
    }
    public String getGrupo(){
        return grupo;
    }
     public String getGrilla(){
        return grilla;
    }

    public String toString() {
          
        return String.format("%-12s %-12s %-12s %-12s %-18s %-21s %-15s %-15s %-12s %-12s %-12s %-5s %-7s%n ",nombre,numeroA,simbolo,pesoatomico,puntofusion,puntoebullicion,fase,configuracion,oxidacion,valencias,naturaleza,grupo,periodo);
    }

}
