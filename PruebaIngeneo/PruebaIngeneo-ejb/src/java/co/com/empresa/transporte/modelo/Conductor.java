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
 * @description clase que representa la entidad conductor
 */
@Entity
@Table(name = "Conductor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conductor.findAll", query = "SELECT c FROM Conductor c"),
    @NamedQuery(name = "Conductor.findByCondid", query = "SELECT c FROM Conductor c WHERE c.condid = :condid"),
    @NamedQuery(name = "Conductor.findByCondnombre", query = "SELECT c FROM Conductor c WHERE c.condnombre = :condnombre")})
public class Conductor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cond_id")
    private Integer condid;
    @Size(max = 60)
    @Column(name = "Cond_nombre")
    private String condnombre;
    @OneToMany(mappedBy = "vehiconductorid")
    private List<Vehiculo> vehiculoList;

    public Conductor() {
    }

    public Conductor(Integer condid) {
        this.condid = condid;
    }

    public Integer getCondid() {
        return condid;
    }

    public void setCondid(Integer condid) {
        this.condid = condid;
    }

    public String getCondnombre() {
        return condnombre;
    }

    public void setCondnombre(String condnombre) {
        this.condnombre = condnombre;
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
        hash += (condid != null ? condid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conductor)) {
            return false;
        }
        Conductor other = (Conductor) object;
        if ((this.condid == null && other.condid != null) || (this.condid != null && !this.condid.equals(other.condid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.empresa.transporte.modelo.Conductor[ condid=" + condid + " ]";
    }
    
}
