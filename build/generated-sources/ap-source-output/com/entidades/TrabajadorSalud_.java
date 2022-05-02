package com.entidades;

import com.entidades.Citas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-05-01T21:22:24")
@StaticMetamodel(TrabajadorSalud.class)
public class TrabajadorSalud_ { 

    public static volatile SingularAttribute<TrabajadorSalud, String> cedulaProfesional;
    public static volatile SingularAttribute<TrabajadorSalud, Date> fechaNacimiento;
    public static volatile SingularAttribute<TrabajadorSalud, String> contrasenia;
    public static volatile CollectionAttribute<TrabajadorSalud, Citas> citasCollection;
    public static volatile SingularAttribute<TrabajadorSalud, Integer> idTrabajadorSalud;
    public static volatile SingularAttribute<TrabajadorSalud, String> huellaDactilar;
    public static volatile SingularAttribute<TrabajadorSalud, String> nombre;
    public static volatile SingularAttribute<TrabajadorSalud, String> curp;

}