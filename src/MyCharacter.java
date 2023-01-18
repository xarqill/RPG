import java.util.Scanner;

public class MyCharacter {
    // Podstawowe atrybuty i ich domyślne wartości przydzielane ----> postaci
    String profession;
    String userName;
    int level = 1;
    final int maxLevel = 300;
    int experience = 0;
    int requiredExperience = 10;
    int gold = 0;

    MyCharacter(String userName, String profession) {


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
