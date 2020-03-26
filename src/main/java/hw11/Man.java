package hw11;

import hw09.Human;

public abstract class Man extends Human {
    @Override
    public String greetPet() {
        return String.format("How are you doing,%s?", pet.getNickname());
    }

    public abstract void repairCar();

}
