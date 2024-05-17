package thread;

public class Biglietto {
    
    int biglietti = 100;
    int conta  = 0;
    public Biglietto(){

    }

    public synchronized void entra(){
        try {
        String name  =  Thread.currentThread().getName();

           if (biglietti < 1 ) {
                   
            System.out.println("Biglietti finiti"); 
            
            conta ++ ;
            System.out.println("sono rimasti senza biglietto " + conta);
           }
           else
           {
            int bigli =  1 + (int) Math.floor(Math.random() * 3); 
            System.out.println(name + " ha acquistato: " + bigli + " biglietti");

            biglietti = biglietti - bigli;

            System.out.println("Biglietti rimansti : " + biglietti);
           }
         } catch (Exception e) {
                // TODO: handle exception
            }
    }
}
