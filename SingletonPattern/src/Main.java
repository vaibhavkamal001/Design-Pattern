import Singleton.ThreadSafeSingleton;

public class Main extends Thread{
    @Override
    public void run(){
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        for(int i = 0; i<10; i++){
            int count = threadSafeSingleton.increase();
            System.out.println("Increase count = "+count+" "+Thread.currentThread().getName()+" "+threadSafeSingleton.toString());
        }
//        for(int i = 0; i<10; i++){
//            int count = threadSafeSingleton.decrease();
//            System.out.println("Decrease count = "+count+" "+Thread.currentThread().getName());
//        }
    }
    public static void main(String[] args) {
        Main t1 = new Main();
        Main t2 = new Main();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
        System.out.println("Hello world!");
    }
}