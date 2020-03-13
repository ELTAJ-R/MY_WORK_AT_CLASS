package hw09;


import java.util.*;
import java.util.stream.Collectors;

public class FamilyService {

    CollectionFamilyDAO dao = new CollectionFamilyDAO();


    public Collection<Family> getAll() {
        return dao.getAll();
    }

    public Family create(Human mother, Human father) {
        Family new_created = new Family();
        new_created.setFather(father);
        new_created.setMother(mother);
        return new_created;
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

    public void displayAllFamilies() {
        dao.getAll().forEach(System.out::println);
    }

    public void getFamiliesBiggerThan(int sizeOfFamily) {
        List<Family> storage = new ArrayList<>();
        for (Family family : dao.getAll()) {
            if (family.countFamily() > sizeOfFamily) {
                storage.add(family);
            }
        }
        storage.forEach(System.out::println);
    }

    public void getFamiliesSmallerThan(int sizeOfFamily) {
        List<Family> storage = new ArrayList<>();
        for (Family family : dao.getAll()) {
            if (family.countFamily() < sizeOfFamily) {
                storage.add(family);
            }
        }
        storage.forEach(System.out::println);
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
        return getAll().stream().filter(a -> a.countFamily() == sizeOfFam).collect(Collectors.toList()).size();
    }

}

