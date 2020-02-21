package hw04;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human Mother;
    Human Father;


   public Human(){


   }

   public Human(String name,String surname,int year,int iq,Human Mother,Human Father,Pet pet){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.Mother=Mother;
        this.Father=Father;
        this.pet=pet;

    }
    public Human(String name,String surname,int year){
       this.name=name;
       this.surname=surname;
       this.year=year;
    }

    public String greetPet(){return
      String.format("Hello"+Pet.nickname);
    }
 public String describePet(){return
        String.format("I have a "+Pet.species+" he is "+Pet.age+" years old "+"his tricklevel is "+Pet.trickLevel);

    }

    public String show(){
        return String.format(name+" "+surname);


    }


}





