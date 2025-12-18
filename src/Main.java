import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pet name: ");
        String petName = scanner.nextLine();
        System.out.print("Species: ");
        String petSpecies = scanner.nextLine();
        System.out.print("Age: ");
        int petAge = scanner.nextInt();


        System.out.print("Adopter name: ");
        scanner.nextLine();
        String adopterName = scanner.nextLine();
        System.out.print("Phone number: ");
        String adopterPhoneNumber = scanner.nextLine();
        System.out.print("age: ");
        int adopterAge = scanner.nextInt();


        scanner.nextLine();
        System.out.print("Shelter Name: ");
        String shelterName = scanner.nextLine();
        System.out.print("Location: ");
        String shelterLocation = scanner.nextLine();
        System.out.print("id: ");
        int shelterId = scanner.nextInt();


        Pet pet1 = new Pet(petName, petSpecies, petAge);
        System.out.println(pet1.toString());
        Adopter adopter = new Adopter(adopterName, adopterAge, adopterPhoneNumber);
        System.out.println(adopter.toString());
        Shelter shelter = new Shelter(shelterId, shelterName, shelterLocation);
        System.out.println(shelter.toString());
        }
}

