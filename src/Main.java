//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import animales.Animal;
import animales.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(10, "Pedro");
        Animal gatoUno = new Gato(13, "Miaus");
        Animal perroUno = new Perro(14, "Guaus");
        Animal vacaUno = new Vaca(15, "Muuus");

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(animal);
        animales.add(gatoUno);
        animales.add(perroUno);
        animales.add(vacaUno);

        for (Animal a : animales) {
            System.out.println(a.getNombre());
            a.comer(2);
            //a.comer();
        }
    }
}