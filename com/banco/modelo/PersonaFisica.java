package com.banco.modelo;

import java.time.LocalDate;

/**
 * Cliente que es una persona física.
 */
public class PersonaFisica extends Cliente {

    private LocalDate fechaNacimiento;
    private String sexo;

    public PersonaFisica(String codigoIdentificacion, String nombre, String direccion,
                         LocalDate fechaNacimiento, String sexo) {
        super(codigoIdentificacion, nombre, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
