package co.com.empresa.transporte.modelo;

import co.com.empresa.transporte.modelo.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-28T20:16:44")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> clieNombre;
    public static volatile SingularAttribute<Cliente, String> clieApellido;
    public static volatile SingularAttribute<Cliente, Integer> clieCedula;
    public static volatile ListAttribute<Cliente, Pedido> pedidoList;

}