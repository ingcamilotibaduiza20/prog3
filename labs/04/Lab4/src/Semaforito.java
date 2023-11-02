




import static java.lang.Thread.sleep;
import java.awt.Color;
import javax.swing.*;

 	/**
	*author Camilo Tibaduiza
	*/

public class Semaforito implements Runnable {

    private volatile boolean iterar;
    private final JButton rojo;
    private final JButton amarillo;
    private final JButton verde;
    private final JTextField texto;
    private int contador=0, temp=0, temp2=0, temp3=0, temp4=0;

    public Semaforito(JButton entrada1, JButton entrada2, JButton entrada3, JTextField entrada4) {
        this.rojo = entrada1;
        this.amarillo = entrada2;
        this.verde = entrada3;
        this.texto = entrada4;
    }

    @Override
    public void run() {
        try {
            while(iterar){
                contador++;
                if(contador>=1 && contador<=25){
                    temp++;
                    texto.setText(" "+ temp);
                }
                if(contador==1){
                    rojo.setBackground(Color.red);
                    amarillo.setBackground(Color.gray);
                    verde.setBackground(Color.gray);
                }
                if(contador>=25 && contador<=28){
                    temp2++;
                    texto.setText(" "+ temp2);
                }
                if(contador==25){
                    rojo.setBackground(Color.gray);
                    amarillo.setBackground(Color.yellow);
                    verde.setBackground(Color.gray);
                }
                if(contador>=28 && contador<=48){
                    temp3++;
                    texto.setText(" "+ temp3);
                }
                if(contador==28){
                    rojo.setBackground(Color.gray);
                    amarillo.setBackground(Color.gray);
                    verde.setBackground(Color.green);
                }
                if(contador>=48 && contador<=51){
                    temp4++;
                    texto.setText(" "+ temp4);
                }
                if(contador==51){
                    rojo.setBackground(Color.gray);
                    amarillo.setBackground(Color.yellow);
                    verde.setBackground(Color.gray);
                }
                if(contador==54){
                    contador=0;
                    temp=0;
                    temp2=0;
                    temp3=0;
                    temp4=0;
                }

               try{
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        } catch (Exception ex) {
            // Manejo específico de excepciones
        }
    }

    public void start(){
        iterar=true;
        new Thread(this).start();
    }

    public void detener(){
        iterar=false;
    }
    public void reiniciar(){
        contador=0;
        temp=0;
        temp2=0;
        temp3=0;
        temp4=0;
        texto.setText("");
    }
}
