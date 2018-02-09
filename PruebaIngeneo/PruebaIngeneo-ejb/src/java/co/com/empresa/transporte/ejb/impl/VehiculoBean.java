/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.ejb.impl;

import co.com.empresa.transporte.dao.VehiculoDao;
import co.com.empresa.transporte.ejb.VehiculoBeanLocal;
import co.com.empresa.transporte.modelo.Vehiculo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 * @version 1.0
 * @description clase bean local
 */
@Stateless
public class VehiculoBean implements VehiculoBeanLocal {
@PersistenceContext(unitName = "PruebaIngeneo-ejbPU")
    private EntityManager em;
    @Override
    public Vehiculo vehiculoDisponible(String peso) {
       VehiculoDao dao = new VehiculoDao(em);
       return dao.vehiculoDisponible(peso);
    }

    
}
