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
