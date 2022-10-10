class helper extends Thread {

    helper() {
        super();
        // since we are using Thread class ,super keyword  automatically creates thread 
        System.out.println(this);
        start();
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

public class tut02 {

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