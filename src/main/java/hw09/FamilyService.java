package hw09;

import java.util.*;

public class FamilyService  {


    CollectionFamilyDAO access=new CollectionFamilyDAO();


    public Optional<Family> get(int index) {
        return Optional.empty();
    }


    public Collection<Family> getAll() {
        return access.getAll();
    }


    public Family create(Human mother,Human father) {
        Family new_created=new Family();
        new_created.setFather(father);
        new_created.setMother(mother);
        return new_created;

    }


    public boolean saveFamily(Family obj) {
        return access.saveFamily(obj);
    }


    public boolean delete(Family obj) {
        return access.delete(obj);
    }


    public boolean delete(int index) {
        return access.delete(index);
    }
    public void displayAllFamilies(){
        access.getAll().forEach(System.out::println);
    }
    public void getFamiliesBiggerThan(int sizeOfFamily){
        List<Family>storage=new ArrayList<>();
        for(Family family:access.getAll()){
            if(family.countFamily()>sizeOfFamily){
                storage.add(family);
            }
        }
        storage.forEach(System.out::println);
    }
    public void getFamiliesSmallerThan(int sizeOfFamily){
        List<Family>storage=new ArrayList<>();
        for(Family family:access.getAll()){
            if(family.countFamily()<sizeOfFamily){
                storage.add(family);
            }
        }
        storage.forEach(System.out::println);
    }

    public void bornChild(Family before,String Tom,String Jane){
        Human ch=new Human();
        int random=(int)(Math.random()*2+1);
        switch (random){
            case 1:
                ch.setName(Tom);
            case 2:
                ch.setName(Jane);
        }
       before.addChild(ch);
        access.update(before);

    }
}
