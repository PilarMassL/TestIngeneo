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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 * @version 1.0
 * @description clase que representa la entidad cliente
 */
@Entity
@Table(name = "Cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByClieCedula", query = "SELECT c FROM Cliente c WHERE c.clieCedula = :clieCedula"),
    @NamedQuery(name = "Cliente.findByClieNombre", query = "SELECT c FROM Cliente c WHERE c.clieNombre = :clieNombre"),
    @NamedQuery(name = "Cliente.findByClieApellido", query = "SELECT c FROM Cliente c WHERE c.clieApellido = :clieApellido")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Clie_Cedula")
    private Integer clieCedula;
    @Size(max = 60)
    @Column(name = "Clie_Nombre")
    private String clieNombre;
    @Size(max = 60)
    @Column(name = "Clie_Apellido")
    private String clieApellido;
    @OneToMany(mappedBy = "pediCliente")
    private List<Pedido> pedidoList;

    public Cliente() {
    }

    public Cliente(Integer clieCedula) {
        this.clieCedula = clieCedula;
    }

    public Integer getClieCedula() {
        return clieCedula;
    }

    public void setClieCedula(Integer clieCedula) {
        this.clieCedula = clieCedula;
    }

    public String getClieNombre() {
        return clieNombre;
    }

    public void setClieNombre(String clieNombre) {
        this.clieNombre = clieNombre;
    }

    public String getClieApellido() {
        return clieApellido;
    }

    public void setClieApellido(String clieApellido) {
        this.clieApellido = clieApellido;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clieCedula != null ? clieCedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clieCedula == null && other.clieCedula != null) || (this.clieCedula != null && !this.clieCedula.equals(other.clieCedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.empresa.transporte.modelo.Cliente[ clieCedula=" + clieCedula + " ]";
    }
    
}
