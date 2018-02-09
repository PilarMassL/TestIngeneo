package co.com.empresa.transporte.modelo;

import co.com.empresa.transporte.modelo.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-28T20:16:44")
@StaticMetamodel(Conductor.class)
public class Conductor_ { 

    public static volatile SingularAttribute<Conductor, Integer> condid;
    public static volatile SingularAttribute<Conductor, String> condnombre;
    public static volatile ListAttribute<Conductor, Vehiculo> vehiculoList;

}