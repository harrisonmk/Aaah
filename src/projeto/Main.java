package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a;
        String b;

        a = scan.next();
        b = scan.next();

        String letraA = a.toLowerCase();
        String letraB = b.toLowerCase();

        int totala = 0;

        for (int i = 0; i < letraA.length(); i++) {
            if (letraA.charAt(i) == 'a') {
                totala = totala + 1;

            }
        }

        int totalb = 0;

        for (int i = 0; i < letraB.length(); i++) {
            if (letraB.charAt(i) == 'a') {
                totalb = totalb + 1;
            }
        }

        if (totala >= totalb) {
            System.out.println("go");
        } else if (totala <= totalb) {
            System.out.println("no");
        }

    }

}
