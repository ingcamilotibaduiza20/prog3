import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
*author Camilo Tibaduiza
*/

public class AplicacionAnalisisDatos {

    public static void main(String[] args) {
        // Supongamos que tenemos una lista de datos de ejemplo.
        List<Dato> datos = obtenerDatosDeExcel();

        // Interfaz de usuario con listados desplegables.
        List<String> paisesDisponibles = obtenerPaisesDisponibles(datos);
        List<String> ciudadesDisponibles = obtenerCiudadesDisponibles(datos);

        // El usuario selecciona un país y una ciudad.

        String paisSeleccionado = "Colombia"; 
        String ciudadSeleccionada = "Bogota"; 

        // Filtrar los datos por país y ciudad.
        List<Dato> datosFiltrados = datos.stream()
                .filter(dato -> dato.getPais().equals(paisSeleccionado) && dato.getCiudad().equals(ciudadSeleccionada))
                .collect(Collectors.toList());

        // Obtener el top 3 de los tipos de robos más comunes.
        List<TipoDeRobo> top3TiposDeRobo = obtenerTop3TiposDeRobo(datosFiltrados);

        // Generar un archivo CSV con los resultados.
        generarReporteCSV(top3TiposDeRobo, paisSeleccionado, ciudadSeleccionada);

        // Generar gráficas estadísticas comparativas.
        generarGraficas(datosFiltrados);
    }

    // Método para obtener datos desde un archivo Excel (necesitarás una biblioteca como Apache POI).
    public static List<Dato> obtenerDatosDeExcel() {
        // Implementa la lógica para cargar datos desde Excel aquí.
        // Retorna una lista de objetos Dato.
        return new ArrayList<>();
    }

    // Método para obtener la lista de países disponibles en los datos.
    public static List<String> obtenerPaisesDisponibles(List<Dato> datos) {
        // Implementa la lógica para obtener la lista de países aquí.
        return Collections.emptyList();
    }

    // Método para obtener la lista de ciudades disponibles en los datos.
    public static List<String> obtenerCiudadesDisponibles(List<Dato> datos) {
        // Implementa la lógica para obtener la lista de ciudades aquí.
        return Collections.emptyList();
    }

    // Método para obtener el top 3 de los tipos de robos más comunes.
    public static List<TipoDeRobo> obtenerTop3TiposDeRobo(List<Dato> datos) {
        // Implementa la lógica para calcular los tipos de robos más comunes aquí.
        return Collections.emptyList();
    }

    // Método para generar un archivo CSV con los resultados.
    public static void generarReporteCSV(List<TipoDeRobo> top3TiposDeRobo, String pais, String ciudad) {
        try (FileWriter writer = new FileWriter("reporte.csv")) {
            // Implementa la lógica para escribir los datos en formato CSV aquí.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para generar gráficas estadísticas comparativas.
    public static void generarGraficas(List<Dato> datos) {
        // Implementa la lógica para generar gráficas aquí.
    }
}

class Dato {
    private String pais;
    private String ciudad;
    private String tipoDeRobo;
    // Otros atributos y métodos relevantes.

    // Getters y setters.
}

class TipoDeRobo {
    private String nombre;
    private int cantidad;
    // Otros atributos y métodos relevantes.

    // Getters y setters.
}
