import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.print("Pet name: ");
        String petName = scanner.nextLine();
        System.out.print("Species: ");
        String petSpecies = scanner.nextLine();
        System.out.print("age: ");
        int petAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Pet name2: ");
        String petName2 = scanner.nextLine();
        System.out.print("Species2: ");
        String petSpecies2 = scanner.nextLine();
        System.out.print("Age2: ");
        int petAge2 = scanner.nextInt();
        scanner.nextLine();

        Pet pet1 = new Pet(petName, petSpecies, petAge);
        pets.add(pet1);
        System.out.println(pet1);
        Pet pet2 = new Pet(petName2, petSpecies2, petAge2);
        pets.add(pet2);
        System.out.println(pet2);

        System.out.print("Adopter name: ");
        String adopterName = scanner.nextLine();
        System.out.print("Phone number: ");
        String adopterPhoneNumber = scanner.nextLine();
        System.out.print("age: ");
        int adopterAge = scanner.nextInt();
        scanner.nextLine();

        Adopter adopter = new Adopter(adopterName, adopterAge, adopterPhoneNumber);
        adopter.showInfo();

        System.out.print("Shelter Name: ");
        String shelterName = scanner.nextLine();
        System.out.print("Location: ");
        String shelterLocation = scanner.nextLine();
        System.out.print("id: ");
        int shelterId = scanner.nextInt();

        Shelter shelter = new Shelter(shelterId, shelterName, shelterLocation);
        System.out.println(shelter);

        System.out.println("Pets older that 3: ");
        for(Pet p: pets) {
            if(p.getAge() > 3){
                System.out.println(p.getName());
            }
        }

        scanner.nextLine();
        System.out.println("Search pet my name: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Pet p : pets) {
            if (p.getName().equals(searchName)) {
                System.out.println("Found: " + p.getName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Pet not found.");
        }

        for(int i=0; i<pets.size()-1; i++){
            int age1 = pets.get(i).getAge();
            int age2 = pets.get(i+1).getAge();

            if(age1>age2){
                Pet temp = pets.get(i);
                pets.set(i, pets.get(i + 1));
                pets.set(i + 1, temp);
            }
        }
        System.out.println("Pets sorted by age:");
        for (Pet p : pets) {
            System.out.println(p.getName());
        }
    }
}

