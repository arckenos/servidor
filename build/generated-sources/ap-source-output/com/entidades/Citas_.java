package com.entidades;

import com.entidades.Paciente;
import com.entidades.TrabajadorSalud;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-05-01T21:22:24")
@StaticMetamodel(Citas.class)
public class Citas_ { 

    public static volatile SingularAttribute<Citas, Integer> idCita;
    public static volatile SingularAttribute<Citas, Paciente> idPaciente;
    public static volatile SingularAttribute<Citas, Date> horaCita;
    public static volatile SingularAttribute<Citas, Short> accesoExpediente;
    public static volatile SingularAttribute<Citas, TrabajadorSalud> idTrabajadorSalud;

}