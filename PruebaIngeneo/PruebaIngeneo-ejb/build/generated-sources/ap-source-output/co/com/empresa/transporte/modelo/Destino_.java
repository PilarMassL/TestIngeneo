package co.com.empresa.transporte.modelo;

import co.com.empresa.transporte.modelo.Pedido;
import co.com.empresa.transporte.modelo.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-28T20:16:44")
@StaticMetamodel(Destino.class)
public class Destino_ { 

    public static volatile SingularAttribute<Destino, Integer> destid;
    public static volatile SingularAttribute<Destino, String> destnombre;
    public static volatile ListAttribute<Destino, Pedido> pedidoList;
    public static volatile ListAttribute<Destino, Vehiculo> vehiculoList;

}