public class MyCharacter {
    // Podstawowe atrybuty i ich domyślne wartości przydzielane ----> postaci
    private final String userName;
    private final String profession;
    private final int maxLevel = 300;
    private int level = 1;
    private int experience = 0;
    private int requiredExperience = 10;
    private int gold = 0;

    MyCharacter(String userName, String profession) {
        this.userName = userName;
        this.profession = profession;

    }

    public String getUserName() {
        return userName;
    }

    public String getProfession() {
        return profession;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level <= 0) {
            this.level = level;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            this.experience = experience;
        }
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        if (gold < 0) {
            this.gold = gold;
        }
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

    public void getBasicInformation() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nazwa użytkownika: " + userName);
        System.out.println("Profesja: " + profession);
        System.out.println("Poziom: " + level);
        System.out.println("Doświadczenie: " + experience);
        System.out.println("Złoto: " + gold);
        System.out.println("-----------------------------------------------------------");
    }
}