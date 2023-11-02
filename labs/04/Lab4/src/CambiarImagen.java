import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class CambiarImagen {
    static int contador=0;
    public static void main(String[] args){
        int velocidad = 1;
        Timer timer;
        TimerTask tarea;
        
        int velmil = velocidad*100;
        
        Semaforo semaforo = new Semaforo();
        semaforo.setVisible(true);
        
        tarea = new TimerTask(){
            
            @Override
            public void run() {
                Icon icono;
                switch (contador){
                    case 0:
                    contador =1;
                    icono = new ImageIcon(getClass().getResource("iconos/contact.png"));
                    semaforo.foto.setIcon(icono);
                    break;
                    case 1:
                        contador =2;
                    icono = new ImageIcon(getClass().getResource("iconos/recoil.png"));
                    semaforo.foto.setIcon(icono);
                        break;
                    case 2:
                        contador =3;
                    icono = new ImageIcon(getClass().getResource("iconos/passing.png"));
                    semaforo.foto.setIcon(icono);
                        break;
                        
                        
                }
            }
            
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea,velmil,velmil);
    }
    
}
