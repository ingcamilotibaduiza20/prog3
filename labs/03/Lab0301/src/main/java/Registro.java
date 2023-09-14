import java.util.LinkedList;

public class Registro {
String codEstudiante;
LinkedList<Asignatura> listAsignatura;

Registro(String codEstudiante){
    this.codEstudiante = codEstudiante;
    listAsignatura = new LinkedList<>();
}
}