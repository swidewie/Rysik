import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Pet pet1 = new Pet("Star", "bunny", 3);
        Pet pet2 = new Pet("Candy", "puppy", 2);
        Pet pet3 = new Pet("Dori", "cat", 4);

        System.out.println(pet1.toString());
        System.out.println(pet2.toString());
        System.out.println(pet3.toString());

        Adopter adopter1 = new Adopter("Zhanar", 25, "+77776578782");
        Adopter adopter2 = new Adopter("Miras", 35, "+77054578789");
        Shelter shelter = new Shelter(103040, "Happy Pet", "Astana, Mangilik el 26");

        System.out.println(adopter1.toString());
        System.out.println(adopter2.toString());
        System.out.println(shelter.toString());

       boolean adopted1 = adopter1.adoptPet(pet1);
        if (adopted1) {
            System.out.println(adopter1.getName() + " adopted " + pet1.getName());
        }
        boolean adopted2 = adopter2.adoptPet(pet3);
        if (adopted2) {
            System.out.println(adopter2.getName() + " adopted " + pet3.getName());
        }



    }
}

