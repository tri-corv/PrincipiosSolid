public class ServicioBancario {
    private Notificador notificador;

    public ServicioBancario(Notificador notificador) {
        this.notificador = notificador;
    }

    public void operar(CuentaBancaria cuenta) {
        try {
            cuenta.depositar(5000);
            notificador.enviar(cuenta.getTitular(), "Depósito exitoso.");
        } catch (IllegalArgumentException e) {
            notificador.enviar(cuenta.getTitular(), "Depósito fallido... " + e.getMessage());
        }

        try {
            boolean ok = cuenta.retirar(5000);
            if (ok) {
                notificador.enviar(cuenta.getTitular(), "Extracción exitosa.");
            } else {
                notificador.enviar(cuenta.getTitular(), "Saldo insuficiente.");
            }
        } catch (IllegalArgumentException e) {
            notificador.enviar(cuenta.getTitular(), "Retiro fallido... " + e.getMessage());
        }
    }
}
