import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
    }


    // Utawianie userName przez użytkownika
    private static String createUserName() {
        while (true) {
            System.out.print("Podaj swój nick: ");
            String userName = scanner.nextLine();

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
                return userName;
            }
        }
    }

    // Wybieranie profesji przez użytkownika
    private static String createProfession() {
        String profession;

        while (true) {
            System.out.println("Dostępne profesje: [1] Wojownik || [2] Paladyn || [3] Zwiadowca || [4] Mag");
            System.out.print("Wybierz profesję postaci: ");
            int chooseProfession = scanner.nextInt();

            if (chooseProfession == 1) {
                profession = "Wojownik";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                return profession;
            } else if (chooseProfession == 2) {
                profession = "Paladyn";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                return profession;
            } else if (chooseProfession == 3) {
                profession = "Zwiadowca";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                return profession;
            } else if (chooseProfession == 4) {
                profession = "Mag";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                return profession;
            } else {
                System.out.println("Wybierz odpowiednią profesję!");
                System.out.println();
                System.out.println();
            }
        }
    }

    private static void getBasicInformation(MyCharacter myCharacter) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nazwa użytkownika: " + myCharacter.getUserName());
        System.out.println("Profesja: " + myCharacter.getProfession());
        System.out.println("Poziom: " + myCharacter.getLevel());
        System.out.println("Doświadczenie: " + myCharacter.getExperience());
        System.out.println("Złoto: " + myCharacter.getGold());
        System.out.println("-----------------------------------------------------------");
    }

//    private static boolean fight(MyCharacter myCharacter, Monster monster) {
//        while (myCharacter.getHealthPoints <= 0 || monster.getHealthPoints() <= 0) {
//            if (myCharacter.getHealthPoints > 0 && monster.getHealthPoints() > 0) {
//                monster.setHealthPoints(monster.getHealthPoints() - myCharacter.getDamage());
//                myCharacter.setHealthPoints(myCharacter.getHealthPoints - monster.getDamage());
//            } else if (myCharacter.getHealthPoints <= 0 && monster.getHealthPoints() > 0) {
//                System.out.println("Walkę wygrał: " + monster.getName());
//                return false;
//            } else if (monster.getHealthPoints() <= 0 && myCharacter.getHealthPoits > 0) {
//                System.out.println("Walkę wygrał: " + myCharacter.getUserName());
//                return true;
//            }
//        }
//    }
}
