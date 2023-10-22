package ej0404;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej0404 extends javax.swing.JFrame {
    Timer temporizador; // Declaración de un objeto Timer para controlar el temporizador.
    ActionListener al; // Declaración de un objeto ActionListener para definir la acción del temporizador.
    public Ej0404() {
        initComponents(); // Inicializa los componentes de la interfaz gráfica.

        al = new ActionListener() {
            int i = 0; // Inicializamos una variable 'i' para el movimiento vertical.

            @Override
            public void actionPerformed(ActionEvent e) {
                // Calculamos la posición horizontal 'x' utilizando una función sinusoidal.
                double x = 50 + 10 * Math.sin(2 * Math.PI / 10 * (double) i);
                jRadioButton1.setLocation((int) x, i); 
                i++; // Incrementamos 'i' para cambiar la posición vertical en cada ejecución.
            }
        };

        temporizador = new Timer(100, al); // Creamos un temporizador que ejecutará la acción cada 100 milisegundos.
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
       
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!temporizador.isRunning()) { // Si el temporizador no está en funcionamiento
            temporizador.start(); // Iniciamos el temporizador.
            jButton1.setText("Detener"); // Cambiamos el texto del botón a "Detener".
        } else { // Si el temporizador está en funcionamiento
            temporizador.stop(); // Detenemos el temporizador.
            jButton1.setText("Iniciar"); // Cambiamos el texto del botón a "Iniciar".
        }
    }
    public static void main(String args[]) {
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
}
