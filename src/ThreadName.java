
class Thread1 extends Thread{
    public Thread1 (String name1){
        super(name1);
        System.out.println("Thread1 name is "+name1);
    }
}

class Thread2 extends Thread{
    public Thread2(String name2){
        super(name2);
        System.out.println("Thread2 name is "+name2);
    }
}


public class ThreadName {
    public static void main(String[] args) {
        Thread1 t1=new Thread1("Scooby");
        Thread2 t2=new Thread2("Shaggy");

    }
}

