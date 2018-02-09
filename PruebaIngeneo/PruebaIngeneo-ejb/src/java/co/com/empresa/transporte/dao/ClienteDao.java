/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.dao;

import co.com.empresa.transporte.dao.servicio.DaoGenerico;
import co.com.empresa.transporte.modelo.Cliente;
import javax.persistence.EntityManager;

/**
 *
 * @author   pilar.mass
 * @since 28/01/2016  
 */
public class ClienteDao extends DaoGenerico<Cliente>{

    public ClienteDao(EntityManager em) {
        super(em);
    }
    
    public ClienteDao(EntityManager em, Class<Cliente> tipo) {
        super(em, tipo);
    }
    
}
