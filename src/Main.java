import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

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

        System.out.print("Adopter name: ");
        scanner.nextLine();
        String adopterName = scanner.nextLine();
        System.out.print("Phone number: ");
        String adopterPhoneNumber = scanner.nextLine();
        System.out.print("age: ");
        int adopterAge = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Shelter Name: ");
        String shelterName = scanner.nextLine();
        System.out.print("Location: ");
        String shelterLocation = scanner.nextLine();
        System.out.print("id: ");
        int shelterId = scanner.nextInt();

        Pet pet1 = new Pet(petName, petSpecies, petAge);
        System.out.println(pet1.toString());
        Pet pet2 = new Pet(petName2, petSpecies2, petAge2);
        System.out.println(pet2.toString());
        Adopter adopter = new Adopter(adopterName, adopterAge, adopterPhoneNumber);
        System.out.println(adopter.toString());
        Shelter shelter = new Shelter(shelterId, shelterName, shelterLocation);
        System.out.println(shelter.toString());

        if(petAge > petAge2){
            System.out.println(pet1.getName()+" is older than " + pet2.getName());
        } else{
            System.out.println(pet2 + " is older than " + pet1);
        }
    }
}

