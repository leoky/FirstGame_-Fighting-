package tugas;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class single extends darah {

    charA A = new charA();
    charB B = new charB();
    charC C = new charC();
    save save_game = new save();

    String choose, smenu, soption, name1, name2;
    Scanner nilai = new Scanner(System.in);
    Random entry = new Random();
    int boption, option, pbattle = 0, ebattle = 0, round, ulang, uulang = 0, menu, restart, tryerror, ooption;

    public void choose() {
        do {
            try {
                tryerror = 1;
                System.out.print("would you like to choose this character ? if yes (y) if no (n) ");
                choose = nilai.next();
                if (choose.equals("y")) {
                    tryerror = 1;
                }
                if (choose.equals("n")) {
                    tryerror = 1;
                }
                if (!choose.equals("y")) {
                    if (choose.equals("n")) {
                        tryerror = 1;
                    } else {
                        System.out.println("please follow the instruction");
                        tryerror = 0;
                    }
                }
            } catch (Exception e) {
                System.out.println("error : " + e);
                tryerror = 0;
            }
        } while (tryerror == 0);
    }

    public void spell_kurang(int pphealth, int ppmana, int eehealth, int eemana) {
        phealth -= pphealth;
        pmana -= ppmana;
        ehealth -= eehealth;
        emana -= eemana;
    }

    public void spell_tambah(int pphealth, int ppmana, int eehealth, int eemana) {
        phealth += pphealth;
        pmana += ppmana;
        ehealth += eehealth;
        emana += eemana;
    }

    public void status() {
        System.out.println("*************************************************************");
        System.out.println("| Player health : " + phealth + "\t\t\tEnemy health : " + ehealth);
        System.out.println("| Player mana   : " + pmana + "\t\t\tEnemy mana   : " + emana);
        System.out.println("*************************************************************");
        System.out.println("");
    }

    public void bug() {

        if (phealth >= 100) {
            phealth = 100;
        }
        if (phealth <= 0) {
            phealth = 0;
        }
        if (pmana >= 100) {
            pmana = 100;
        }
        if (pmana <= 0) {
            pmana = 0;
        }
        if (ehealth >= 100) {
            ehealth = 100;
        }
        if (ehealth <= 0) {
            ehealth = 0;
        }
        if (emana >= 100) {
            emana = 100;
        }
        if (emana <= 0) {
            emana = 0;
        }

    }

    public void menuoption() {
        do {
            try {
                tryerror = 1;
                System.out.println("\t\t-----------------");
                System.out.println("\t\t* MENU SETTINGS  *");
                System.out.println("\t\t*1. Resume game  *");
                System.out.println("\t\t*2. Restart game *");
                System.out.println("\t\t*3. Go to menu   *");
                System.out.println("\t\t*4. Save gam     *");
                System.out.println("\t\t*5. Load game    *");
                System.out.println("\t\t*6. Quit game    *");
                System.out.print("\t\t*option  : ");
                smenu = nilai.next();
                menu = Integer.parseInt(smenu);
                System.out.println("\t\t-----------------");
                if (menu == 1) {   //resume
                    option = 7;
                }
                if (menu == 2) {   //restart
                    ulang = 1;
                    uulang = 1;
                    restart = 0;
                }
                if (menu == 3) {   //go menu
                    restart = 1;
                    uulang = 1;
                    pbattle = 9;
                    ebattle = 9;
                }
                if (menu == 4) {   // save
                    save_game.openfile();
                    save_game.addrecord(pbattle, ebattle, phealth, pmana, ehealth, emana, round, name1, name2);
                    save_game.closefile();
                    pbattle = 9;
                    ebattle = 9;
                    uulang = 1;
                    restart = 1;
                }
                if (menu == 5) {   //load
                    ulang = 1;
                    uulang = 0;
                    openfile();
                    readingfile();
                    closefile();
                    round--;
                    try {
                        System.out.print("\nLOADING ");
                        Thread.sleep(1000);
                        for (int i = 0; i < 5; i++) {
                            System.out.print(".");
                            Thread.sleep(1000);
                        }
                    } catch (Exception e) {
                        System.out.println("error : " + e);
                    }
                }
                if (menu == 6) {   //quit
                    System.exit(0);
                }
                if (menu > 6) {
                    tryerror = 0;
                }
            } catch (Exception e) {
                System.out.println("Error : " + e);
                tryerror = 0;
            }
        } while (tryerror == 0);
    }

    // untukk load game
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
            name1 = x.next();
            name2 = x.next();
        }
    }

    public void closefile() {
        x.close();
    }

