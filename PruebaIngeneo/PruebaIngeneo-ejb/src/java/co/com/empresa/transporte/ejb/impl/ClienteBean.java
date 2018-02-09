/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.ejb.impl;

import co.com.empresa.transporte.dao.ClienteDao;
import co.com.empresa.transporte.ejb.ClienteBeanLocal;
import co.com.empresa.transporte.modelo.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 * @version 1.0
 * @description clase bean implementa local
 */
@Stateless
public class ClienteBean implements ClienteBeanLocal {

    @PersistenceContext(unitName = "PruebaIngeneo-ejbPU")
    private EntityManager em;
    @Override
    public Cliente insertarCliente(Cliente cliente) {
      ClienteDao dao = new ClienteDao(em);
      return dao.actualizar(cliente);
    }

}
