public class MyCharacter extends LivingEntity {
    // Podstawowe atrybuty i ich domyślne wartości przydzielane ----> postaci
    private final String profession;
    private final int maxLevel = 300;
    private int requiredExperience = 10;

    public MyCharacter(String profession) {
        this.profession = profession;

    }

    public String getProfession() {
        return profession;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        if (level <= 0) {
            this.level = level;
        }
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public boolean isEnaughExperienceToLevelUp() {
        return experience >= requiredExperience; // Sprawdzamy czy exp >= reqExp | Jeśli tak = zwraca true | Jeśli nie = zwraca false
    }

    // Sprawdzenie czy gracz może awansować na wyższy poziom, jeśli tak to level zwiększa się +1
    public void checkLevelUp() {
        if (isEnaughExperienceToLevelUp() && level < maxLevel) {
            experience -= requiredExperience;
            level++;
            requiredExperience = (requiredExperience * 5) / 4;
        }
    }
}