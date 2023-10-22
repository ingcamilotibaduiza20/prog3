package com.mycompany.ej0402;

import java.util.Timer;
import java.util.TimerTask;

public class Ej0402 {
    public static void main(String[] args) {
        // Creamos una tarea de temporizador que imprimirá un saludo y un contador
        TimerTask timertask = new TimerTask() {
            int i = 0;
            @Override
            public void run() {
                System.out.println("Hola " + i); // Imprimimos un mensaje con un contador
                i++; // Incrementamos el contador
            }
        };
        Timer timer = new Timer(); // Creamos una instancia de Timer para controlar la tarea
        // Programamos la tarea para que se ejecute cada 2 segundos (2000 milisegundos)
        // a partir de un retraso inicial de 0 milisegundos
        timer.scheduleAtFixedRate(timertask, 0, 2000);
    }
};
