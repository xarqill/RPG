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
    void getBasicInformation() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nazwa: " + name);
        System.out.println("Poziom: " + level);
        System.out.println("Punkty życia: " + healthPoints);
        System.out.println("Obrażenia: " + damage);
        System.out.println("Exp do zdobycia: " + exp);
        System.out.println("-----------------------------------------------------------");
    }
}
