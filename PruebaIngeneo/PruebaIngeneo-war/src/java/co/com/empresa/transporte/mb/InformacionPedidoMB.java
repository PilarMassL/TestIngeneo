/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.mb;

import co.com.empresa.transporte.ejb.ClienteBeanLocal;
import co.com.empresa.transporte.ejb.DestinoBeanLocal;
import co.com.empresa.transporte.ejb.PedidoBeanLocal;
import co.com.empresa.transporte.ejb.VehiculoBeanLocal;
import co.com.empresa.transporte.modelo.Cliente;
import co.com.empresa.transporte.modelo.Destino;
import co.com.empresa.transporte.modelo.Pedido;
import co.com.empresa.transporte.modelo.Vehiculo;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author pilar.mass
 */
@ManagedBean
@Stateless
public class InformacionPedidoMB {

    @EJB
    PedidoBeanLocal pedidoBeanLocal;
    @EJB
    DestinoBeanLocal destinoBeanLocal;
    @EJB
    VehiculoBeanLocal vehiculoBeanLocal;
    @EJB
    ClienteBeanLocal clienteBeanLocal;
    //
    private double precio;
    private double peso;
    private String nombreCliente;
    private String cedula;
    private Date fecha;
    /**
     * Creates a new instance of InformacionPedidoMB
     */
    private Destino destino;
    
    private List<Destino> listaDestino;
    
     private List<Pedido> listaPedido;
    private List<Pedido> listaPedidoFiltrado;
    
    @PostConstruct
    public void init(){
      listarDestino();
    }
    public InformacionPedidoMB() {
        //listarDestino();
    }
    
    public void listarDestino(){
          
          listaDestino =destinoBeanLocal.consultarDestino();
         
    }
    
    public void guardar(){
       Pedido obj = new Pedido();
       Vehiculo vehiculo= vehiculoBeanLocal.vehiculoDisponible(""+peso);
       Cliente cliente = new Cliente();
       cliente.setClieNombre(nombreCliente);
       cliente.setClieCedula(Integer.parseInt(cedula));
       cliente= clienteBeanLocal.insertarCliente(cliente);
       obj.setPediPeso(peso);
       obj.setPediPrecio(precio);
       obj.setPediFecha(fecha);
       obj.setPedivehiculoid(vehiculo);
       obj.setPediCliente(cliente);
        pedidoBeanLocal.insertarAcceso(obj);
    }

    public List<Destino> getListaDestino() {
        return listaDestino;
    }

    public void setListaDestino(List<Destino> listaDestino) {
        this.listaDestino = listaDestino;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(List<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public List<Pedido> getListaPedidoFiltrado() {
        return listaPedidoFiltrado;
    }

    public void setListaPedidoFiltrado(List<Pedido> listaPedidoFiltrado) {
        this.listaPedidoFiltrado = listaPedidoFiltrado;
    }
    
    
}
