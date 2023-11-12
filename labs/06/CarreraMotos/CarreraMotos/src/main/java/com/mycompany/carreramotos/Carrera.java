/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreramotos;

/**
 *
 * @author  Cristian Camilo Tibaduiza Melgarejo
 */
public class Carrera extends Thread{
    private Jlabel eti;
    private JFrameCarrera p;
    
    public Carrera(JLabel eti,JFrameCarrera p){
        this.eti=eti;
        this.p=p;
    }
    
}
