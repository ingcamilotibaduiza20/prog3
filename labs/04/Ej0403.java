import java.util.TimerTask;

public class Ej0403 extends javax.swing.JFrame {
    Timer timer; // Declaración de un objeto Timer para controlar el temporizador.
    TimerTask timertask; // Declaración de un objeto TimerTask para definir la tarea del temporizador.
    Boolean funcionando = false; 
    public Ej0403() {
        initComponents(); // Inicializa los componentes de la interfaz gráfica.
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!funcionando) { // Si el temporizador no está funcionando
            timer = new Timer(); // Se crea una nueva instancia de Timer creo que para eso sirve.
            
            timertask = new TimerTask() {
                int i = 5;

                @Override
                public void run() {
                    jLabel1.setLocation(i, 19); 
                    i++; 
                }
            }; 
            timer.scheduleAtFixedRate(timertask, 0, 100); // Programamos la tarea para ejecutarse cada 100 milisegundos.
            funcionando = true; 
            jButton1.setText("Detener"); 
        } else { // Si el temporizador está funcionando
            timer.cancel(); // Cancelamos el temporizador, deteniendo la tarea.
            funcionando = false; // Actualizamos el estado del temporizador a detenido.
            jButton1.setText("Iniciar"); // Cambiamos el texto del botón a "Iniciar".
        }
    }
    public static void main(String args[]) {
        // Método principal 
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
}
