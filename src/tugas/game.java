package tugas;

import java.util.Scanner;

class game {

    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        int option1 = 0, tryerror;
        String soption;

        single s = new single();
        credit c = new credit();
        multi m = new multi();
        do {
            try {
                tryerror = 1;
                System.out.println("");
                Thread.sleep(2000);
                System.out.println("\t\t             PLAYSTATION JAVA.        ");
                Thread.sleep(1000);
                System.out.print("\n\t\t\t        LOADING");
                Thread.sleep(1000);
                for (int i = 0; i < 5; i++) {
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                System.out.println("\n");
                System.out.println("===================================================================================================================================");
                System.out.println("\n");
                Thread.sleep(1000);
                System.out.println("\t\t ++++++++++++++++++++++++++++++++++++");
                System.out.println("\t\t +------ STUDENT RUMBLE ARENA ------+ ");
                System.out.println("\t\t ++++++++++++++++++++++++++++++++++++");
                Thread.sleep(2000);
                System.out.println("");
                System.out.println("Main menu  ");
                Thread.sleep(500);
                System.out.println("1. Single Player");
                Thread.sleep(500);
                System.out.println("2. Multiplayer");
                Thread.sleep(500);
                System.out.println("3. credit ");
                Thread.sleep(500);
                System.out.println("4. Exit");
                Thread.sleep(500);
                System.out.print("Option  : ");
                soption = nilai.next();
                option1 = Integer.parseInt(soption);
                if (option1 == 1) {
                    s.singleplayer();
                }
                if (option1 == 2) {
                    m.multiplayer();
                }
                if (option1 == 3) {
                    c.credit();
                }
                if (option1 == 4) {
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("error :" + e);
                tryerror = 0;
            }
        } while (tryerror == 0 || option1 > 0);

    }
}
