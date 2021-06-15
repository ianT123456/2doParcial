package ejercicio2;

public class Estudiante extends Persona {
    int matricula;

    public Estudiante(ICanal mediator){
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
        System.out.println("Matricula: "+ matricula);
        System.out.println("Mensaje: "+ mensaje);
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
