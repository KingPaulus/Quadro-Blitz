package CardGame;

import java.util.Timer;
import java.util.TimerTask;

import static CardGame.CardGame.*;

public class KiOpponent {

    public static int TimerInt = 0;

    public static void kiPlay() {
        int rndm = (int) (Math.random() * 5);
        if (rndm < 0 || rndm == 0) {
            rndm = 1;
        }
        if (rndm > 5) {
            rndm = 5;
        }
        System.out.println("Ki Spiel zug " + rndm);
        Timer timer = new Timer();
        if (rndm == 1) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if (TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        
                    }
                    if (TimerInt == 2) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        
                    }
                    if (TimerInt == 3) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        
                    }
                    if (TimerInt == 5) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        
                    }
                    if (TimerInt == 6) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 7) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 9) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 10) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        
                    }
                    if (TimerInt == 12) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        
                    }
                    if (TimerInt > 13) {
                        System.out.println("Ende Play 1");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        
                    }
                }
            }, 2 * 1000, 2 * 1000);
        }
        if (rndm == 2) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if (TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        
                    }
                    if (TimerInt == 2) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        
                    }
                    if (TimerInt == 3) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        
                    }
                    if (TimerInt == 5) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        
                    }
                    if (TimerInt == 6) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        
                    }
                    if (TimerInt == 7) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 9) {
                        ArrayDeck[1] = ArrayDeck[1] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 10) {
                        ArrayDeck[1] = ArrayDeck[1] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 12) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        
                    }
                    if (TimerInt > 15) {
                        System.out.println("Ende Play 2");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        
                    }
                }
            }, 2 * 1000, 2 * 1000);
        }
        if (rndm == 3) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if (TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        
                    }
                    if (TimerInt == 3) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        
                    }
                    if (TimerInt == 4) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 5) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 7) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        
                    }
                    if (TimerInt == 8) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        
                    }
                    if (TimerInt == 10) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        
                    }
                    if (TimerInt == 11) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        
                    }
                    if (TimerInt > 13) {
                        System.out.println("Ende Play 3");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        
                    }
                }
            }, 2 * 1000, 2 * 1000);
        }
        if (rndm == 4) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if (TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        
                    }
                    if (TimerInt == 3) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        
                    }
                    if (TimerInt == 4) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        
                    }
                    if (TimerInt == 5) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 7) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        
                    }
                    if (TimerInt == 8) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        
                    }
                    if (TimerInt == 9) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        
                    }
                    if (TimerInt > 11) {
                        System.out.println("Ende Play 4");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        
                    }
                }
            }, 2 * 1000, 2 * 1000);
        }
        if (rndm == 5) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if (TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        
                    }
                    if (TimerInt == 3) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        
                    }
                    if (TimerInt == 4) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        
                    }
                    if (TimerInt == 6) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        
                    }
                    if (TimerInt > 8) {
                        System.out.println("Ende Play 5");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        
                    }
                }
            }, 2 * 1000, 2 * 1000);
        }

    }
}
