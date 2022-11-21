package mx.itson.prometeo.entidades;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.prometeo.enumeradores.Descuento;

     /**
     * Clase Dato encargada de deserializar el contenido entre otras variables.
     */
public class Dato {
    private String empresa;
    private String codigo;
    private String direccion;
    private String localidad;
    private String plaza;
    private String caja;
    private String fecha;
    private String hora;
    private List<Articulo> articulos;
    private Descuento descuento;
    private Cliente cliente;
    /**
     * Pasa los datos de un json al objeto Dato.
     * @param json
     * @return dato
     */
    
     public Dato deserializar(String json){
        Dato dato =  new Dato();
        try{
            dato = new Gson().fromJson(json,Dato.class);
    }catch(Exception ex){
        System.err.print("Ocurrio un error" +  ex.getMessage());
    }
        return dato;
    }
     /**
      * Obtiene los datos de la empresa.
      * @return String
      */

    public String getEmpresa() {
        return empresa;
    }
    /**
     * Establece los datos de la empresa
     * @param empresa 
     */

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    /**
     * Obtiene el codigo de la empresa para el ticket.
     * @return  String.
     */

    public String getCodigo() {
        return codigo;
    }
    /**
     * Estable el codigo de la emprea.
     * @param codigo 
     */

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * Obtiene la direccion de la empresa.
     * @return String
     */

    public String getDireccion() {
        return direccion;
    }
    /**
     * Establece la direccion de la empresa.
     * @param direccion 
     */

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Obtiene la localidad de la empresa en la que se desea.
     * @return String.
     */

    public String getLocalidad() {
        return localidad;
    }
    /**
     * Establece la localidad de la empresa.
     * @param localidad 
     */
    

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    /**
     * Obtiene la plaza en la que se trabaja de la  empresa.
     * @return String
     */

    public String getPlaza() {
        return plaza;
    }
    /**
     * Establece la plaza de la empresa.
     * @param plaza 
     */

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    /**
     * Se obtiene la caja en la que se cobra.
     * @return String
     */

    public String getCaja() {
        return caja;
    }
    /**
     * Se establece la caja en la que se cobra.
     * @param caja 
     */

    public void setCaja(String caja) {
        this.caja = caja;
    }
    /**
     * Obtiene la fecha que se cobro.
     * @return String.
     */

    public String getFecha() {
        return fecha;
    }
    /**
     * Establece la fecha que en ese momento.
     * @param fecha 
     */
    

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * Obtiene la hora que se cobra.
     * @return String
     */

    public String getHora() {
        return hora;
    }
    /**
     * Establece la hora en la que se cobra.
     * @param hora 
     */

    public void setHora(String hora) {
        this.hora = hora;
    }
    /**
     * Obtiene el descuento que se a dado.
     * @return Descuento.
     */

    

    public Descuento getDescuento() {
        return descuento;
    }
    /**
     * Establece un descuento en la variable.
     * @param descuento 
     */

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
    /**
     * Obtiene una lista de articulos.
     * @return Una lista de articulos.
     */

    public List<Articulo> getArticulos() {
        return articulos;
    }
    /**
     * Establece una lista de articulos.
     * @param articulos 
     */

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    /**
     * Obtiene la clase cliente.
     * @return Cliente
     */

    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Establece la clase cliente.
     * @param cliente 
     */

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
}
