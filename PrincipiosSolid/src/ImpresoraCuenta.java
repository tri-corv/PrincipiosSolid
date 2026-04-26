public class ImpresoraCuenta {
    public void imprimir(CuentaBancaria cuenta) {
        System.out.println("Titular: "+ cuenta.getTitular());
        System.out.println("ID: " + cuenta.getIdCuenta());
        System.out.println("Saldo: $" + cuenta.getSaldo());
    }
}
