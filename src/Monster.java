import java.util.Objects;

public class Monster {
    // Podstawowe atrybuty dla każdego potwora
    final private String name;
    private int level;
    private int healthPoints;
    private int damage;
    private int exp;

    // Konstruktor, który umożliwia szybkie nadawanie wartości podstawowym atrybutom potwora
    public Monster(String name, int level, int healthPoints, int damage, int exp) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void getBasicInformation() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nazwa: " + name);
        System.out.println("Poziom: " + level);
        System.out.println("Punkty życia: " + healthPoints);
        System.out.println("Obrażenia: " + damage);
        System.out.println("Exp do zdobycia: " + exp);
        System.out.println("-----------------------------------------------------------");
    }


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", healthPoints=" + healthPoints +
                ", damage=" + damage +
                ", exp=" + exp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Monster monster = (Monster) o;
        return level == monster.level && healthPoints == monster.healthPoints && damage == monster.damage && exp == monster.exp && Objects.equals(name, monster.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, healthPoints, damage, exp);
    }
}
