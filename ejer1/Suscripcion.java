package ejer1;

public class Suscripcion implements IUsuario{

    private Account account;
    private String suscripcion;

    public Suscripcion(Account cuenta, String suscripcion) {
        this.account = cuenta;
        this.suscripcion = suscripcion;
    }

    @Override
    public void update(String message, Publicacion publicacion) {
        account.showInfo();
        System.out.println(message);
        System.out.println(publicacion.getDescripcion());
    }
    @Override
    public String getTipo() {
        return this.suscripcion;
    }
}