package com.banco.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Empleado del banco. Puede no estar adscrito a ninguna sucursal
 * (sucursal == null) y puede, además, ser titular de cuentas.
 */
public class Empleado {

    private final String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String sexo;
    private Sucursal sucursal;

    /** Cuentas de las que este empleado es titular (relación explícita empleado-cuenta). */
    private final List<Cuenta> cuentasComoTitular = new ArrayList<>();

    public Empleado(String dni, String nombre, LocalDate fechaNacimiento, String sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    /** Invocado desde Sucursal.agregarEmpleado. */
    void asignarSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    /** Invocado desde Cuenta.registrarTitularEmpleado. */
    void agregarCuentaComoTitular(Cuenta cuenta) {
        cuentasComoTitular.add(cuenta);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    /** Sucursal a la que está asignado; null si no está adscrito a ninguna. */
    public Sucursal getSucursal() {
        return sucursal;
    }

    public List<Cuenta> getCuentasComoTitular() {
        return Collections.unmodifiableList(cuentasComoTitular);
    }

    /** true si es director de su propia sucursal. */
    public boolean esDirector() {
        return sucursal != null && this == sucursal.getDirector();
    }
}
