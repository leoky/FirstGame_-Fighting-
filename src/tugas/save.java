package tugas;
import java.util.*;

public class save {

    private Formatter x;

    public void openfile() {
        try {
            x = new Formatter("savetext.txt");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        } 
    }
    public void addrecord(int player, int enemy, int ph,int pm , int ep , int em, int round,String player1,String player2) {
        x.format("%d %d %d %d %d %d %d %s %s", player,enemy,ph,pm,ep,em,round,player1,player2);
    }
    public void closefile() {
        x.close();
    }

   
}
