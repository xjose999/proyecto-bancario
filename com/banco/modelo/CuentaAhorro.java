import java.time.LocalDate;

/**
 * Cuenta de ahorro: tiene un tipo de amortización y puede requerir
 * un saldo mínimo para activar ciertos beneficios.
 * Representan únicamente el 5% del total de cuentas del banco.
 */
public class CuentaAhorro extends Cuenta {

    private String tipoAmortizacion;
    private double saldoMinimo;

    public CuentaAhorro(String ccc, double saldoActual, double saldoMedio,
                        LocalDate fechaApertura, Cliente titular, Sucursal sucursal,
                        String tipoAmortizacion, double saldoMinimo) {
        super(ccc, saldoActual, saldoMedio, fechaApertura, titular, sucursal);
        this.tipoAmortizacion = tipoAmortizacion;
        this.saldoMinimo = saldoMinimo;
    }

    public String getTipoAmortizacion() {
        return tipoAmortizacion;
    }

    public void setTipoAmortizacion(String tipoAmortizacion) {
        this.tipoAmortizacion = tipoAmortizacion;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
}

