package ejer1;

public class Account {
    private String nombre;
    private int id;
    private String fechaDeNacimiento;

    public Account(String nombre, int id,String fechaDeNacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.fechaDeNacimiento=fechaDeNacimiento;
    }

    public void showInfo(){
        System.out.println("Datos :"+ fechaDeNacimiento);
        System.out.println("Cuenta:"+nombre);
        System.out.println("ID:"+ id);
    }
}

