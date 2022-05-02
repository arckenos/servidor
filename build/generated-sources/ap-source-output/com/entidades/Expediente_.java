package com.entidades;

import com.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-05-01T21:22:24")
@StaticMetamodel(Expediente.class)
public class Expediente_ { 

    public static volatile SingularAttribute<Expediente, String> descripcion;
    public static volatile SingularAttribute<Expediente, Paciente> idPaciente;
    public static volatile SingularAttribute<Expediente, byte[]> archivo;
    public static volatile SingularAttribute<Expediente, Integer> idExpediente;
    public static volatile SingularAttribute<Expediente, String> folio;
    public static volatile SingularAttribute<Expediente, String> tipoArchivo;

}