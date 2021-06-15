package ejercicio2;

public abstract class Persona {
    public String nombre;

    protected ICanal canal;

    public Persona(ICanal mediator){
        this.canal =mediator;
    }

    public abstract void send(String mensaje);
    public abstract void recivido(String mensaje);
}
