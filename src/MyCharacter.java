import java.util.Scanner;

public class MyCharacter {
    // Podstawowe atrybuty dla postaci
    String profession;
    String userName;
    int level;
    final int maxLevel = 300;
    int experience;
    int requiredExperience;
    int gold;

    MyCharacter() {
        // Ustawienie podstawowych wartości dla każdego atrybutu postaci
        level = 1;
        experience = 0;
        gold = 0;

        Scanner scanner = new Scanner(System.in);
        boolean isCorrectUserName = true;
        boolean isCorrectProfession = true;

        // Utawianie userName przez użytkownika
        while (isCorrectUserName) {
            System.out.print("Podaj swój nick: ");
            userName = scanner.nextLine();

            if (userName.length() < 5) {
                System.out.println("Nazwa użytkownika nie może być krótsza niż 5 znaków!");
                System.out.println();
            } else if (userName.length() > 12) {
                System.out.println("Nazwa użytkownika nie może być dłuższa niż 12 znaków!");
                System.out.println();
            } else {
                System.out.println("Twoja nazwa użytkownika: " + userName);
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
                profession = "Wojownik";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 2) {
                profession = "Paladyn";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 3) {
                profession = "Zwiadowca";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 4) {
                profession = "Mag";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else {
                System.out.println("Wybierz odpowiednią profesję!");
                System.out.println();
                System.out.println();
            }
        }
    }

    boolean isEnaughExperienceToLevelUp() {
        return experience >= requiredExperience; // Sprawdzamy czy exp >= reqExp | Jeśli tak = zwraca true | Jeśli nie = zwraca false
    }

    // Sprawdzenie czy gracz może awansować na wyższy poziom, jeśli tak to level zwiększa się +1
    void checkLevelUp() {
        if (isEnaughExperienceToLevelUp() && level < maxLevel) {
            experience -= requiredExperience;
            level++;
            requiredExperience = (requiredExperience * 5) / 4;
        }
    }

    void getBasicInformation() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nazwa użytkownika: " + userName);
        System.out.println("Profesja: " + profession);
        System.out.println("Poziom: " + level);
        System.out.println("Doświadczenie: " + experience);
        System.out.println("Złoto: " + gold);
        System.out.println("-----------------------------------------------------------");
    }
}
