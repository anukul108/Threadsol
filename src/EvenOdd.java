class Mythread5 extends Thread{
    public static Thread obj;
    public void run()
    {
        try {
            obj.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("even numbers are");
        for (int i = 1; i <=20 ; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
public class EvenOdd {
    public static void main(String[] args) {

        Mythread5.obj = Thread.currentThread();
        Mythread5 t1 = new Mythread5();
        t1.start();

        System.out.println("odd numbers are ");
        for (int i = 1; i <=20 ; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }

    }
}
