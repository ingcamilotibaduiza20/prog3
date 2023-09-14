import java.util.Scanner;

class Carro {
    private String marca;
    private String modelo;
    private String color;
    private double kilometraje;

    public Carro(String marca, String modelo, String color, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    // Métodos para acceder a las propiedades del carro
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getKilometraje() {
        return kilometraje;
    }
}

public class concesionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de carros: ");
        int cantidadCarros = scanner.nextInt();

        // Crear un arreglo de carros con la cantidad especificada por el usuario
        Carro[] carros = new Carro[cantidadCarros];

        // Solicitar los detalles de cada carro al usuario y crear objetos Carro
        for (int i = 0; i < cantidadCarros; i++) {
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese los detalles del carro " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Kilometraje: ");
            double kilometraje = scanner.nextDouble();

            carros[i] = new Carro(marca, modelo, color, kilometraje);
        }

        // Imprimir los detalles de los carros
        System.out.println("Detalles de los carros ingresados:");
        for (int i = 0; i < cantidadCarros; i++) {
            System.out.println("Carro " + (i + 1) + ":");
            System.out.println("Marca: " + carros[i].getMarca());
            System.out.println("Modelo: " + carros[i].getModelo());
            System.out.println("Color: " + carros[i].getColor());
            System.out.println("Kilometraje: " + carros[i].getKilometraje() + " km");
            System.out.println();
        }
    }
}
