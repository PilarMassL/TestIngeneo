/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 * @version 1.0
 * @description clase que representa la entidad vehiculo
 */
@Entity
@Table(name = "Vehiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v"),
    @NamedQuery(name = "Vehiculo.findByVehiplaca", query = "SELECT v FROM Vehiculo v WHERE v.vehiplaca = :vehiplaca"),
    @NamedQuery(name = "Vehiculo.findByVehitipo", query = "SELECT v FROM Vehiculo v WHERE v.vehitipo = :vehitipo"),
    @NamedQuery(name = "Vehiculo.findByVehifechadespacho", query = "SELECT v FROM Vehiculo v WHERE v.vehifechadespacho = :vehifechadespacho"),
    @NamedQuery(name = "Vehiculo.findByVehiPeso", query = "SELECT v FROM Vehiculo v WHERE v.vehiPeso = :vehiPeso"),
    @NamedQuery(name = "Vehiculo.findByVehiPesoTotal", query = "SELECT v FROM Vehiculo v WHERE v.vehiPesoTotal = :vehiPesoTotal")})
public class Vehiculo implements Serializable {
    @OneToMany(mappedBy = "pedivehiculoid")
    private Collection<Pedido> pedidoCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Vehi_placa")
    private String vehiplaca;
    @Size(max = 10)
    @Column(name = "Vehi_tipo")
    private String vehitipo;
    @Column(name = "Vehi_fecha_despacho")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vehifechadespacho;
    @Column(name = "Vehi_Peso")
    private Integer vehiPeso;
    @Column(name = "Vehi_Peso_Total")
    private Integer vehiPesoTotal;
    @JoinColumn(name = "Vehi_conductor_id", referencedColumnName = "Cond_id")
    @ManyToOne
    private Conductor vehiconductorid;
    @JoinColumn(name = "Vehi_destino_id", referencedColumnName = "Dest_id")
    @ManyToOne
    private Destino vehidestinoid;

    public Vehiculo() {
    }

    public Vehiculo(String vehiplaca) {
        this.vehiplaca = vehiplaca;
    }

    public String getVehiplaca() {
        return vehiplaca;
    }

    public void setVehiplaca(String vehiplaca) {
        this.vehiplaca = vehiplaca;
    }

    public String getVehitipo() {
        return vehitipo;
    }

    public void setVehitipo(String vehitipo) {
        this.vehitipo = vehitipo;
    }

    public Date getVehifechadespacho() {
        return vehifechadespacho;
    }

    public void setVehifechadespacho(Date vehifechadespacho) {
        this.vehifechadespacho = vehifechadespacho;
    }

    public Integer getVehiPeso() {
        return vehiPeso;
    }

    public void setVehiPeso(Integer vehiPeso) {
        this.vehiPeso = vehiPeso;
    }

    public Integer getVehiPesoTotal() {
        return vehiPesoTotal;
    }

    public void setVehiPesoTotal(Integer vehiPesoTotal) {
        this.vehiPesoTotal = vehiPesoTotal;
    }

    public Conductor getVehiconductorid() {
        return vehiconductorid;
    }

    public void setVehiconductorid(Conductor vehiconductorid) {
        this.vehiconductorid = vehiconductorid;
    }

    public Destino getVehidestinoid() {
        return vehidestinoid;
    }

    public void setVehidestinoid(Destino vehidestinoid) {
        this.vehidestinoid = vehidestinoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehiplaca != null ? vehiplaca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.vehiplaca == null && other.vehiplaca != null) || (this.vehiplaca != null && !this.vehiplaca.equals(other.vehiplaca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.empresa.transporte.modelo.Vehiculo[ vehiplaca=" + vehiplaca + " ]";
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }
    
}
