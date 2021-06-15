package ejercicio2;

public class Admin extends Persona{
    String cargo;

    public Admin(ICanal mediator){
        super(mediator);
    }

    @Override
    public void send(String mensaje) {
        canal.send(mensaje,this);
    }

    @Override
    public void recivido(String mensaje) {
        System.out.println("Gotten:");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Cargo: "+ cargo);
        System.out.println("Mensaje: "+ mensaje);
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}