package com.banco.modelo;

/**
 * Cliente que es una organización (empresa, institución pública, etc.).
 */
public class Organizacion extends Cliente {

    private String tipo;
    private String representante;
    private int numeroEmpleados;

    public Organizacion(String codigoIdentificacion, String nombre, String direccion,
                        String tipo, String representante, int numeroEmpleados) {
        super(codigoIdentificacion, nombre, direccion);
        this.tipo = tipo;
        this.representante = representante;
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

