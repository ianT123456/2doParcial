package ejer1;



import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPaginaWeb {

    private List<IUsuario> users = new ArrayList<>();
    private List<Publicacion> publicaciones = new ArrayList<>();

    public void anadirPublicacion(Publicacion publicacion){
        publicaciones.add(publicacion);
        this.notifyObserver(publicacion);
    }

    @Override
    public void attach(IUsuario usuario) {
        users.add(usuario);
    }

    @Override
    public void deattach(IUsuario usuario) {
        users.remove(usuario);
    }

    @Override
    public void notifyObserver(Publicacion publicacion) {
        for (IUsuario usuario: users) {
            if (usuario.getTipo().equals(publicacion.getTipo())){
                usuario.update("NuevaPublicacion: "+publicacion.getTipo(),publicacion);
            }else if(usuario.getTipo().equals("Cualquiera")){
                usuario.update("NuevaPublicacion: "+publicacion.getTipo(),publicacion);
            }

        }
    }
}