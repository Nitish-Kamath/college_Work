// wajp to create two child thread in differnet function with delay of 1s. 
// But you have to generate the child thread from main Method directly

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("This is thread01");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is thread02");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}

public class tut03 {
    A obj1 = new A();
    B Obj2 = new B();
    // here we are connecting object with thread t1
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(Obj2);



    
}
