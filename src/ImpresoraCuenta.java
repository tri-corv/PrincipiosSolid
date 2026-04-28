public class ImpresoraCuenta {
    public void imprimir(CuentaBancaria cuenta) {
        System.out.println("Titular: "+ cuenta.getTitular());
        System.out.println("ID: " + cuenta.getIdCuenta());

        if (cuenta.getSaldo() >= 0) {
            System.out.println("Saldo: $" + cuenta.getSaldo());
        }
    }
}
