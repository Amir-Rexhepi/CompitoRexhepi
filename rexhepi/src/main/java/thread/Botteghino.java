package thread;

public class Botteghino {
    public int venditori = 5;

    public Botteghino(){

    }

    public synchronized void entra(){
        try {
         String name  =  Thread.currentThread().getName();
            while (venditori< 1) {

                System.out.println(name + " Sta aspettando il suo turno");
                wait();
            }
            venditori--;
            
        } catch (Exception e) {
        }
    }

    public synchronized void esce(){
        String name  =  Thread.currentThread().getName();
        System.out.println( name + "e' uscito ");
        venditori++;
        notifyAll();

    }
}
