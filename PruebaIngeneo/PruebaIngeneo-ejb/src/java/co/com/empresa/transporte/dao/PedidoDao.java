/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.dao;

import co.com.empresa.transporte.dao.servicio.DaoGenerico;
import co.com.empresa.transporte.modelo.Pedido;
import javax.persistence.EntityManager;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 */
public class PedidoDao extends  DaoGenerico<Pedido>{
    
    public PedidoDao(EntityManager em) {
        super(em);
    }
    public PedidoDao(EntityManager em, Class<Pedido> tipo) {
        super(em, tipo);
    }
    
}
