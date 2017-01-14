package tugas;
import java.util.Scanner;

public class credit {

    Scanner input = new Scanner(System.in);
    String tryerror;

    public void credit() {
        do {
            try {
                System.out.println("\t\t\t   ------ STUDENT RUMBLE ARENA ------ \n");

                Thread.sleep(1000);
                System.out.println("\t\t\t   Developed by Leotamjos production \n");
                Thread.sleep(1000);
                System.out.println("\t\t\t\t       16IS01\n");
                Thread.sleep(1000);
                System.out.println("\t\t\t     -> Josephlim   (00000023133)");
                Thread.sleep(1000);
                System.out.println("\t\t\t     -> Leonardy. K (00000023091)");
                Thread.sleep(1000);
                System.out.println("\t\t\t     -> Tamara      (00000028459)\n\n\n");
                Thread.sleep(1000);
                System.out.println("\t\t\t\t THANKS FOR PLAYING\n");
                System.out.println("\t\t\t     Input anything back to menu :");
                tryerror = input.next();
            } catch (Exception e) {
                System.out.println("Error : " + e);
                tryerror = null;
            }
        } while (tryerror == null);

    }

}
