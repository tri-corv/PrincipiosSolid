public class AppBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta;

        try {
            cuenta = new CuentaBancaria("83604", 15000, "Pedro Rios");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear la cuenta: " + e.getMessage());
            return; // no continua sin una cuenta valida
        }

        ServicioBancario servicio = new ServicioBancario(new NotificadorEmail());
        servicio.operar(cuenta);

        ImpresoraCuenta impresora = new ImpresoraCuenta();
        impresora.imprimir(cuenta);
    }
}
