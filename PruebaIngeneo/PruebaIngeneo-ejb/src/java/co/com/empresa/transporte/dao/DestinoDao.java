/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.dao;

import co.com.empresa.transporte.dao.servicio.DaoGenerico;
import co.com.empresa.transporte.modelo.Destino;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 */
public class DestinoDao extends  DaoGenerico<Destino>{
    
    public DestinoDao(EntityManager em) {
        super(em);
    }
    public DestinoDao(EntityManager em, Class<Destino> tipo) {
        super(em, tipo);
    }
    
    /**
     * Metodo que consulta todos los destinos
     * @return 
     */
    public List<Destino> consultarDestino(){
    return    (List<Destino>)  em.createQuery("SELECT d FROM Destino d").getResultList();
    }
    
}
