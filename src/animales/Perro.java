package animales;

public class Perro extends Animal implements Habitat{
    public Perro(int edad, String nombre) {
        super(edad, nombre);
    }
    @Override
    public void Duermen(){
        System.out.println("Duermen acostado");
    }
    @Override
    public void Reproducen(){
        System.out.println("Reproducen reproduciendose");
    }
    @Override
    public void Juegan(){
        System.out.println("Juegan jugando");
    }
}
