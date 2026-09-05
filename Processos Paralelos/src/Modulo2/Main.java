package Modulo2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ContaSynch conta = new ContaSynch(200);

        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    conta.depositar();
                }
            }
        };

        Thread t1 = new Thread(tarefa);
        Thread t2 = new Thread(tarefa);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(conta.getSaldo());
    }
}
