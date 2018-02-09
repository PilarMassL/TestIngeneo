package co.com.empresa.transporte.modelo;

import co.com.empresa.transporte.modelo.Cliente;
import co.com.empresa.transporte.modelo.Destino;
import co.com.empresa.transporte.modelo.Vehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-28T20:16:44")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Double> pediPeso;
    public static volatile SingularAttribute<Pedido, Cliente> pediCliente;
    public static volatile SingularAttribute<Pedido, Destino> pedidestinoid;
    public static volatile SingularAttribute<Pedido, Integer> id;
    public static volatile SingularAttribute<Pedido, Vehiculo> pedivehiculoid;
    public static volatile SingularAttribute<Pedido, Date> pediFecha;

}