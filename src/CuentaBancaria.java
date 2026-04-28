public class CuentaBancaria {
    private String titular;
    private String idCuenta;
    private double saldo;

    public CuentaBancaria(String idCuenta, double saldo, String titular) {
        this.idCuenta = idCuenta;
        this.saldo = saldo;
        this.titular = titular;

        if (saldo < 0) {
            throw new IllegalArgumentException("[SALDO INCIAL]: NEGATIVO. El saldo inicial no puede ser negativo.");
        }
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("[MONTO INVÁLIDO]: El monto a depositar debe ser mayor a cero.");
        }
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("[MONTO INVÁLIDO]: El monto a retirar debe ser mayor a cero.");
        }
        if (saldo < monto) {
            return false; // saldo insuficiente - se envía un mail
        }
        saldo -= monto;
        return true;
    }

    public String getTitular() {return titular;}
    public String getIdCuenta() {return idCuenta;}
    public double getSaldo() {return saldo;}
}
