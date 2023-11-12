import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Entrada {

    private List<Casos> casos;

    public Entrada() {
        casos = new ArrayList<>();
        cargarDesdeArchivo();
    }

    private void cargarDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("casos.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosCasos = scanner.nextLine().split(",");
                Casos temp = new Casos(datosCasos[0], Integer.parseInt(datosCasos[1]), Integer.parseInt(datosCasos[3]));
                casos.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
    
    public float[] casosPorMunicipiosTodos(){
        float casosMunicipio[] = new float [22];
        int i=0;
        while (i<casos.size()){
            Casos temp = casos.get(i);
            
            switch (temp.municipio) {
                case "BARANOA":
                    casosMunicipio[0] += temp.confirmados;
                    break;
                case "CAMPO DE LA CRUZ":
                    casosMunicipio[1] += temp.confirmados;
                    break;
                case "CANDELARIA":
                    casosMunicipio[2] += temp.confirmados;
                    break;
                case "GALAPA":
                    casosMunicipio[3] += temp.confirmados;
                    break;
                case "JUAN DE ACOSTA":
                    casosMunicipio[4] += temp.confirmados;
                    break;
                case "LURUACO":
                    casosMunicipio[5] += temp.confirmados;
                    break;
                case "MALAMBO":
                    casosMunicipio[6] += temp.confirmados;
                    break;
                case "MANATI":
                    casosMunicipio[7] += temp.confirmados;
                    break;
                case "PALMAR DE VARELA":
                    casosMunicipio[8] += temp.confirmados;
                    break;
                case "PIOJO":
                    casosMunicipio[9] += temp.confirmados;
                    break;
                case "POLO NUEVO":
                    casosMunicipio[10] += temp.confirmados;
                    break;
                case "PONEDERA":
                    casosMunicipio[11] += temp.confirmados;
                    break;
                case "PUERTO COLOMBIA":
                    casosMunicipio[12] += temp.confirmados;
                    break;
                case "REPELON":
                    casosMunicipio[13] += temp.confirmados;
                    break;
                case "SABANAGRANDE":
                    casosMunicipio[14] += temp.confirmados;
                    break;
                case "SABANALARGA":
                    casosMunicipio[15] += temp.confirmados;
                    break;
                case "SANTA LUCIA":
                    casosMunicipio[16] += temp.confirmados;
                    break;
                case "SANTO TOMAS":
                    casosMunicipio[17] += temp.confirmados;
                    break;
                case "SOLEDAD":
                    casosMunicipio[18] += temp.confirmados;
                    break;
                case "SUAN":
                    casosMunicipio[19] += temp.confirmados;
                    break;
                case "TUBARA":
                    casosMunicipio[20] += temp.confirmados;
                    break;
                case "USIACURI":
                    casosMunicipio[21] += temp.confirmados;
                    break;
                default:
                    System.out.println("Error: El municipio "+temp.municipio+" no esta dentro de las posibles.");
                    break;
            }
            
            
            i++;
        }
        
        return casosMunicipio;
    }
    
    public float[] casosPorMunicipiosMuertos() {
        float casosMunicipio[] = new float[22];
        int i = 0;
        while (i < casos.size()) {
            Casos temp = casos.get(i);

            switch (temp.municipio) {
                case "BARANOA":
                    casosMunicipio[0] += temp.muertos;
                    break;
                case "CAMPO DE LA CRUZ":
                    casosMunicipio[1] += temp.muertos;
                    break;
                case "CANDELARIA":
                    casosMunicipio[2] += temp.muertos;
                    break;
                case "GALAPA":
                    casosMunicipio[3] += temp.muertos;
                    break;
                case "JUAN DE ACOSTA":
                    casosMunicipio[4] += temp.muertos;
                    break;
                case "LURUACO":
                    casosMunicipio[5] += temp.muertos;
                    break;
                case "MALAMBO":
                    casosMunicipio[6] += temp.muertos;
                    break;
                case "MANATI":
                    casosMunicipio[7] += temp.muertos;
                    break;
                case "PALMAR DE VARELA":
                    casosMunicipio[8] += temp.muertos;
                    break;
                case "PIOJO":
                    casosMunicipio[9] += temp.muertos;
                    break;
                case "POLO NUEVO":
                    casosMunicipio[10] += temp.muertos;
                    break;
                case "PONEDERA":
                    casosMunicipio[11] += temp.muertos;
                    break;
                case "PUERTO COLOMBIA":
                    casosMunicipio[12] += temp.muertos;
                    break;
                case "REPELON":
                    casosMunicipio[13] += temp.muertos;
                    break;
                case "SABANAGRANDE":
                    casosMunicipio[14] += temp.muertos;
                    break;
                case "SABANALARGA":
                    casosMunicipio[15] += temp.muertos;
                    break;
                case "SANTA LUCIA":
                    casosMunicipio[16] += temp.muertos;
                    break;
                case "SANTO TOMAS":
                    casosMunicipio[17] += temp.muertos;
                    break;
                case "SOLEDAD":
                    casosMunicipio[18] += temp.muertos;
                    break;
                case "SUAN":
                    casosMunicipio[19] += temp.muertos;
                    break;
                case "TUBARA":
                    casosMunicipio[20] += temp.muertos;
                    break;
                case "USIACURI":
                    casosMunicipio[21] += temp.muertos;
                    break;
                default:
                    System.out.println("Error: El municipio " + temp.municipio + " no esta dentro de las posibles.");
                    break;
            }
            i++;
        }
        return casosMunicipio;
    }
    
    
}
