package thread;

public class Persona extends Thread{

    public Botteghino b;
    public Biglietto b1;

    public Persona(Botteghino b, Biglietto b1){

        this.b = b;
        this.b1 = b1;

    }
    public void setB(Botteghino b) {
        this.b = b;
    }
    public Botteghino getB() {
        return b;
    }
    public void setB1(Biglietto b1) {
        this.b1 = b1;
    }
    public Biglietto getB1() {
        return b1;
    }

    public void run (){
        try {
     String name  =  Thread.currentThread().getName();
     int tmp = 1000 +  (int) Math.floor(Math.random() * 2000);   
     Thread.sleep(tmp); 
        b1.entra(); 
        b.entra();
        b.esce();
        System.out.println( name +"ha atteso un tempo di " + (tmp/1000) + "secondi");


    } catch (Exception e) {
        // TODO: handle exception
    }
    }
    
}
