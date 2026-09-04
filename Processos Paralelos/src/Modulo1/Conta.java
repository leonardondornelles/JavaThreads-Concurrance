package Modulo1;

public class Conta {
    private int saldo = 0;

    public Conta(int saldo){
        this.saldo = saldo;
    }

    public void depositar(){
        saldo++;
    }
}
