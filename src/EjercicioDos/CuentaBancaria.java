package Sistema_de_Cuentas_Bancarias;

public abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        }
        saldo += cantidad;
    }

    
    public abstract void retirar(double cantidad);

    
    public double consultarSaldo() {
        return saldo;
    }
}
