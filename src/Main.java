import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MyCharacter person = new MyCharacter();

        person.userName = createUserName();
        person.profession = createProfession();
    }


    // Utawianie userName przez użytkownika
    private static String createUserName () {
        String userName = scanner.nextLine();
        boolean isCorrectUserName = true;

        while (isCorrectUserName) {
            System.out.print("Podaj swój nick: ");

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
                isCorrectUserName = false;
            }
        } return userName;
    }

    // Wybieranie profesji przez użytkownika
    private static String createProfession() {
        boolean isCorrectProfession = true;
        String profession = "";

        while (isCorrectProfession) {
            System.out.println("Dostępne profesje: [1] Wojownik || [2] Paladyn || [3] Zwiadowca || [4] Mag");
            System.out.print("Wybierz profesję postaci: ");
            int chooseProfession = scanner.nextInt();

            if (chooseProfession == 1) {
                profession = "Wojownik";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 2) {
                profession = "Paladyn";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 3) {
                profession = "Zwiadowca";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 4) {
                profession = "Mag";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else {
                System.out.println("Wybierz odpowiednią profesję!");
                System.out.println();
                System.out.println();
            }
        } return profession;
    }
}
