package com.mycompany.ej0401;

import java.util.Timer;
import java.util.TimerTask;

public class Ej0401 {
    Timer timer; // Declaramos un temporizador

    // Constructor que establece una alarma después de un cierto número de segundos
    public Ej0401(int segundos) {
        timer = new Timer(); // Inicializamos el temporizador
        timer.schedule(new Recordatorio(), segundos * 1000); // Programamos la alarma para sonar en 'segundos' el *1000 es por segundos
    }

    // Clase interna que representa la acción de la alarma
    class Recordatorio extends TimerTask {
        // Esta función se ejecutará cuando la alarma suene
        public void run() {
            System.out.println("¡Tiene un recordatorio!"); // Se muestra un mensaje
            timer.cancel(); // Se detiene la alarma
        }
    }

    public static void main(String args[]) {
        System.out.println("Inicio del programa"); // Se indica que comienza el programa
        new Ej0401(5); // Creamos una instancia de Ej0401 con una alarma que suena en 5 segundos
    }
}
