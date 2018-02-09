/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 * @version 1.0
 * @description clase que representa la entidad pedido
 */
@Entity
@Table(name = "Pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id"),
    @NamedQuery(name = "Pedido.findByPediFecha", query = "SELECT p FROM Pedido p WHERE p.pediFecha = :pediFecha"),
    @NamedQuery(name = "Pedido.findByPediPeso", query = "SELECT p FROM Pedido p WHERE p.pediPeso = :pediPeso")})
public class Pedido implements Serializable {
    @Column(name = "Pedi_Precio")
    private Double pediPrecio;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Pedi_Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pediFecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Pedi_Peso")
    private Double pediPeso;
    @JoinColumn(name = "Pedi_Cliente", referencedColumnName = "Clie_Cedula")
    @ManyToOne
    private Cliente pediCliente;
    @JoinColumn(name = "Pedi_vehiculo_id", referencedColumnName = "Vehi_placa")
    @ManyToOne
    private Vehiculo pedivehiculoid;
    @JoinColumn(name = "Pedi_destino_id", referencedColumnName = "Dest_id")
    @ManyToOne
    private Destino pedidestinoid;

    public Pedido() {
    }

    public Pedido(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPediFecha() {
        return pediFecha;
    }

    public void setPediFecha(Date pediFecha) {
        this.pediFecha = pediFecha;
    }

    public Double getPediPeso() {
        return pediPeso;
    }

    public void setPediPeso(Double pediPeso) {
        this.pediPeso = pediPeso;
    }

    public Cliente getPediCliente() {
        return pediCliente;
    }

    public void setPediCliente(Cliente pediCliente) {
        this.pediCliente = pediCliente;
    }

    public Vehiculo getPedivehiculoid() {
        return pedivehiculoid;
    }

    public void setPedivehiculoid(Vehiculo pedivehiculoid) {
        this.pedivehiculoid = pedivehiculoid;
    }

    public Destino getPedidestinoid() {
        return pedidestinoid;
    }

    public void setPedidestinoid(Destino pedidestinoid) {
        this.pedidestinoid = pedidestinoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.empresa.transporte.modelo.Pedido[ id=" + id + " ]";
    }

    public Double getPediPrecio() {
        return pediPrecio;
    }

    public void setPediPrecio(Double pediPrecio) {
        this.pediPrecio = pediPrecio;
    }
    
}
