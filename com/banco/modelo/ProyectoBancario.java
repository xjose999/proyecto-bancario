package com.banco.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Cliente {

    private final String codigoIdentificacion;
    private String nombre;
    private String direccion;
    private final List<Cuenta> cuentas = new ArrayList<>();

    protected Cliente(String codigoIdentificacion, String nombre, String direccion) {
        this.codigoIdentificacion = codigoIdentificacion;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta> getCuentas() {
        return Collections.unmodifiableList(cuentas);
    }
}
