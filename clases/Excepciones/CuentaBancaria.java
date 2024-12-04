/*public class CuentaBancaria {
    double saldoInicial;

    public CuentaBancaria(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void retirar(double extraccion) throws SaldoInsuficienteException {
        if (extraccion > saldoInicial) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldoInicial -= extraccion;
    }
}
*/

public class CuentaBancaria {
    private double saldo;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para retirar dinero
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Tu saldo actual es: " + saldo);
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }

    // Método para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }