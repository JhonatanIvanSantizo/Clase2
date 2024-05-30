package animales;

public class Animal {

    private int edad;
    private String nombre;

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("Comer");
    }
    public void comer(int porciones){
        System.out.println("Comer " + porciones + " porciones");
    }
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
