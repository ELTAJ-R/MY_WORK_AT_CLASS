package hw10;


import hw09.Human;
import hw09.Pet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FamilyService {

    CollectionFamilyDAO dao = new CollectionFamilyDAO();


    public Collection<Family> getAll() {
        return dao.getAll();
    }

    public void create(Human mother, Human father) {
        dao.create(mother,father);
    }

    public boolean saveFamily(Family obj) {
        return dao.save(obj);
    }


    public boolean delete(Family obj) {
        return dao.delete(obj);
    }


    public boolean delete(int index) {
        return dao.delete(index);
    }

    public Collection<Family> displayAllFamilies() {
      return dao.getAll();
    }

    public List<Family> getFamiliesBiggerThan(int sizeOfFamily) {
        List<Family> storage = new ArrayList<>();
        for (Family family : dao.getAll()) {
            if (family.countFamily() > sizeOfFamily) {
                storage.add(family);
            }
        }
        return storage;
    }

    public List<Family> getFamiliesSmallerThan(int sizeOfFamily) {
        List<Family> storage = new ArrayList<>();
        for (Family family : dao.getAll()) {
            if (family.countFamily() < sizeOfFamily) {
                storage.add(family);
            }
        }
       return storage;
    }

    public void bornChild(Family before, String Tom, String Jane) {
        Human ch = new Human();
        int random = (int) (Math.random() * 2 + 1);
        switch (random) {
            case 1:
                ch.setName(Tom);
            case 2:
                ch.setName(Jane);
        }
        ch.setYear(0);
        dao.modify(before, ch);
    }

    public void adoptChild(Family family, Human child) {
        dao.modify(family, child);
    }

    public void deleteChildrenOlderThan(int ageLimit) {
        dao.getAll().forEach(f -> f.children.removeIf(p -> p.getYear() > ageLimit));
    }

    public int count() {
        return dao.count();
    }

    public Optional<Family> getFamilyByIndex(int index) {
        return dao.get(index);
    }

    public List<Pet> getPets(int familyIndex) {
        return dao.getPets(familyIndex);
    }

    public void addPet(int index, Pet pet) {
        dao.addPet(index, pet);
    }

    public void deleteFamilyByIndex(int index) {
        dao.delete(index);
    }

    public int countFamiliesWithMemberNumber(int sizeOfFam) {
        return (int) getAll().stream().filter(a -> a.countFamily() == sizeOfFam).count();
    }

}

