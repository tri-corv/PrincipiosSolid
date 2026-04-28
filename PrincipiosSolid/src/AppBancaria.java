public class AppBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("83604", 15000, "Pedro Rios");

        ServicioBancario servicio = new ServicioBancario(new NotificadorEmail());
        servicio.operar(cuenta);

        ImpresoraCuenta impresora = new ImpresoraCuenta();
        impresora.imprimir(cuenta);
    }
}
