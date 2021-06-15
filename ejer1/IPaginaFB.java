package ejer1;



public interface IPaginaFB {
    void attach(IUsuario usuario);
    void deattach(IUsuario usuario);
    void notifyObserver(Publicacion publicacion);
}
