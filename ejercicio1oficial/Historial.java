package ejercicio1oficial;

import java.util.HashMap;
import java.util.Map;

public class Historial {
    private Map<Integer,Memento> stateS = new HashMap<>();

    public void createMemento (Integer version, Memento memento){
        stateS.put(version,memento);
    }

    public Memento getMemento(String operacion, int version){
        if(operacion.equals("ctrl+z")){
            System.out.println("--");
            System.out.println("ctrl+z");
            return stateS.get(version-1);
        } else if (operacion.equals("ctrl+y")){
            System.out.println("--");
            System.out.println("ctrl+y");
            return stateS.get(version+1);
        } else{
            return stateS.get(version);
        }
    }
}

