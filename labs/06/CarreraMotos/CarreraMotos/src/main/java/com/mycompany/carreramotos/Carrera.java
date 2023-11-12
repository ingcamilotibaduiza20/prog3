package com.mycompany.carreramotos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author  Cristian Camilo Tibaduiza Melgarejo
 */
public class Carrera extends Thread{
    private JLabel eti;
    private JFrameCarrera p;
    
    public Carrera(JLabel eti,JFrameCarrera p){
        this.eti=eti;
        this.p=p;
    }
    
    public void run(){
        int c1=0, c2=0, c3=0, c4=0;
        while (true) {
            try {
                sleep((int)(Math.random()*1000));
                c1=p.getM1().getLocation().x;
                c2=p.getM2().getLocation().x;
                c3=p.getM3().getLocation().x;
                c4=p.getM4().getLocation().x;
                if(c1<p.get_Barrera().getLocation().x-10&&c2<p.get_Barrera().getLocation().x-10&&c3<p.get_Barrera().getLocation().x-10&&c4<p.get_Barrera().getLocation().x-10){
                    eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                    p.repaint();
                }else{
                    break;
                }
                
            } catch(InterruptedException e){
            }
            if(eti.getLocation().x>=p.get_Barrera().getLocation().x-10){
                if(c1>c2&&c1>c3&&c1>c4){
                    JOptionPane.showMessageDialog(null, "Gano la moto #1");
                }else if(c2>c1&&c2>c3&&c2>c4){
                    JOptionPane.showMessageDialog(null, "Gano la moto #2");
                }else if(c3>c2&&c3>c1&&c3>c4){
                    JOptionPane.showMessageDialog(null, "Gano la moto #3");
                }else if(c4>c2&&c4>c3&&c4>c1){
                    JOptionPane.showMessageDialog(null, "Gano la moto #4");
                }else{
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }    
    }
}
