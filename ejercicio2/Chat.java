package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chat implements ICanal {

    private Map<String, Persona> pMap = new HashMap<>();
    private List<String> nombre = new ArrayList<>();
    String notify;

    public void anadirCrio(Persona persona){
        pMap.put(persona.nombre, persona);
        nombre.add(persona.nombre);
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    @Override
    public void send(String mensaje, Persona person) {
        Persona po= person;
        for (String personFrom: nombre) {
            if (!personFrom.equals(po.nombre)){
                if (po instanceof Estudiante && this.getNotify().equals("ALL")){
                    pMap.get(personFrom).recivido(mensaje);
                }
                else if (po instanceof Estudiante && pMap.get(personFrom) instanceof Docente && this.getNotify().equals("docente")){
                    pMap.get(personFrom).recivido(mensaje);
                }
                else if (po instanceof Estudiante && pMap.get(personFrom) instanceof Admin && this.getNotify().equals("admin")){
                    pMap.get(personFrom).recivido(mensaje);
                }
                else if (po instanceof Docente && (pMap.get(personFrom) instanceof Docente || pMap.get(personFrom) instanceof Estudiante )){
                    pMap.get(personFrom).recivido(mensaje);
                }
                else if (po instanceof Admin){
                    pMap.get(personFrom).recivido(mensaje);
                }
            }
        }
    }
}
