package ejercicio1oficial;

public class Originator {
    private Documento state;

    public Originator(){}

    public void setState(Documento state) {
        System.out.println("Escribiendoo");
        state.showInfo();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Guragdando");
        state.showInfo();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("Revertido");
        this.state.showInfo();
    }

}
