package tugas;

enum grape {
    Tamara;
}

public class charC {

    public void charC_player() {
        System.out.println(" >>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<< ");

        for (grape a : grape.values()) {
            System.out.println(a);
        }

        System.out.println(">1.Lipstik    (atk:30 / mana:-30)      <");
        System.out.println(">2.Eat bontot (atk mana:30 / mana:-10) <");
        System.out.println(">3.Eat & Eat  (heal:40  / mana:-20)    <");
        System.out.println(">4.Teasing    (mana:+30)               <");
        System.out.println("");
        System.out.println(" >>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
    }

    public void charC_enemy() {
        System.out.println("\t\t\t\t\t >>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        for (grape a : grape.values()) {
            System.out.println(a);
        }

        System.out.println("\t\t\t\t\t>1.Lipstik    (atk:30 / mana:-30)      <");
        System.out.println("\t\t\t\t\t>2.Eat bontot (atk mana:30 / mana:-10) <");
        System.out.println("\t\t\t\t\t>3.Eat & Eat  (heal:40  / mana:-20)    <");
        System.out.println("\t\t\t\t\t>4.Teasing    (mana:+30)               <");
        System.out.println("");
        System.out.println("\t\t\t\t\t >>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
    }
}
