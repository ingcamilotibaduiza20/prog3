
/**
 * HILOS EJEMPLO
 * @author Camilo Tibaduiza
 */

public class HilosLab06 extends Thread{
    private static int val = 0;
    public static void main(String[] args) {
        for (int i=0; i<30; i++){
            val = i;
            HilosLab06 thread = new HilosLab06();
            thread.start();
        }
        for (int i=0; i<30;i++)
        System.out.println("Principal #"+i);
    }
    public void run() {
        System.out.println("Thread #"+val);  
    }
}
