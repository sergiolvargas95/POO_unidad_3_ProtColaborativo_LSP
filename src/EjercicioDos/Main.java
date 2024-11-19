package Sistema_de_Cuentas_Bancarias;

public class Main {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaAhorros(1000, 0.05);
        
        cuenta.depositar(500);
        System.out.println("Saldo después del depósito: " + cuenta.consultarSaldo());

        cuenta.retirar(200);
        System.out.println("Saldo después del retiro: " + cuenta.consultarSaldo());

        if (cuenta instanceof CuentaAhorros) {
            ((CuentaAhorros) cuenta).aplicarInteres();
            System.out.println("Saldo después de aplicar interés: " + cuenta.consultarSaldo());
        }
    }
}
