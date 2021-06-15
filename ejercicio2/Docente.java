package ejercicio2;

public class Docente extends Persona{
    int ID;

    public Docente(ICanal mediator){
        super(mediator);
    }

    @Override
    public void send(String mensaje) {
        canal.send(mensaje,this);
    }

    @Override
    public void recivido(String mensaje) {
        System.out.println("Gotten:");
        System.out.println("Mensaje: "+ mensaje);
        System.out.println("Nombre: "+ nombre);
        System.out.println("ID: "+ ID);
        System.out.println("Mensaje: "+ mensaje);
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
