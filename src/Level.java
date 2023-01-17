import java.util.ArrayList;
import java.util.List;

public class Level {

    int level;
    int experience;
    int requiredExperience;

    boolean checkRequiredExperience() {
        return experience >= requiredExperience; // Sprawdzamy czy exp >= reqExp | Jeśli tak = zwraca true | Jeśli nie = zwraca false
    }

    void levelUp() {
        if (checkRequiredExperience()) {
            experience -= requiredExperience;
            level++;
        }
    }

}
