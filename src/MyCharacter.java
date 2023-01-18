public class MyCharacter extends LivingEntity {
    // Podstawowe atrybuty i ich domyślne wartości przydzielane ----> postaci
    private final String profession;
    private final int maxLevel = 300;
    private int requiredExperience = 10;

    public MyCharacter(String name, int level, int experience, int gold, int healthPoints, int damage, String profession) {
        super(name, level, experience, gold, healthPoints, damage);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public boolean isEnaughExperienceToLevelUp() {
        return getExperience() >= requiredExperience; // Sprawdzamy czy exp >= reqExp | Jeśli tak = zwraca true | Jeśli nie = zwraca false
    }

    // Sprawdzenie czy gracz może awansować na wyższy poziom, jeśli tak to level zwiększa się +1
    public void checkLevelUp() {
        if (isEnaughExperienceToLevelUp() && getLevel() < maxLevel) {
            setExperience(getExperience() - requiredExperience);
            setLevel(getLevel() + 1);
            requiredExperience = (requiredExperience * 5) / 4;
        }
    }
}