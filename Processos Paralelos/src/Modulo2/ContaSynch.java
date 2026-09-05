package Modulo2;

public class ContaSynch {
    private int saldo = 0;

    public ContaSynch(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    // O "synchronized" faz com que se uma thread tentar
    // entrar enquanto a primeira estiver lá, ela é obrigada a esperar
    public synchronized void depositar(){
        saldo++;
    }
}
