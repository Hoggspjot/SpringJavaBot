package wowtest;

public class telega {
    public static synchronized void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> pong());
        t.start();
        Thread.sleep(1000);
        System.out.print("ping");
    }


    static synchronized void pong(){
        System.out.println("pong");
    }
}
