package animales;

public class Vaca extends Animal implements Habitat{

    public Vaca(int edad, String nombre) {
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
