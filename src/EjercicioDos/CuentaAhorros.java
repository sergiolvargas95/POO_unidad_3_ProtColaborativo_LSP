package Sistema_de_Cuentas_Bancarias;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        if (tasaInteres < 0 || tasaInteres > 1) {
            throw new IllegalArgumentException("La tasa de interés debe estar entre 0 y 1.");
        }
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser mayor que cero.");
        }
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
        saldo -= cantidad;
    }

    // Método para aplicar intereses
    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }
}
