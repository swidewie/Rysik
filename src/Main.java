public class Main {
    public static void main (String[] args){
        Pet pet1 = new Pet("Star", "bunny", 3);
        Pet pet2 = new Pet("Candy", "puppy", 2);
        Pet pet3 = new Pet("Dori", "cat", 4);

        System.out.println(pet1.toString());
        System.out.println(pet2.toString());
        System.out.println(pet3.toString());

        if (pet1.getAge() > pet3.getAge()) {
            System.out.println(pet1.getName() + " is older than " + pet2.getName());
        } else {
            System.out.println(pet3.getName() + " is older than " + pet1.getName());
        }


        Adopter adopter1 = new Adopter("Zhanna", 25, "+77776578782");
        Adopter adopter2 = new Adopter("Mike", 35, "+77054578789");
        Shelter shelter1 = new Shelter(103040, "Happy Pet", "Astana, Mangilik el 26");
        Shelter shelter2 = new Shelter(113245, "Pet Finder", "Almaty, Abai 33A");

        System.out.println(adopter1.toString());
        System.out.println(adopter2.toString());
        System.out.println(shelter1.toString());
        System.out.println(shelter2.toString());
        }
}

