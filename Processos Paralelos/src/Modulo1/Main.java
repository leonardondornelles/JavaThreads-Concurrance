package Modulo1;

public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta(200);

        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10000; i++) {
                    conta.depositar();
                }
            }
        };

        Thread t1 = new Thread(tarefa);
        Thread t2 = new Thread(tarefa);

        t1.start();
        t2.start();

    }
}
