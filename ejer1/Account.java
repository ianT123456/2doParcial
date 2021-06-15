package ejer1;

public class Account {
    private String nombre;
    private int id;
    private String fNacimiento;

    public Account(String nombre, int id,String fechaDeNacimiento) {
        this.fNacimiento =fechaDeNacimiento;
        this.id = id;
        this.nombre = nombre;
    }

    public void showInfo(){
        System.out.println("Datos :"+ fNacimiento);
        System.out.println("ID:"+ id);
        System.out.println("Cuenta:"+nombre);
    }
}

