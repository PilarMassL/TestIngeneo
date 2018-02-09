/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.empresa.transporte.dao.servicio;

import javax.persistence.EntityManager;

/**
 *
 * @author pilar.mass
 * @since 28/01/2016
 */
public class DaoGenerico  <T>{
    
    protected static  EntityManager em;
    private Class tipo;
    public DaoGenerico(EntityManager em){
    this.em= em;    
    }
    
    public DaoGenerico(EntityManager em, Class<T> tipo){
        this.em=em;
        this.tipo=tipo;
    }
    
    
    public void crear(T objeto){
       em.persist(objeto);
    }
    
    public T actualizar(T objeto){
        return em.merge(objeto);
    }
    
    public T buscar( Object id){
        return (T) em.find(tipo, id);
    }
    
    
    public void eliminar(Object objeto){
        em.remove(em.getReference(tipo, objeto));
    }
    
    
    
    
    
    
}
