package tugas;

enum orange {
    leoky;
}

public class charB {

    public void charB_player() {
        System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");

        for (orange a : orange.values()) {
            System.out.println(a);
        }

        System.out.println(">1.Possessed by Paijo(atk:30 / heal:20 / mana:-30)   <");
        System.out.println(">2.Awakened Leo      (atk:50 / health:-20 / mana:-10)<");
        System.out.println(">3.Playing H&G       (atk:40 /mana:-20)              <");
        System.out.println(">4.Silent            (mana:+30)                      <");
        System.out.println("");
        System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void charB_enemy() {
        System.out.println("\t\t\t\t\t >>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");

        for (orange a : orange.values()) {
            System.out.println(a);
        }

        System.out.println("\t\t\t\t\t>1.Possessed by paijo(atk:30 / heal:20 / mana:-30)   <");
        System.out.println("\t\t\t\t\t>2.Awakened Leo      (atk:50 / health:-20 / mana:-10)<");
        System.out.println("\t\t\t\t\t>3.Playing H&G       (atk:40 /mana:-20)              <");
        System.out.println("\t\t\t\t\t>4.Silent            (mana:+30)                      <");
        System.out.println("");
        System.out.println("\t\t\t\t\t >>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
