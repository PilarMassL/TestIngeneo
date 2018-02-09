/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 * @version 1.0
 * @description clase que representa la entidad destino
 */
@Entity
@Table(name = "Destino")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destino.findAll", query = "SELECT d FROM Destino d"),
    @NamedQuery(name = "Destino.findByDestid", query = "SELECT d FROM Destino d WHERE d.destid = :destid"),
    @NamedQuery(name = "Destino.findByDestnombre", query = "SELECT d FROM Destino d WHERE d.destnombre = :destnombre")})
public class Destino implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Dest_id")
    private Integer destid;
    @Size(max = 30)
    @Column(name = "Dest_nombre")
    private String destnombre;
    @OneToMany(mappedBy = "pedidestinoid")
    private List<Pedido> pedidoList;
    @OneToMany(mappedBy = "vehidestinoid")
    private List<Vehiculo> vehiculoList;

    public Destino() {
    }

    public Destino(Integer destid) {
        this.destid = destid;
    }

    public Integer getDestid() {
        return destid;
    }

    public void setDestid(Integer destid) {
        this.destid = destid;
    }

    public String getDestnombre() {
        return destnombre;
    }

    public void setDestnombre(String destnombre) {
        this.destnombre = destnombre;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @XmlTransient
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (destid != null ? destid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destino)) {
            return false;
        }
        Destino other = (Destino) object;
        if ((this.destid == null && other.destid != null) || (this.destid != null && !this.destid.equals(other.destid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.empresa.transporte.modelo.Destino[ destid=" + destid + " ]";
    }
    
}
