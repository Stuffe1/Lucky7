import java.util.Random;
import java.util.Scanner;

public class lucky7 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Anna aloitusrahasi: ");
        int i = sc.nextInt();
        sc.nextLine();

        while (rahat > 0) {
            System.out.println("\nSinulla on " + i + " €");
            System.out.println("Pelikierros alkaa, maksoit 1 €");
            i--; 

            int luku1 = rand.nextInt(10) + 1;
            int luku2 = rand.nextInt(10) + 1;
            int luku3 = rand.nextInt(10) + 1;

            System.out.println("Arvotut luvut: " + luku1 + ", " + luku2 + ", " + luku3);

            int seiskoja = 0;
            if (luku1 == 7) seiskoja++;
            if (luku2 == 7) seiskoja++;
            if (luku3 == 7) seiskoja++;

            if (seiskoja == 1) {
                i += 3;
                System.out.println("Yksi seiska! Voitit 3 €");
            } else if (seiskoja == 2) {
                i += 5;
                System.out.println("Kaksi seiskaa! Voitit 5 €");
            } else if (seiskoja == 3) {
                i += 10;
                System.out.println("Kolme seiskaa! Jättipotti, voitit 10 €!");
            } else {
                System.out.println("Ei seiskoja, ei voittoa.");
            }


            if (i > 0) {
                System.out.print("Haluatko pelata uudestaan? Jos haluat pelata paina Enter. Jos et halua pelata kirjoita e ja paina Enter: ");
                String vastaus = sc.nextLine();
                if (vastaus.equalsIgnoreCase("e")) {
                    break;
                }
            }
        }

        System.out.println("Peli päättyi. Rahasi: " + rahat + " euroa");
        sc.close();
    }
}
