package hw09;

public abstract class Man extends Human {
    @Override
    public String greetPet() {
        return String.format("How are you doing,%s?", pet.getNickname());
    }

    public abstract void repairCar();

}
