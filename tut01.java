class helper implements Runnable {

    Thread t;

    helper() {
        t = new Thread(this, "thread01");
        System.out.println(t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("run_method");
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class tut01 {

    public static void main(String args[]) {
        new helper();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main_method");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}