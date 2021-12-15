import java.lang.Math;

class Random1 implements Runnable{
    public void run(){
        String colours[] = {"white","blue","black","green","red","yellow"};

        while(true){
            double i=Math.random()*6.0;
            int  x= (int)i;
            if( x == 4){
                break;
            }
            else{
                System.out.println(colours[x]+" "+"x = "+x);
            }
        }
    }
}
public class RandomColor {
    public static void main(String[] args) {

        Random1 r=new Random1();
        Thread th=new Thread(r);
        th.start();

    }

}

