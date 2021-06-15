package ejercicio1oficial;

public class Memento {
    private Documento state;
    public Memento(Documento stateSaved){
        this.state=stateSaved;
    }
    public Documento getState() {
        return state;
    }
}