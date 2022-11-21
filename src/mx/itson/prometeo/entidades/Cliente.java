package mx.itson.prometeo.entidades;


     /**
     * Clase cliente encargada de las variables efectivo y recarga.
     */

public class Cliente {
    
    private Double efectivo ;
    private Double recarga ;
    
    /**
     * Obtiene el efectivo que se esta añadiendo.
     * @return double
     */

    public Double getEfectivo() {
        return efectivo;
    }
    /**
     * Estable el efectivo de cliente.
     * @param efectivo 
     */

    public void setEfectivo(Double efectivo) {
        this.efectivo = efectivo;
    }
    /**
     * Obtiene la recarga del cliente.
     * @return Double
     */

    public Double getRecarga() {
        return recarga;
    }
    /**
     * Establece la recarga del cliente.
     * @param recarga 
     */

    public void setRecarga(Double recarga) {
        this.recarga = recarga;
    }
    
}
