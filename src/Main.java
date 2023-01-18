import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MyCharacter person1 = new MyCharacter();
//        person1.getBasicInformation();
//
//        Random damage = new Random();
//        Random healthPoints = new Random();
//        Random exp = new Random();
//
//        Monster monster1 = new Monster("monster", 1, healthPoints.nextInt(25, 30), damage.nextInt(1, 3), exp.nextInt(3, 5));
//        monster1.getBasicInformation();


        MyCharacter person = new MyCharacter();


        Scanner scanner = new Scanner(System.in);
        boolean isCorrectUserName = true;
        boolean isCorrectProfession = true;

        // Utawianie userName przez użytkownika
        while (isCorrectUserName) {
            System.out.print("Podaj swój nick: ");
            person.userName = scanner.nextLine();

            if (person.userName.length() < 5) {
                System.out.println("Nazwa użytkownika nie może być krótsza niż 5 znaków!");
                System.out.println();
            } else if (person.userName.length() > 12) {
                System.out.println("Nazwa użytkownika nie może być dłuższa niż 12 znaków!");
                System.out.println();
            } else {
                System.out.println("Twoja nazwa użytkownika: " + person.userName);
                System.out.println();
                System.out.println();
                isCorrectUserName = false;
            }
        }





        // Wybieranie profesji przez użytkownika
        while (isCorrectProfession) {
            System.out.println("Dostępne profesje: [1] Wojownik || [2] Paladyn || [3] Zwiadowca || [4] Mag");
            System.out.print("Wybierz profesję postaci: ");
            int chooseProfession = scanner.nextInt();

            if (chooseProfession == 1) {
                person.profession = "Wojownik";
                System.out.println("Wybrałeś profesję: " + person.profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 2) {
                person.profession = "Paladyn";
                System.out.println("Wybrałeś profesję: " + person.profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 3) {
                person.profession = "Zwiadowca";
                System.out.println("Wybrałeś profesję: " + person.profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 4) {
                person.profession = "Mag";
                System.out.println("Wybrałeś profesję: " + person.profession);
                System.out.println();
                isCorrectProfession = false;
            } else {
                System.out.println("Wybierz odpowiednią profesję!");
                System.out.println();
                System.out.println();
            }
        }



    }
}