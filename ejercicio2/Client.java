package ejercicio2;

public class Client {
    public static void main (String[] args){
        Chat chat= new Chat();
        chat.setNotify("ALL");

        Estudiante estudiante1 = new Estudiante(chat);
        estudiante1.setNombre("BadBUnny");
        estudiante1.setMatricula(222);
        Estudiante estudiante2 = new Estudiante(chat);
        estudiante2.setNombre("Anuel");
        estudiante2.setMatricula(111);

        Docente docente1 = new Docente(chat);
        docente1.setNombre("Kevin");
        docente1.setID(4444444);
        Docente docente2 = new Docente(chat);
        docente2.setNombre("Tilin");
        docente2.setID(2222222);

        Admin administrativo1 = new Admin(chat);
        administrativo1.setNombre("Nicolas");
        administrativo1.setCargo("DIRec");
        Admin administrativo2 = new Admin(chat);
        administrativo2.setNombre("raayan");
        administrativo2.setCargo("Fisioterapeuta");


        chat.anadirCrio(estudiante1);
        chat.anadirCrio(estudiante2);
        chat.anadirCrio(docente1);
        chat.anadirCrio(docente2);
        chat.anadirCrio(administrativo1);
        chat.anadirCrio(administrativo2);

        administrativo1.send("Que pex sudents");

        estudiante1.send("BUenas gente");

        docente1.send("tudo bom?");

        docente2.send("cual es el pex?");

        estudiante2.send("este es el pex babygirl");
    }
}
