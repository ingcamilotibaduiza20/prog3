import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Carro extends Thread {
    private String nombre;
    private int distanciaRecorrida;
    private static boolean carreraEnCurso = true;

    public Carro(String nombre) {
        this.nombre = nombre;
        this.distanciaRecorrida = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    @Override
    public void run() {
        Random random = new Random();
        int distanciaMeta = 100; // Punto de finalización

        while (distanciaRecorrida < distanciaMeta && carreraEnCurso) {
            int avance = random.nextInt(10) + 1; // Avance aleatorio entre 1 y 10
            distanciaRecorrida += avance;
            System.out.println(nombre + " ha recorrido " + distanciaRecorrida + " metros.");
        }

        if (carreraEnCurso) {
            carreraEnCurso = false;
            System.out.println(nombre + " ha ganado la competencia.");
        }
    }
}

public class CompetenciaCarros {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Carro1"));
        carros.add(new Carro("Carro2"));
        carros.add(new Carro("Carro3"));
        carros.add(new Carro("Carro4"));


        for (Carro carro : carros) {
            carro.start(); // Iniciar cada hilo (carro)
        }
    }
}
