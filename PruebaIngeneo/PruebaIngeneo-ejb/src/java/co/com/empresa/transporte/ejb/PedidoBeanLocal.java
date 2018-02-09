/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.ejb;

import co.com.empresa.transporte.modelo.Pedido;
import javax.ejb.Local;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 */
@Local
public interface PedidoBeanLocal {
    public void insertarAcceso (Pedido pedido);
    
}
