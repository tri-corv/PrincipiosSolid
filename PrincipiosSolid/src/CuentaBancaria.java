public class CuentaBancaria {
    private String titular;
    private String idCuenta;
    private double saldo;

    public CuentaBancaria(String idCuenta, double saldo, String titular) {
        this.idCuenta = idCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double monto){
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if(saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public String getTitular() {return titular;}
    public String getIdCuenta() {return idCuenta;}
    public double getSaldo() {return saldo;}
}
