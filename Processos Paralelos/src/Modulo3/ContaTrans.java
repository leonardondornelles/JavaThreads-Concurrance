package Modulo3;

public class ContaTrans {
    private int saldo = 0;

    public ContaTrans(int saldo){
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

    public synchronized void tranferir(int quantidade, ContaTrans conta){
        if(quantidade > this.getSaldo()){
            System.out.println("Saldo Insuficiente");
            return;
        }
        this.saldo -= quantidade;
        conta.saldo += quantidade;
    }
}
