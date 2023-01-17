public class Monster {
    // Podstawowe atrybuty dla każdego potwora
    String name;
    int level;
    int healthPoints;
    int damage;
    int exp;

    // Konstruktor, który umożliwia szybkie nadawanie wartości podstawowym atrybutom potwora
    Monster(String name, int level, int healthPoints, int damage, int exp) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.exp = exp;
    }
}
