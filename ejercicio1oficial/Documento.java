package ejercicio1oficial;

public class Documento {
    private String doc;

    public Documento(String doc) {
        this.doc = doc;
    }

    public String getDoc() {
        return doc;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void showInfo(){
        System.out.println("Documento: "+ doc);
    }
}
