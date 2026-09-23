package Exercises;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if(saldoInicial >= 0){
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double monto) {
        if(monto > 0) {
            this.saldo += monto;
            return true;
        }
        return false;
    }

    public boolean retirar(double monto) {
        if(monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }
}