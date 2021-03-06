package hw10;


import hw09.Pet;
import hw11.Human;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CollectionFamilyDAO implements DAO<Family, Human> {


    private List<Family> data = new ArrayList<>();

    @Override
    public Optional<Family> get(int index) {
        if (index >= 0 && index < data.size()) return Optional.of(data.get(index));
        else return Optional.empty();

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





