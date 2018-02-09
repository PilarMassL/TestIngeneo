/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.ejb.impl;

import co.com.empresa.transporte.dao.DestinoDao;
import co.com.empresa.transporte.dao.PedidoDao;
import co.com.empresa.transporte.ejb.DestinoBeanLocal;
import co.com.empresa.transporte.modelo.Destino;
import co.com.empresa.transporte.modelo.Pedido;
import java.util.List;
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
public class DestinoBean implements DestinoBeanLocal {

    @PersistenceContext(unitName = "PruebaIngeneo-ejbPU")
    private EntityManager em;
    
    @Override
    public void insertarAcceso( Destino destino) {
        System.out.println("insertando ...");
         DestinoDao obj = new DestinoDao(em); 
         // objeto 
         obj.crear(destino);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Destino> consultarDestino() {
DestinoDao obj = new DestinoDao(em); 
return obj.consultarDestino();
    
    }

   
}
