package co.com.empresa.transporte.modelo;

import co.com.empresa.transporte.modelo.Conductor;
import co.com.empresa.transporte.modelo.Destino;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-28T20:16:44")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, String> vehiplaca;
    public static volatile SingularAttribute<Vehiculo, String> vehitipo;
    public static volatile SingularAttribute<Vehiculo, Conductor> vehiconductorid;
    public static volatile SingularAttribute<Vehiculo, Integer> vehiPeso;
    public static volatile SingularAttribute<Vehiculo, Integer> vehiPesoTotal;
    public static volatile SingularAttribute<Vehiculo, Date> vehifechadespacho;
    public static volatile SingularAttribute<Vehiculo, Destino> vehidestinoid;

}