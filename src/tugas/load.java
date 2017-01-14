package tugas;

import java.io.*;
import java.util.*;

public class load extends darah {

    private Scanner x;

    public void openfile() {
        try {
            x = new Scanner(new File("savetext.txt"));
        } catch (Exception e) {
            System.out.println("could not find file");
        }
    }

    public void readingfile() {
        while (x.hasNext()) {
            pbattle = x.nextInt();
            ebattle = x.nextInt();
            phealth = x.nextInt();
            pmana = x.nextInt();
            ehealth = x.nextInt();
            emana = x.nextInt();
            round = x.nextInt();
        }
    }

    public void closefile() {
        x.close();
    }
}
