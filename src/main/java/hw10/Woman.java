package hw10;

import hw09.Human;

public abstract class Woman extends Human {
    @Override
    public String greetPet() {
        return String.format("This is my pet-%s", pet.getNickname());
    }

    public abstract void makeUp();
}

