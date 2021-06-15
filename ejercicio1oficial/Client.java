package ejercicio1oficial;

public class Client {
    public static void main (String []args){
        Historial h = new Historial();
        Originator originator = new Originator();

        Documento documento;
        documento = new Documento("1");
        originator.setState(documento);
        h.createMemento(1,originator.createMemento());
        documento = new Documento("2");
        originator.setState(documento);
        h.createMemento(2,originator.createMemento());
        documento = new Documento("3");
        originator.setState(documento);
        h.createMemento(3,originator.createMemento());
        documento = new Documento("4");
        originator.setState(documento);
        h.createMemento(4,originator.createMemento());

        originator.restoreFromMemento(h.getMemento("ctrl+z",4));
        originator.restoreFromMemento(h.getMemento("ctrl+z",3));
        originator.restoreFromMemento(h.getMemento("ctrl+z",2));
        originator.restoreFromMemento(h.getMemento("ctrl+y",1));
        originator.restoreFromMemento(h.getMemento("ctrl+y",2));
        originator.restoreFromMemento(h.getMemento("ctrl+y",3));
    }
}
