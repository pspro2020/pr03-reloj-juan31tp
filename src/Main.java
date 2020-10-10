/* Realiza una aplicación en la que un hilo principal cree un hilo secundario cuyo cometido sea mostrar por pantalla cada segundo
la hora actual. El hilo principal, una vez lanzado el hilo secundario esperará 12 segundos, tras lo cual, interrumpirá al hilo
secundario. Acto seguido, esperará a que finalice la ejecución del hilo secundario, y después mostrará un mensaje por pantalla diciendo
"El hilo secundario ya ha terminado de ejecutarse". El hilo secundario, por su parte, cuando detecte que ha sido interrumpido deberá
concluir su ejecución lo antes posible.*/


import java.time.Clock;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*We create the */
        Thread thread = new Thread(new Watch(), "Clock");

        /*We start the thread*/
        thread.start();

        /*We wait 12 seconds*/
        TimeUnit.SECONDS.sleep(12);

        /*We interrupt the thread*/
        thread.interrupt();



    }

}