// sampe load 
    public void singleplayer() {
        do {
            try {
                tryerror = 1;
                System.out.println("choose your character  ");
                System.out.println("1. Josephlim ");
                System.out.println("2. Leoky ");
                System.out.println("3. Tamara ");
                System.out.print("yours character : ");
                soption = nilai.next();
                option = Integer.parseInt(soption);
                if (option == 1) {
                    A.charA_player();
                    choose();
                    pbattle = 1;
                }
                if (option == 2) {
                    B.charB_player();
                    choose();
                    pbattle = 2;
                }
                if (option == 3) {
                    C.charC_player();
                    choose();
                    pbattle = 3;
                }
                if (option > 3) {
                    tryerror = 0;
                    choose = "n";
                }
            } catch (Exception e) {
                System.out.println("Error : " + e);
                tryerror = 0;
                choose = "n";
            }
        } while (choose.equals("n") || tryerror == 0);
        System.out.print("Input your name :");
        name1 = nilai.next();
        System.out.println("");

// untuk pemilihan char dari bot        
        boption = entry.nextInt(3);
        if (boption == 0) {
            System.out.println("Bot character :");
            A.charA_player();
            ebattle = 0;
        }
        if (boption == 1) {
            System.out.println("Bot character :");
            B.charB_player();
            ebattle = 1;
        }
        if (boption == 2) {
            System.out.println("Bot character :");
            C.charC_player();
            ebattle = 2;
        }
        System.out.println("");
        name2 = "Bot";
        //battle

        try {
            System.out.print("\nLOADING ");
            Thread.sleep(1000);
            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }
            System.out.println(" \n");
            Thread.sleep(1000);
            System.out.println("\t\tREADYYYY\n");
            Thread.sleep(1000);
            System.out.println("\t\tRUMBLEEEEE");
            Thread.sleep(1000);
            System.out.println(" \n");
        } catch (Exception e) {
            System.out.print("error : " + e);
        }
        do {
            restart = 0;
            phealth = 100;
            pmana = 100;
            ehealth = 100;
            emana = 100;
            round = 1;
            do {
                System.out.println("+++++++++++++++++++++");
                System.out.println("+ROUND : " + round + "          +");
                System.out.println("+++++++++++++++++++++\n");
                status();
                uulang = 0;
                ulang = 0;
                if (pbattle == 1) {     //Plyaer char josep
                    do {
                        try {
                            tryerror = 1;
                            A.charA_player();
                            System.out.println("5. Menu (setting) ");
                            System.out.print("option : ");
                            soption = nilai.next();
                            option = Integer.parseInt(soption);
                            if (option == 1) {    //player spell 1 josep
                                spell_kurang(0, 40, 50, 0);  //ph pm eh em
                                if (pmana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(0, 40, 50, 0);  //ph pm eh em
                                    option = 7;    //utk ulang jika ad kesalahan minus
                                } else {
                                    bug();
                                    status();
                                }

                            }
                            if (option == 2) {   //player spell 2 josep
                                spell_kurang(0, 80, 70, 0);    //ph pm eh em                            
                                if (pmana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(0, 80, 70, 0); //ph pm eh em
                                    option = 7;  //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 3) {    //player spell 3 josep
                                spell_kurang((-30), 30, 0, 0);

                                if (pmana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah((-30), 30, 0, 0);
                                    option = 7;  //utuk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 4) {   //player spell 4 josep
                                spell_tambah(0, 30, 0, 0);
                                bug();
                                status();
                            }

                            if (option == 5) {
                                menuoption();
                            }
                            if (option > 5) {
                                option = 7;
                            }
                            System.out.println("");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: must entry with numeric");
                            tryerror = 0;
                        }
                    } while (option == 7 || tryerror == 0);
                }
                if (pbattle == 2) {     //player leoky char
                    do {
                        try {
                            tryerror = 1;
                            B.charB_player();
                            System.out.println("5. Menu (setting) ");
                            System.out.print("option : ");
                            soption = nilai.next();
                            option = Integer.parseInt(soption);
                            if (option == 1) {    //player leoky spell 1 
                                spell_kurang((-20), 30, 30, 0);
                                if (pmana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah((-20), 30, 30, 0);
                                    option = 7; // utk ulang     
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 2) {   //player leoky spell 2
                                spell_kurang(20, 10, 50, 0);
                                if (pmana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(20, 10, 50, 0);
                                    option = 7; //tuk ulang
                                }
                                if (phealth <= 0) {
                                    System.out.println("no health");
                                    spell_tambah(20, 10, 50, 0);
                                    option = 7; //tuk ulang       
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 3) {   //player leoky spell 3
                                spell_kurang(0, 20, 40, 0);
                                if (pmana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(0, 20, 40, 0);
                                    option = 7;  //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 4) {   //player leoky spell 4
                                spell_tambah(0, 30, 0, 0);
                                bug();
                                status();
                            }
                            if (option == 5) {
                                menuoption();
                            }
                            if (option > 5) {
                                option = 7;
                            }
                            System.out.println("");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: must entry with numberic");
                            tryerror = 0;
                        }
                    } while (option == 7 || tryerror == 0);
                }
                if (pbattle == 3) {    //player tamara char
                    do {
                        try {
                            tryerror = 1;
                            C.charC_player();
                            System.out.println("5. Menu (setting) ");
                            System.out.print("option : ");
                            soption = nilai.next();
                            option = Integer.parseInt(soption);
                            if (option == 1) {    //player tamara spell 1 
                                spell_kurang(0, 30, 30, 0);
                                if (pmana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(0, 30, 30, 0);
                                    option = 7; //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 2) {  //player tamara spell 2
                                spell_kurang(0, 10, 0, 30);
                                if (pmana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(0, 10, 0, 30);
                                    option = 7;  //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 3) {  //player tamara spell 3
                                spell_kurang((-40), 20, 0, 0);
                                if (pmana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah((-40), 20, 0, 0);
                                    option = 7;   //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 4) {  //player tamara spell 4
                                spell_tambah(0, 30, 0, 0);
                                bug();
                                status();
                            }
                            if (option == 5) {
                                menuoption();
                            }
                            if (option > 5) {
                                option = 7;
                            }
                            System.out.println("");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: must entry with numeric");
                            tryerror = 0;
                        }
                    } while (option == 7 || tryerror == 0);
                }
                System.out.println("");

// turn battle dari bot
                if (ehealth > 0 && ulang == 0) {
                    if (ebattle == 0) {   //bot joesp
                        do {
                            A.charA_enemy();
                            option = entry.nextInt(4);
                            System.out.println("\t\t\t\t\toption : " + (option + 1));
                            if (option == 0) {    //bot josep spell 1
                                spell_kurang(50, 0, 0, 40);
                                if (emana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(50, 0, 0, 40);
                                    option = 7;  //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 1) {   //bot josep spell 2
                                spell_kurang(70, 0, 0, 80);
                                if (emana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(70, 0, 0, 80);
                                    option = 7; //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 2) {   //bot josep spell 3
                                spell_kurang(0, 0, (-30), 30);
                                if (emana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(0, 0, (-30), 30);
                                    option = 7; //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 3) {  //bot josep spell 4
                                spell_tambah(0, 0, 0, 30);
                                bug();
                                status();
                            }
                            System.out.println("");
                        } while (option == 7);
                    }
                    if (ebattle == 1) {   //bot leoky char
                        do {
                            B.charB_enemy();
                            option = entry.nextInt(4);
                            System.out.println("\t\t\t\t\toption : " + (option + 1));
                            if (option == 0) {  //bot leoky spell 1
                                spell_kurang(30, 0, (-20), 30);
                                if (emana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(30, 0, (-20), 30);
                                    option = 7;  //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 1) {  //bot leoky spell 2
                                spell_kurang(50, 0, 20, 10);
                                if (emana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(50, 0, 20, 10);
                                    option = 7;  //utk ulang
                                }
                                if (ehealth <= 0) {
                                    System.out.println("no health ");
                                    spell_tambah(50, 0, 20, 10);
                                    option = 7; // utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 2) {  //bot leoky spell 3
                                spell_kurang(40, 0, 0, 20);
                                if (emana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(40, 0, 0, 20);
                                    option = 7;   //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 3) {  //bot leoky spell 4
                                spell_tambah(0, 0, 0, 30);
                                bug();
                                status();
                            }
                            System.out.println("");
                        } while (option == 7);
                    }
                    if (ebattle == 2) {  //bot tamara char
                        do {
                            C.charC_enemy();
                            option = entry.nextInt(4);
                            System.out.println("\t\t\t\t\toption : " + (option + 1));
                            if (option == 0) {  //bot tamara spell 1
                                spell_kurang(30, 0, 0, 30);
                                if (emana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(30, 0, 0, 30);
                                    option = 7;   //utk ulang 
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 1) { //bot tamara spell 2
                                spell_kurang(0, 30, 0, 10);
                                if (emana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(0, 30, 0, 10);
                                    option = 7;  //utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 2) { //bot tamara spell 3
                                spell_kurang(0, 0, (-40), 20);
                                if (emana < 0) {
                                    System.out.println("no mana");
                                    spell_tambah(0, 0, (-40), 20);
                                    option = 7;//utk ulang
                                } else {
                                    bug();
                                    status();
                                }
                            }
                            if (option == 3) {  //bot tamara spell 4
                                spell_tambah(0, 0, 0, 30);
                                bug();
                                status();
                            }

                            System.out.println("");

                        } while (option == 7);
                    }
                }
                if (ehealth <= 0) {
                    System.out.println("		<<YOU WIN>>		\n\n");
                    uulang = 1;
                    ebattle = 9;
                    pbattle = 9;
                    restart = 1;
                }
                if (phealth <= 0) {
                    System.out.println("		<<YOU LOSE>>		\n\n");
                    uulang = 1;
                    pbattle = 9;
                    ebattle = 9;
                    restart = 1;
                }
                round++;
                System.out.println("=========================================================");
                System.out.println("");
            } while (uulang == 0);
        } while (restart == 0);
    }
}
