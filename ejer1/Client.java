package ejer1;

public class Client {
    public static void main (String []args){
        PaginaFB paginaWeb = new PaginaFB();

        Suscripcion user1= new Suscripcion(new Account("Onichan",1111111,"6/5/2000"),"Video");
        Suscripcion user2= new Suscripcion(new Account("Maria",3333333,"20/11/2000"),"Video");
        Suscripcion user3= new Suscripcion(new Account("NIcolsa",2222222,"18/11/2000"),"Cualquiera");
        Suscripcion user4= new Suscripcion(new Account("Tilin",3333332,"4/7/2000"),"Video");
        Suscripcion user5= new Suscripcion(new Account("Senpai",6666666,"23/8/2000"),"Cualquiera");

        paginaWeb.attach(user1);
        paginaWeb.attach(user2);
        paginaWeb.attach(user3);
        paginaWeb.attach(user4);
        paginaWeb.attach(user5);

        paginaWeb.anadirPublicacion(new Publicacion("Foto","EN Esloveimma"));
        paginaWeb.anadirPublicacion(new Publicacion("Foto","En casita"));
        paginaWeb.anadirPublicacion(new Publicacion("Video","Con el tio"));
        paginaWeb.anadirPublicacion(new Publicacion("Video","Con el primo"));
        paginaWeb.anadirPublicacion(new Publicacion("Foto","checoslovakia"));
    }
}
