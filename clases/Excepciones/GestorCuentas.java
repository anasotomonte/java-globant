import java.util.Scanner;

public class GestorCuentas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de CuentaBancaria con un saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria(500.0);

        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        try {
            // Solicitar al usuario la cantidad a retirar
            System.out.print("Ingrese la cantidad que desea retirar: ");
            double cantidad = scanner.nextDouble();

            // Intentar realizar el retiro
            cuenta.retirar(cantidad);

        } catch (SaldoInsuficienteException e) {
            // Manejar la excepción personalizada
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Manejar cualquier otra excepción
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            // Cerrar el Scanner
            scanner.close();
        }
    }
}
