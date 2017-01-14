package tugas;

enum apple {
    Josephlim;
}

public class charA {

    public void charA_player() {
        System.out.println(" >>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<< ");

        for (apple a : apple.values()) {
            System.out.println(a);
        }

        System.out.println(">1.Grumbling     (atk:50 / mana:-40)   <");
        System.out.println(">2.Sight seeing  (atk:70 / mana:-80)   <");
        System.out.println(">3.Sleep in class(heal:30 / mana:-30)  <");
        System.out.println(">4.Noise         (mana+30)             <");
        System.out.println("");
        System.out.println(" >>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
    }

    public void charA_enemy() {
        System.out.println("\t\t\t\t\t >>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        for (apple a : apple.values()) {
            System.out.println(a);
        }

        System.out.println("\t\t\t\t\t>1.Grumbling       (atk:50 / mana:-40) <");
        System.out.println("\t\t\t\t\t>2.Sight seeing   (atk:70 / mana:-80)  <");
        System.out.println("\t\t\t\t\t>3.Sleep in class (heal:30 / mana:-30) <");
        System.out.println("\t\t\t\t\t>4.Noise          (mana+30)            <");
        System.out.println("");
        System.out.println("\t\t\t\t\t >>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
    }

}
