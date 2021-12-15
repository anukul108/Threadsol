public class Threadcontrol extends Thread
{
    void printing(){
        for(int i=1;i<=10;i++){
            try {
                if (i == 6) {
                    Thread.sleep(5000);
                }
                System.out.println(i);
            }
            catch (Exception e){}
        }
    }

    public static void main(String[] args) {
        Threadcontrol t=new Threadcontrol();
        t.printing();
    }
}