/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.ejb.impl;

import co.com.empresa.transporte.dao.PedidoDao;
import co.com.empresa.transporte.ejb.PedidoBeanLocal;
import co.com.empresa.transporte.modelo.Pedido;
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
public class PedidoBean implements PedidoBeanLocal {

    @PersistenceContext(unitName = "PruebaIngeneo-ejbPU")
    private EntityManager em;
    
    @Override
    public void insertarAcceso(Pedido acceso) {
        System.out.println("insertando ...");
         PedidoDao obj = new PedidoDao(em); 
         // objeto 
         obj.crear(acceso);
    }
    
  

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
