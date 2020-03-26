package hw12;


import hw09.Pet;

import java.util.*;

public class CollectionFamilyDAO implements DAO<Family, Human> {


    private List<Family> data = new ArrayList<>();

    @Override
    public Family get(int index) {
        if (index >= 0 && index < data.size()) return data.get(index);
        else throw new NoSuchElementException();

    }


    @Override
    public Collection<Family> getAll() {
        return data;
    }


    @Override
    public boolean save(Family obj) {
        if (!data.contains(obj)) {
            data.add(data.size(), obj);
            return true;
        } else return false;

    }

    @Override
    public boolean delete(Family obj) {
        if (data.contains(obj)) {
            data.remove(obj);
            return true;
        } else return false;


    }

    @Override
    public boolean delete(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
            return true;
        } else return false;
    }

    @Override
    public void modify(Family family, Human child) {

        data.get(data.indexOf(family)).children.add(child);
    }

    @Override
    public int count() {
        return data.size();
    }

    @Override
    public void create(Human mother, Human father) {
        Family new_created = new Family();
        new_created.setFather(father);
        new_created.setMother(mother);
        data.add(new_created);
    }

    public List<Pet> getPets(int familyIndex) {
        return new ArrayList<>(data.get(familyIndex).pets);

    }

    public void addPet(int index, Pet pet) {
        data.get(index).pets.add(pet);
    }
}





