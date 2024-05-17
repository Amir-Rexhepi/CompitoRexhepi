package thread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         Botteghino b1 = new Botteghino();
         Biglietto b2 = new Biglietto();

         for(int i = 0; i < 49; i++)
         {
            Persona p1 = new Persona(b1, b2);
            p1.start();
         }
    }
}
