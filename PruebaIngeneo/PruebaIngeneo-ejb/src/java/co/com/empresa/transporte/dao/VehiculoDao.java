/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.dao;

import co.com.empresa.transporte.dao.servicio.DaoGenerico;
import co.com.empresa.transporte.modelo.Vehiculo;
import javax.persistence.EntityManager;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 */
public class VehiculoDao extends DaoGenerico<Vehiculo>{

    
     public VehiculoDao(EntityManager em) {
        super(em);
    }
     
    public VehiculoDao(EntityManager em, Class<Vehiculo> tipo) {
        super(em, tipo);
    }
    
    /**
     * 
     * @param peso
     * @return 
     */
    //obetner el vehiculo disponible segun fecha y tamanio del vehiculo
    public Vehiculo vehiculoDisponible(String peso){
       return (Vehiculo) em.createQuery("Select v from Vehiculo v where v.vehiPeso    <= "+peso+" and v.vehifechadespacho =(Select min(v.vehifechadespacho) from Vehiculo v where  v.vehiPeso <= "+peso+")  order by v.vehiPeso ,v.vehifechadespacho asc").getSingleResult();
    }
    
}
