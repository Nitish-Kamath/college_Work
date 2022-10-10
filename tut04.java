class A {
    // for synchronization use keyword synchronized at start in print method
    public void print(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("]");
    }
}

class B implements Runnable {

    A ref;
    String msg;
    Thread t;

    B(A ref_, String msg_) {
        ref = ref_;
        msg = msg_;
        t = new Thread(this);
        t.start();

    }

    public void run() {
        // for synchronization uncommnet the line
        // synchronized (ref) {
        ref.print(msg);
        // }
    }
}

public class tut04 {
    public static void main(String[] args) {

        A obj = new A();
        new B(obj, "Hi");
        new B(obj, "Hello");
        new B(obj, "HiHello");
    }

}
