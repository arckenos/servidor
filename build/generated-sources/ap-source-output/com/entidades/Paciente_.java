package com.entidades;

import com.entidades.Citas;
import com.entidades.Expediente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-05-01T21:22:24")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Integer> idPaciente;
    public static volatile CollectionAttribute<Paciente, Expediente> expedienteCollection;
    public static volatile SingularAttribute<Paciente, Date> fechaNacimiento;
    public static volatile CollectionAttribute<Paciente, Citas> citasCollection;
    public static volatile SingularAttribute<Paciente, String> huellaDactilar;
    public static volatile SingularAttribute<Paciente, String> nombre;
    public static volatile SingularAttribute<Paciente, String> curp;
    public static volatile SingularAttribute<Paciente, Integer> tutor;

}