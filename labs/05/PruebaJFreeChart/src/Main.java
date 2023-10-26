/* Tomado de https://www.adictosaltrabajo.com/2011/11/10/grafica-series-jfreechart/
   Adaptado por Hector Murcia Forero
   26-Oct-2023 5:38 a.m.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
	public static final int ANCHO_GRAFICA = 400;
 
	public static final int ALTO_GRAFICA = 300;
 
	public static void main(String args[]) {
                // AYUDA: Leer el Contenido de un Archivo de Texto con la Clase Scanner
                // https://www.youtube.com/watch?v=_0tE5tBggpc

                String arch = "Casos_positivos_de_COVID-19_en_el_Departamento_del_Atl_ntico_20231026.csv";    // Ruta y nombre del archivo
                File archiData = new File(arch);

                final XYSeriesCollection collection = new XYSeriesCollection();

                try {
                    Scanner leeArch = new Scanner(archiData);
                    String valor = null;
                    int sec = 1;
                    while (leeArch.hasNextLine()) {
                        final XYSeries serie1 =
                            new XYSeries(sec == 1 ? leeArch.nextLine() : valor);
                        sec = 1;
                        while (leeArch.hasNextLine()) {
                            valor = leeArch.nextLine();
			final PruebaJFreeChart prueba = new PruebaJFreeChart();
			final JFreeChart grafica = prueba.crearGrafica(collection);
			ChartUtilities.saveChartAsPNG(new File("tiempos-entrenamientos.png"), grafica, ANCHO_GRAFICA, ALTO_GRAFICA);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

        public static boolean isNumeric(String strNum) {
            if (strNum == null) {
                return false; 
            }
            return Pattern.compile("-?\\d+(\\.\\d+)?").matcher(strNum).matches();
        }
}