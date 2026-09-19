package com.banco.modelo;

import java.time.LocalDate;

/**
 * Cuenta corriente: requiere un depósito mínimo inicial.
 */
public class CuentaCorriente extends Cuenta {

    private double depositoMinimo;

    public CuentaCorriente(String ccc, double saldoActual, double saldoMedio,
                           LocalDate fechaApertura, Cliente titular, Sucursal sucursal,
                           double depositoMinimo) {
        super(ccc, saldoActual, saldoMedio, fechaApertura, titular, sucursal);
        this.depositoMinimo = depositoMinimo;
    }

    public double getDepositoMinimo() {
        return depositoMinimo;
    }

    public void setDepositoMinimo(double depositoMinimo) {
        this.depositoMinimo = depositoMinimo;
    }

