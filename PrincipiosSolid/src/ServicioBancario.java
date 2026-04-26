public class ServicioBancario {
    private Notificador notificador;

    public ServicioBancario(Notificador notificador) {
        this.notificador = notificador;
    }

    public void operar(CuentaBancaria cuenta) {
        cuenta.depositar(5000);
        boolean ok = cuenta.retirar(2000);

        if (ok) {
            notificador.enviar(cuenta.getTitular(), "Operación exitosa!");
        } else {
            notificador.enviar(cuenta.getTitular(), "Saldo insuficiente.");
        }
    }
}
