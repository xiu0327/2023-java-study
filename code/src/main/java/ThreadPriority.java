public class ThreadPriority {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();


        thread1.setPriority(7);

        System.out.println("Thread1 Priority = " + thread1.getPriority());
        System.out.println("Thread2 Priority = " + thread2.getPriority());

        thread1.start();
        thread2.start();

    }
}

class Thread1 extends Thread{

    @Override
    public void run() {
        for(int i=0; i<300; i++){
            System.out.print("a");
            for(int x=0; x<10000000; x++);
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i< 300; i++){
            System.out.print("b");
            for(int x=0; x<10000000; x++);
        }
    }
}
