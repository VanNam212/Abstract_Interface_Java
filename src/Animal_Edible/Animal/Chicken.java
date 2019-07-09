package Animal_Edible.Animal;

import Animal_Edible.Edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cuc tac";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
