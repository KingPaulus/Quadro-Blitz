package CardGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

public class CardGame extends JPanel implements ActionListener, MouseListener, KeyListener {

    int Breite = 900;
    int Hohe = 700;
    int [] ArrayHand = new int [4];
    String HandKarte1 = "";
    String HandKarte2 = "";
    String HandKarte3 = "";
    String HandKarte4 = "";
    int [] ArrayDeck = new int [4];
    String DeckKarte1 = "";
    String DeckKarte2 = "";
    String DeckKarte3 = "";
    String DeckKarte4 = "";
    boolean Links = false, Rechts = false;
    boolean [] DeckKarte = new boolean [4];
    boolean Start = true;
    boolean Hauptspiel = false;
    boolean Ende = false;
    boolean YouCanplay = true;
    boolean [] the_4_KI_Player = new boolean[4];
    int [] anzahlvonkarten = new int[4];
    ImageIcon [] imagePic = new ImageIcon[8];
    Image imageBackground = null;
    Image imageHolz = null;
    Image imageDeckBackground = null;
    Image imageHandBackground = null;
    Image imageKarte = null;
    Image imageDeck = null;
    Image imageStaple = null;
    Image StartScreen = null;

    public CardGame() {
        JFrame frame = new JFrame("Kartenspiel");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Breite, Hohe);
        frame.setVisible(true);
        frame.addKeyListener(this);
        frame.addMouseListener(this);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    public void setImage() {
        imagePic[0] = new ImageIcon("image/Texture1.png");
        imageBackground = imagePic[0].getImage();
        imagePic[1] = new ImageIcon("image/Texture2.png");
        imageHolz = imagePic[1].getImage();
        imagePic[2] = new ImageIcon("image/DeckKarten.png");
        imageDeckBackground = imagePic[2].getImage();
        imagePic[3] = new ImageIcon("image/Karte.png");
        imageKarte = imagePic[3].getImage();
        imagePic[4] = new ImageIcon("image/KarteDeck.png");
        imageDeck = imagePic[4].getImage();
        imagePic[5] = new ImageIcon("image/KarteStapel.png");
        imageStaple = imagePic[5].getImage();
        imagePic[6] = new ImageIcon("image/HandKarten.png");
        imageHandBackground = imagePic[6].getImage();
        imagePic[7] = new ImageIcon("image/StartScreen.png");
        StartScreen = imagePic[7].getImage();
    }


    public void paint (Graphics g) {
        super.paint(g);
        if(Start == true) {
            g.drawImage(StartScreen, 0, 0, Breite, Hohe, null);
            DeckKarte[0] = true;
            DeckKarte[1] = false;
            DeckKarte[2] = false;
            DeckKarte[3] = false;
            the_4_KI_Player[0] = true;
            the_4_KI_Player[1] = false;
            the_4_KI_Player[2] = false;
            the_4_KI_Player[3] = false;

            System.out.println("Start");
            System.out.println("Karte" + 1 + " = " + ArrayDeck[0]);
            System.out.println("Karte" + 2 + " = " + ArrayDeck[1]);
            System.out.println("Karte" + 3 + " = " + ArrayDeck[2]);
            System.out.println("Karte" + 4 + " = " + ArrayDeck[3]);

            for(int MarvinLOL = 0;ArrayHand.length>MarvinLOL;MarvinLOL++) {
                int rndm = (int)(Math.random()*9);
                if(rndm == 0) {
                    rndm = 1;
                }
                System.out.println("rndm = " + rndm);
                ArrayHand[MarvinLOL] = rndm;
            }
            for(int Hallo = 0;Hallo < ArrayDeck.length; Hallo++) {
                ArrayDeck[Hallo] = 0;
            }
            for(int uuzz = 0;uuzz<anzahlvonkarten.length;uuzz++) {
                anzahlvonkarten[uuzz] = 4;
            }
            setImage();
            Start = false;
            Hauptspiel = true;
            repaint();
        } else if(Hauptspiel == true) {

            if (ArrayDeck[0] == 9) {
                ArrayDeck[0] = 0;
            }
            if (ArrayDeck[1] == 9) {
                ArrayDeck[1] = 0;
            }
            if (ArrayDeck[2] == 9) {
                ArrayDeck[2] = 0;
            }
            if (ArrayDeck[3] == 9) {
                ArrayDeck[3] = 0;
            }

            if (ArrayHand[0] == 0) {
                HandKarte1 = "0";
            } else if (ArrayHand[0] == 1) {
                HandKarte1 = "1";
            } else if (ArrayHand[0] == 2) {
                HandKarte1 = "2";
            } else if (ArrayHand[0] == 3) {
                HandKarte1 = "3";
            } else if (ArrayHand[0] == 4) {
                HandKarte1 = "4";
            } else if (ArrayHand[0] == 5) {
                HandKarte1 = "5";
            } else if (ArrayHand[0] == 6) {
                HandKarte1 = "6";
            } else if (ArrayHand[0] == 7) {
                HandKarte1 = "7";
            } else if (ArrayHand[0] == 8) {
                HandKarte1 = "8";
            } else if (ArrayHand[0] == 9) {
                HandKarte1 = "9";
            } else {
                System.out.println("ERROR HandKarte1");
            }

            if (ArrayHand[1] == 0) {
                HandKarte2 = "0";
            } else if (ArrayHand[1] == 1) {
                HandKarte2 = "1";
            } else if (ArrayHand[1] == 2) {
                HandKarte2 = "2";
            } else if (ArrayHand[1] == 3) {
                HandKarte2 = "3";
            } else if (ArrayHand[1] == 4) {
                HandKarte2 = "4";
            } else if (ArrayHand[1] == 5) {
                HandKarte2 = "5";
            } else if (ArrayHand[1] == 6) {
                HandKarte2 = "6";
            } else if (ArrayHand[1] == 7) {
                HandKarte2 = "7";
            } else if (ArrayHand[1] == 8) {
                HandKarte2 = "8";
            } else if (ArrayHand[1] == 9) {
                HandKarte2 = "9";
            } else {
                System.out.println("ERROR HandKarte2");
            }

            if (ArrayHand[2] == 0) {
                HandKarte3 = "0";
            } else if (ArrayHand[2] == 1) {
                HandKarte3 = "1";
            } else if (ArrayHand[2] == 2) {
                HandKarte3 = "2";
            } else if (ArrayHand[2] == 3) {
                HandKarte3 = "3";
            } else if (ArrayHand[2] == 4) {
                HandKarte3 = "4";
            } else if (ArrayHand[2] == 5) {
                HandKarte3 = "5";
            } else if (ArrayHand[2] == 6) {
                HandKarte3 = "6";
            } else if (ArrayHand[2] == 7) {
                HandKarte3 = "7";
            } else if (ArrayHand[2] == 8) {
                HandKarte3 = "8";
            } else if (ArrayHand[2] == 9) {
                HandKarte3 = "9";
            } else {
                System.out.println("ERROR HandKarte3");
            }

            if (ArrayHand[3] == 0) {
                HandKarte4 = "0";
            } else if (ArrayHand[3] == 1) {
                HandKarte4 = "1";
            } else if (ArrayHand[3] == 2) {
                HandKarte4 = "2";
            } else if (ArrayHand[3] == 3) {
                HandKarte4 = "3";
            } else if (ArrayHand[3] == 4) {
                HandKarte4 = "4";
            } else if (ArrayHand[3] == 5) {
                HandKarte4 = "5";
            } else if (ArrayHand[3] == 6) {
                HandKarte4 = "6";
            } else if (ArrayHand[3] == 7) {
                HandKarte4 = "7";
            } else if (ArrayHand[3] == 8) {
                HandKarte4 = "8";
            } else if (ArrayHand[3] == 9) {
                HandKarte4 = "9";
            } else {
                System.out.println("ERROR HandKarte4");
            }

            //-------------------------------------------------------

            if (ArrayDeck[0] == 0) {
                DeckKarte1 = "0";
            } else if (ArrayDeck[0] == 1) {
                DeckKarte1 = "1";
            } else if (ArrayDeck[0] == 2) {
                DeckKarte1 = "2";
            } else if (ArrayDeck[0] == 3) {
                DeckKarte1 = "3";
            } else if (ArrayDeck[0] == 4) {
                DeckKarte1 = "4";
            } else if (ArrayDeck[0] == 5) {
                DeckKarte1 = "5";
            } else if (ArrayDeck[0] == 6) {
                DeckKarte1 = "6";
            } else if (ArrayDeck[0] == 7) {
                DeckKarte1 = "7";
            } else if (ArrayDeck[0] == 8) {
                DeckKarte1 = "8";
            } else if (ArrayDeck[0] == 9) {
                DeckKarte1 = "9";
            } else {
                System.out.println("ERROR DeckKarte1");
            }

            if (ArrayDeck[1] == 0) {
                DeckKarte2 = "0";
            } else if (ArrayDeck[1] == 1) {
                DeckKarte2 = "1";
            } else if (ArrayDeck[1] == 2) {
                DeckKarte2 = "2";
            } else if (ArrayDeck[1] == 3) {
                DeckKarte2 = "3";
            } else if (ArrayDeck[1] == 4) {
                DeckKarte2 = "4";
            } else if (ArrayDeck[1] == 5) {
                DeckKarte2 = "5";
            } else if (ArrayDeck[1] == 6) {
                DeckKarte2 = "6";
            } else if (ArrayDeck[1] == 7) {
                DeckKarte2 = "7";
            } else if (ArrayDeck[1] == 8) {
                DeckKarte2 = "8";
            } else if (ArrayDeck[1] == 9) {
                DeckKarte2 = "9";
            } else {
                System.out.println("ERROR DeckKarte2");
            }

            if (ArrayDeck[2] == 0) {
                DeckKarte3 = "0";
            } else if (ArrayDeck[2] == 1) {
                DeckKarte3 = "1";
            } else if (ArrayDeck[2] == 2) {
                DeckKarte3 = "2";
            } else if (ArrayDeck[2] == 3) {
                DeckKarte3 = "3";
            } else if (ArrayDeck[2] == 4) {
                DeckKarte3 = "4";
            } else if (ArrayDeck[2] == 5) {
                DeckKarte3 = "5";
            } else if (ArrayDeck[2] == 6) {
                DeckKarte3 = "6";
            } else if (ArrayDeck[2] == 7) {
                DeckKarte3 = "7";
            } else if (ArrayDeck[2] == 8) {
                DeckKarte3 = "8";
            } else if (ArrayDeck[2] == 9) {
                DeckKarte3 = "9";
            } else {
                System.out.println("ERROR DeckKarte3");
            }

            if (ArrayDeck[3] == 0) {
                DeckKarte4 = "0";
            } else if (ArrayDeck[3] == 1) {
                DeckKarte4 = "1";
            } else if (ArrayDeck[3] == 2) {
                DeckKarte4 = "2";
            } else if (ArrayDeck[3] == 3) {
                DeckKarte4 = "3";
            } else if (ArrayDeck[3] == 4) {
                DeckKarte4 = "4";
            } else if (ArrayDeck[3] == 5) {
                DeckKarte4 = "5";
            } else if (ArrayDeck[3] == 6) {
                DeckKarte4 = "6";
            } else if (ArrayDeck[3] == 7) {
                DeckKarte4 = "7";
            } else if (ArrayDeck[3] == 8) {
                DeckKarte4 = "8";
            } else if (ArrayDeck[3] == 9) {
                DeckKarte4 = "9";
            } else {
                System.out.println("ERROR DeckKarte4");
            }


            //TODO
//		g.setColor(background_Color);
//		g.fillRect(0, 0, Breite, Hohe);
            g.drawImage(imageBackground, 0, 0, Breite, Hohe, null);

//		g.setColor(Color.ORANGE.darker());
//		g.fillRect(100, 90, 700, 260);
            g.drawImage(imageHolz, 100, 90, 700, 260, null);

//		g.setColor(background_Color);
//		g.fillRect(115, 105, 670, 230);
            g.drawImage(imageDeckBackground, 115, 105, 670, 230, null);

//		g.setColor(Color.BLUE);
//		g.fillRect(130, 440, 610, 220);
            //imageDeckBackground
            // image1
            // imageDeckBackground
            g.drawImage(imageHandBackground, 130, 440, 610, 220, null);

            // Deck
            if (DeckKarte[0] == true) {
                g.drawImage(imageDeck, 135, 115, 150, 210, null);
            }
            if (ArrayDeck[0] != 0) {
                g.drawImage(imageKarte, 140, 120, 140, 200, null);
            }

            if (DeckKarte[1] == true) {
                g.drawImage(imageDeck, 295, 115, 150, 210, null);
            }
            if (ArrayDeck[1] != 0) {
                g.drawImage(imageKarte, 300, 120, 140, 200, null);
            }

            if (DeckKarte[2] == true) {
                g.drawImage(imageDeck, 455, 115, 150, 210, null);
            }
            if (ArrayDeck[2] != 0) {
                g.drawImage(imageKarte, 460, 120, 140, 200, null);
            }

            if (DeckKarte[3] == true) {
                g.drawImage(imageDeck, 615, 115, 150, 210, null);
            }
            if (ArrayDeck[3] != 0) {
                g.drawImage(imageKarte, 620, 120, 140, 200, null);
            }


            // Hand
            if (ArrayHand[0] != 0) {
                g.drawImage(imageKarte, 140, 450, 140, 200, null);
            }
            if (ArrayHand[1] != 0) {
                g.drawImage(imageKarte, 290, 450, 140, 200, null);
            }
            if (ArrayHand[2] != 0) {
                g.drawImage(imageKarte, 440, 450, 140, 200, null);
            }
            if (ArrayHand[3] != 0) {
                g.drawImage(imageKarte, 590, 450, 140, 200, null);
            }

            // Switch Butten
            g.setColor(Color.WHITE);
            g.fillRect(390, 360, 50, 50);
            g.fillRect(460, 360, 50, 50);
            g.setColor(Color.BLACK);
            g.setFont(new Font("Franklin Gothic Demi Italic", 4, 50));
            g.drawString("<", 400, 400);
            g.drawString(">", 470, 400);
            g.setFont(new Font("Franklin Gothic Demi Italic", 4, 180));

            int outlineSize = 2; // You can adjust the size of the outline

            // HAND KARTE1
            if (ArrayHand[0] != 0) {
                int cardNumberPoseX = 150;
                int cardNumberPoseY = 610;
                g.setColor(Color.BLACK);
                for (int xOffset = -outlineSize; xOffset <= outlineSize; xOffset++) {
                    for (int yOffset = -outlineSize; yOffset <= outlineSize; yOffset++) {
                        if (xOffset != 0 || yOffset != 0) {
                            g.drawString(HandKarte1, cardNumberPoseX + xOffset, cardNumberPoseY + yOffset);
                        }
                    }
                }
                g.setColor(Color.WHITE);
                g.drawString(HandKarte1, cardNumberPoseX, cardNumberPoseY);
            }

            // HAND KARTE2
            if (ArrayHand[1] != 0) {
                int cardNumberPoseX = 300;
                int cardNumberPoseY = 610;
                g.setColor(Color.BLACK);
                for (int xOffset = -outlineSize; xOffset <= outlineSize; xOffset++) {
                    for (int yOffset = -outlineSize; yOffset <= outlineSize; yOffset++) {
                        if (xOffset != 0 || yOffset != 0) {
                            g.drawString(HandKarte2, cardNumberPoseX + xOffset, cardNumberPoseY + yOffset);
                        }
                    }
                }
                g.setColor(Color.WHITE);
                g.drawString(HandKarte2, cardNumberPoseX, cardNumberPoseY);
            }

            // HAND KARTE3
            if (ArrayHand[2] != 0) {
                int cardNumberPoseX = 450;
                int cardNumberPoseY = 610;
                g.setColor(Color.BLACK);
                for (int xOffset = -outlineSize; xOffset <= outlineSize; xOffset++) {
                    for (int yOffset = -outlineSize; yOffset <= outlineSize; yOffset++) {
                        if (xOffset != 0 || yOffset != 0) {
                            g.drawString(HandKarte3, cardNumberPoseX + xOffset, cardNumberPoseY + yOffset);
                        }
                    }
                }
                g.setColor(Color.WHITE);
                g.drawString(HandKarte3, cardNumberPoseX, cardNumberPoseY);
            }

            // HAND KARTE4
            if (ArrayHand[3] != 0) {
                int cardNumberPoseX = 600;
                int cardNumberPoseY = 610;
                g.setColor(Color.BLACK);
                for (int xOffset = -outlineSize; xOffset <= outlineSize; xOffset++) {
                    for (int yOffset = -outlineSize; yOffset <= outlineSize; yOffset++) {
                        if (xOffset != 0 || yOffset != 0) {
                            g.drawString(HandKarte4, cardNumberPoseX + xOffset, cardNumberPoseY + yOffset);
                        }
                    }
                }
                g.setColor(Color.WHITE);
                g.drawString(HandKarte4, cardNumberPoseX, cardNumberPoseY);
            }




            // Deck Karte 1
            if (ArrayDeck[0] != 0) {
                int cardNumberPoseX = 150;
                int cardNumberPoseY = 280;
                g.setColor(Color.BLACK);
                for (int xOffset = -outlineSize; xOffset <= outlineSize; xOffset++) {
                    for (int yOffset = -outlineSize; yOffset <= outlineSize; yOffset++) {
                        if (xOffset != 0 || yOffset != 0) {
                            g.drawString(DeckKarte1, cardNumberPoseX + xOffset, cardNumberPoseY + yOffset);
                        }
                    }
                }
                g.setColor(Color.WHITE);
                g.drawString(DeckKarte1, cardNumberPoseX, cardNumberPoseY);
            }

            // Deck Karte 2
            if (ArrayDeck[1] != 0) {
                int cardNumberPoseX = 310;
                int cardNumberPoseY = 280;
                g.setColor(Color.BLACK);
                for (int xOffset = -outlineSize; xOffset <= outlineSize; xOffset++) {
                    for (int yOffset = -outlineSize; yOffset <= outlineSize; yOffset++) {
                        if (xOffset != 0 || yOffset != 0) {
                            g.drawString(DeckKarte2, cardNumberPoseX + xOffset, cardNumberPoseY + yOffset);
                        }
                    }
                }
                g.setColor(Color.WHITE);
                g.drawString(DeckKarte2, cardNumberPoseX, cardNumberPoseY);
            }

            // Deck Karte 3
            if (ArrayDeck[2] != 0) {
                int cardNumberPoseX = 470;
                int cardNumberPoseY = 280;
                g.setColor(Color.BLACK);
                for (int xOffset = -outlineSize; xOffset <= outlineSize; xOffset++) {
                    for (int yOffset = -outlineSize; yOffset <= outlineSize; yOffset++) {
                        if (xOffset != 0 || yOffset != 0) {
                            g.drawString(DeckKarte3, cardNumberPoseX + xOffset, cardNumberPoseY + yOffset);
                        }
                    }
                }
                g.setColor(Color.WHITE);
                g.drawString(DeckKarte3, cardNumberPoseX, cardNumberPoseY);
            }

            // Deck Karte 4
            if (ArrayDeck[3] != 0) {
                int cardNumberPoseX = 630;
                int cardNumberPoseY = 280;
                g.setColor(Color.BLACK);
                for (int xOffset = -outlineSize; xOffset <= outlineSize; xOffset++) {
                    for (int yOffset = -outlineSize; yOffset <= outlineSize; yOffset++) {
                        if (xOffset != 0 || yOffset != 0) {
                            g.drawString(DeckKarte4, cardNumberPoseX + xOffset, cardNumberPoseY + yOffset);
                        }
                    }
                }
                g.setColor(Color.WHITE);
                g.drawString(DeckKarte4, cardNumberPoseX, cardNumberPoseY);
            }
            g.drawImage(imageStaple, 798, 378, 74, 94, null);

            // Spieler Kreise
            g.setColor(Color.BLACK);
            g.fillOval(75, 5, 60, 60);
            g.fillOval(145, 5, 60, 60);
            g.fillOval(215, 5, 60, 60);
            g.fillOval(285, 5, 60, 60);

            // TODO
            // KI Spieler Board
            g.setColor(Color.BLUE);
            g.fillOval(80, 10, 50, 50);
            if (the_4_KI_Player[0]) {
                g.setColor(Color.green);
                g.fillOval(80, 10, 50, 50);
            }
            g.setColor(Color.BLUE);
            g.fillOval(150, 10, 50, 50);
            if (the_4_KI_Player[1]) {
                g.setColor(Color.green);
                g.fillOval(150, 10, 50, 50);
            }
            g.setColor(Color.BLUE);
            g.fillOval(220, 10, 50, 50);
            if (the_4_KI_Player[2]) {
                g.setColor(Color.green);
                g.fillOval(220, 10, 50, 50);
            }
            g.setColor(Color.BLUE);
            g.fillOval(290, 10, 50, 50);
            if (the_4_KI_Player[3]) {
                g.setColor(Color.green);
                g.fillOval(290, 10, 50, 50);
            }

            int[] zzu = new int[4];
            zzu[0] = 80;
            zzu[1] = 150;
            zzu[2] = 220;
            zzu[3] = 290;
            for (int uuz = 0; uuz < anzahlvonkarten[0]; uuz++) {
                g.drawImage(imageKarte, zzu[0], 33, 24, 34, null);
                zzu[0] = zzu[0] + 5;
            }
            for (int uuz = 0; uuz < anzahlvonkarten[1]; uuz++) {
                g.drawImage(imageKarte, zzu[1], 33, 24, 34, null);
                zzu[1] = zzu[1] + 5;
            }
            for (int uuz = 0; uuz < anzahlvonkarten[2]; uuz++) {
                g.drawImage(imageKarte, zzu[2], 33, 24, 34, null);
                zzu[2] = zzu[2] + 5;
            }
            for (int uuz = 0; uuz < anzahlvonkarten[3]; uuz++) {
                g.drawImage(imageKarte, zzu[3], 33, 24, 34, null);
                zzu[3] = zzu[3] + 5;
            }
            if (ArrayHand[0] == 0 && ArrayHand[1] == 0 && ArrayHand[2] == 0 && ArrayHand[3] == 0) {
                System.out.println("WIN");
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, Breite, Hohe);
                g.setColor(Color.WHITE);
                g.setFont(new Font("Franklin Gothic Demi Italic", 4, 260));
                g.drawString("WIN", 300, 400);
                YouCanplay = false;
            }
        }
    }

    public int TimerInt = 0;
    public void kiPlay () {
        int rndm = (int)(Math.random()*5);
        if(rndm < 0 || rndm == 0) {
            rndm = 1;
        }
        if(rndm > 5) {
            rndm = 5;
        }
        System.out.println("Ki Spiel zug " + rndm);
        Timer timer = new Timer();
        if(rndm == 1) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if(TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        repaint();
                    }
                    if(TimerInt == 2) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        repaint();
                    }
                    if(TimerInt == 3) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        repaint();
                    }
                    if(TimerInt == 5) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        repaint();
                    }
                    if(TimerInt == 6) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 7) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 9) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 10) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        repaint();
                    }
                    if(TimerInt == 12) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        repaint();
                    }
                    if(TimerInt > 13) {
                        System.out.println("Ende Play 1");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        repaint();
                    }
                }
            }, 2*1000, 2*1000);
        }
        if(rndm == 2) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if(TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        repaint();
                    }
                    if(TimerInt == 2) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        repaint();
                    }
                    if(TimerInt == 3) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        repaint();
                    }
                    if(TimerInt == 5) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        repaint();
                    }
                    if(TimerInt == 6) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        repaint();
                    }
                    if(TimerInt == 7) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 9) {
                        ArrayDeck[1] = ArrayDeck[1] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 10) {
                        ArrayDeck[1] = ArrayDeck[1] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 12) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        repaint();
                    }
                    if(TimerInt > 15) {
                        System.out.println("Ende Play 2");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        repaint();
                    }
                }
            }, 2*1000, 2*1000);
        }
        if(rndm == 3) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if(TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        repaint();
                    }
                    if(TimerInt == 3) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        repaint();
                    }
                    if(TimerInt == 4) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 5) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 7) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        repaint();
                    }
                    if(TimerInt == 8) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        repaint();
                    }
                    if(TimerInt == 10) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        repaint();
                    }
                    if(TimerInt == 11) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        repaint();
                    }
                    if(TimerInt > 13) {
                        System.out.println("Ende Play 3");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        repaint();
                    }
                }
            }, 2*1000, 2*1000);
        }
        if(rndm == 4) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if(TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        repaint();
                    }
                    if(TimerInt == 3) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[1] = anzahlvonkarten[1] - 1;
                        repaint();
                    }
                    if(TimerInt == 4) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        repaint();
                    }
                    if(TimerInt == 5) {
                        ArrayDeck[0] = ArrayDeck[0] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 7) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        repaint();
                    }
                    if(TimerInt == 8) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        repaint();
                    }
                    if(TimerInt == 9) {
                        ArrayDeck[2] = ArrayDeck[2] + 1;
                        anzahlvonkarten[3] = anzahlvonkarten[3] - 1;
                        repaint();
                    }
                    if(TimerInt > 11) {
                        System.out.println("Ende Play 4");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        repaint();
                    }
                }
            }, 2*1000, 2*1000);
        }
        if(rndm == 5) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    TimerInt++;
                    if(TimerInt == 1) {
                        the_4_KI_Player[0] = false;
                        the_4_KI_Player[1] = true;
                        repaint();
                    }
                    if(TimerInt == 3) {
                        the_4_KI_Player[1] = false;
                        the_4_KI_Player[2] = true;
                        repaint();
                    }
                    if(TimerInt == 4) {
                        ArrayDeck[3] = ArrayDeck[3] + 1;
                        anzahlvonkarten[2] = anzahlvonkarten[2] - 1;
                        repaint();
                    }
                    if(TimerInt == 6) {
                        the_4_KI_Player[2] = false;
                        the_4_KI_Player[3] = true;
                        repaint();
                    }
                    if(TimerInt > 8) {
                        System.out.println("Ende Play 5");
                        the_4_KI_Player[3] = false;
                        the_4_KI_Player[0] = true;
                        TimerInt = 0;
                        timer.cancel();
                        YouCanplay = true;
                        repaint();
                    }
                }
            }, 2*1000, 2*1000);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_ENTER:
                repaint();
                break;
        }

    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("x = " + x + " | y = " + y);
        if (x > 400 && x < 445 && y > 390 && y < 440) {
            System.out.println("Links");
            if(DeckKarte[0] == true) {
                DeckKarte[0] = false;
                DeckKarte[3] = true;
            }
            else if(DeckKarte[3] == true) {
                DeckKarte[3] = false;
                DeckKarte[2] = true;
            }
            else if(DeckKarte[2] == true) {
                DeckKarte[2] = false;
                DeckKarte[1] = true;
            }
            else if(DeckKarte[1] == true) {
                DeckKarte[1] = false;
                DeckKarte[0] = true;
            }
            else {
                System.out.println("FEHLER LINKS");
            }
            repaint();
        }

        if (x > 470 && x < 515 && y > 390 && y < 440) {
            System.out.println("Rechts");
            if(DeckKarte[0] == true) {
                DeckKarte[0] = false;
                DeckKarte[1] = true;
            }
            else if(DeckKarte[1] == true) {
                DeckKarte[1] = false;
                DeckKarte[2] = true;
            }
            else if(DeckKarte[2] == true) {
                DeckKarte[2] = false;
                DeckKarte[3] = true;
            }
            else if(DeckKarte[3] == true) {
                DeckKarte[3] = false;
                DeckKarte[0] = true;
            }
            else {
                System.out.println("FEHLER RECHTS");
            }
            repaint();
        }

        if(YouCanplay == true) {
            if (x > 810 && x < 875 && y > 410 && y < 500) {
                System.out.println("Mischen");
                System.out.println("--------");
                for(int MarvinLOL = 0;ArrayHand.length>MarvinLOL;MarvinLOL++) {
                    int rndm = (int)(Math.random()*9);
                    if(rndm == 0) {
                        rndm = 1;
                    }
//					System.out.println("rndm = " + rndm);
                    ArrayHand[MarvinLOL] = rndm;
                }
                for(int uuzz = 0;uuzz<anzahlvonkarten.length;uuzz++) {
                    anzahlvonkarten[uuzz] = 4;
                }
                repaint();
                YouCanplay = false;
                kiPlay();
            }
        }
        if (YouCanplay == true) {
            if (x > 145 && x < 285 && y > 480 && y < 675) {
                // Karte 1
                if(DeckKarte[0] == true) {
                    if(ArrayDeck[0] == 0 && ArrayHand[0] == 1) {
                        ArrayDeck[0] = 1;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[0] == 1 && ArrayHand[0] == 2) {
                        ArrayDeck[0] = 2;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[0] == 2 && ArrayHand[0] == 3) {
                        ArrayDeck[0] = 3;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[0] == 3 && ArrayHand[0] == 4) {
                        ArrayDeck[0] = 4;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[0] == 4 && ArrayHand[0] == 5) {
                        ArrayDeck[0] = 5;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[0] == 5 && ArrayHand[0] == 6) {
                        ArrayDeck[0] = 6;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[0] == 6 && ArrayHand[0] == 7) {
                        ArrayDeck[0] = 7;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[0] == 7 && ArrayHand[0] == 8) {
                        ArrayDeck[0] = 8;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[0] == 8 && ArrayHand[0] == 9) {
                        ArrayDeck[0] = 0;
                        ArrayHand[0] = 0;
                    }
                }
                if(DeckKarte[1] == true) {
                    if(ArrayDeck[1] == 0 && ArrayHand[0] == 1) {
                        ArrayDeck[1] = 1;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[0] == 1 && ArrayHand[0] == 2) {
                        ArrayDeck[1] = 2;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[1] == 2 && ArrayHand[0] == 3) {
                        ArrayDeck[1] = 3;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[1] == 3 && ArrayHand[0] == 4) {
                        ArrayDeck[1] = 4;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[1] == 4 && ArrayHand[0] == 5) {
                        ArrayDeck[1] = 5;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[1] == 5 && ArrayHand[0] == 6) {
                        ArrayDeck[1] = 6;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[1] == 6 && ArrayHand[0] == 7) {
                        ArrayDeck[1] = 7;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[1] == 7 && ArrayHand[0] == 8) {
                        ArrayDeck[1] = 8;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[1] == 8 && ArrayHand[0] == 9) {
                        ArrayDeck[1] = 0;
                        ArrayHand[0] = 0;
                    }
                }
                if(DeckKarte[2] == true) {
                    if(ArrayDeck[2] == 0 && ArrayHand[0] == 1) {
                        ArrayDeck[2] = 1;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[2] == 1 && ArrayHand[0] == 2) {
                        ArrayDeck[2] = 2;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[2] == 2 && ArrayHand[0] == 3) {
                        ArrayDeck[2] = 3;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[2] == 3 && ArrayHand[0] == 4) {
                        ArrayDeck[2] = 4;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[2] == 4 && ArrayHand[0] == 5) {
                        ArrayDeck[2] = 5;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[2] == 5 && ArrayHand[0] == 6) {
                        ArrayDeck[2] = 6;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[2] == 6 && ArrayHand[0] == 7) {
                        ArrayDeck[2] = 7;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[2] == 7 && ArrayHand[0] == 8) {
                        ArrayDeck[2] = 8;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[2] == 8 && ArrayHand[0] == 9) {
                        ArrayDeck[2] = 0;
                        ArrayHand[0] = 0;
                    }
                }
                if(DeckKarte[3] == true) {
                    if(ArrayDeck[3] == 0 && ArrayHand[0] == 1) {
                        ArrayDeck[3] = 1;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[3] == 1 && ArrayHand[0] == 2) {
                        ArrayDeck[3] = 2;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[3] == 2 && ArrayHand[0] == 3) {
                        ArrayDeck[3] = 3;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[3] == 3 && ArrayHand[0] == 4) {
                        ArrayDeck[3] = 4;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[3] == 4 && ArrayHand[0] == 5) {
                        ArrayDeck[3] = 5;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[3] == 5 && ArrayHand[0] == 6) {
                        ArrayDeck[3] = 6;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[3] == 6 && ArrayHand[0] == 7) {
                        ArrayDeck[3] = 7;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[3] == 7 && ArrayHand[0] == 8) {
                        ArrayDeck[3] = 8;
                        ArrayHand[0] = 0;
                    } else if(ArrayDeck[3] == 8 && ArrayHand[0] == 9) {
                        ArrayDeck[3] = 0;
                        ArrayHand[0] = 0;
                    }
                }
                repaint();
            }
            if (x > 300 && x < 435 && y > 480 && y < 675) {
                // Karte 2
                if(DeckKarte[0] == true) {
                    if(ArrayDeck[0] == 0 && ArrayHand[1] == 1) {
                        ArrayDeck[0] = 1;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[0] == 1 && ArrayHand[1] == 2) {
                        ArrayDeck[0] = 2;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[0] == 2 && ArrayHand[1] == 3) {
                        ArrayDeck[0] = 3;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[0] == 3 && ArrayHand[1] == 4) {
                        ArrayDeck[0] = 4;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[0] == 4 && ArrayHand[1] == 5) {
                        ArrayDeck[0] = 5;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[0] == 5 && ArrayHand[1] == 6) {
                        ArrayDeck[0] = 6;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[0] == 6 && ArrayHand[1] == 7) {
                        ArrayDeck[0] = 7;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[0] == 7 && ArrayHand[1] == 8) {
                        ArrayDeck[0] = 8;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[0] == 8 && ArrayHand[1] == 9) {
                        ArrayDeck[0] = 0;
                        ArrayHand[1] = 0;
                    }
                }
                if(DeckKarte[1] == true) {
                    if(ArrayDeck[1] == 0 && ArrayHand[1] == 1) {
                        ArrayDeck[1] = 1;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[1] == 1 && ArrayHand[1] == 2) {
                        ArrayDeck[1] = 2;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[1] == 2 && ArrayHand[1] == 3) {
                        ArrayDeck[1] = 3;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[1] == 3 && ArrayHand[1] == 4) {
                        ArrayDeck[1] = 4;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[1] == 4 && ArrayHand[1] == 5) {
                        ArrayDeck[1] = 5;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[1] == 5 && ArrayHand[1] == 6) {
                        ArrayDeck[1] = 6;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[1] == 6 && ArrayHand[1] == 7) {
                        ArrayDeck[1] = 7;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[1] == 7 && ArrayHand[1] == 8) {
                        ArrayDeck[1] = 8;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[1] == 8 && ArrayHand[1] == 9) {
                        ArrayDeck[1] = 0;
                        ArrayHand[1] = 0;
                    }
                }
                if(DeckKarte[2] == true) {
                    if(ArrayDeck[2] == 0 && ArrayHand[1] == 1) {
                        ArrayDeck[2] = 1;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[2] == 1 && ArrayHand[1] == 2) {
                        ArrayDeck[2] = 2;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[2] == 2 && ArrayHand[1] == 3) {
                        ArrayDeck[2] = 3;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[2] == 3 && ArrayHand[1] == 4) {
                        ArrayDeck[2] = 4;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[2] == 4 && ArrayHand[1] == 5) {
                        ArrayDeck[2] = 5;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[2] == 5 && ArrayHand[1] == 6) {
                        ArrayDeck[2] = 6;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[2] == 6 && ArrayHand[1] == 7) {
                        ArrayDeck[2] = 7;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[2] == 7 && ArrayHand[1] == 8) {
                        ArrayDeck[2] = 8;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[2] == 8 && ArrayHand[1] == 9) {
                        ArrayDeck[2] = 0;
                        ArrayHand[1] = 0;
                    }
                }
                if(DeckKarte[3] == true) {
                    if(ArrayDeck[3] == 0 && ArrayHand[1] == 1) {
                        ArrayDeck[3] = 1;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[3] == 1 && ArrayHand[1] == 2) {
                        ArrayDeck[3] = 2;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[3] == 2 && ArrayHand[1] == 3) {
                        ArrayDeck[3] = 3;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[3] == 3 && ArrayHand[1] == 4) {
                        ArrayDeck[3] = 4;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[3] == 4 && ArrayHand[1] == 5) {
                        ArrayDeck[3] = 5;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[3] == 5 && ArrayHand[1] == 6) {
                        ArrayDeck[3] = 6;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[3] == 6 && ArrayHand[1] == 7) {
                        ArrayDeck[3] = 7;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[3] == 7 && ArrayHand[1] == 8) {
                        ArrayDeck[3] = 8;
                        ArrayHand[1] = 0;
                    } else if(ArrayDeck[3] == 8 && ArrayHand[1] == 9) {
                        ArrayDeck[3] = 0;
                        ArrayHand[1] = 0;
                    }
                }
                repaint();
            }
            if (x > 450 && x < 585 && y > 480 && y < 675) {
                // Karte 3
                if(DeckKarte[0] == true) {
                    if(ArrayDeck[0] == 0 && ArrayHand[2] == 1) {
                        ArrayDeck[0] = 1;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[0] == 1 && ArrayHand[2] == 2) {
                        ArrayDeck[0] = 2;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[0] == 2 && ArrayHand[2] == 3) {
                        ArrayDeck[0] = 3;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[0] == 3 && ArrayHand[2] == 4) {
                        ArrayDeck[0] = 4;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[0] == 4 && ArrayHand[2] == 5) {
                        ArrayDeck[0] = 5;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[0] == 5 && ArrayHand[2] == 6) {
                        ArrayDeck[0] = 6;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[0] == 6 && ArrayHand[2] == 7) {
                        ArrayDeck[0] = 7;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[0] == 7 && ArrayHand[2] == 8) {
                        ArrayDeck[0] = 8;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[0] == 8 && ArrayHand[2] == 9) {
                        ArrayDeck[0] = 0;
                        ArrayHand[2] = 0;
                    }
                }
                if(DeckKarte[1] == true) {
                    if(ArrayDeck[1] == 0 && ArrayHand[2] == 1) {
                        ArrayDeck[1] = 1;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[0] == 1 && ArrayHand[2] == 2) {
                        ArrayDeck[1] = 2;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[1] == 2 && ArrayHand[2] == 3) {
                        ArrayDeck[1] = 3;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[1] == 3 && ArrayHand[2] == 4) {
                        ArrayDeck[1] = 4;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[1] == 4 && ArrayHand[2] == 5) {
                        ArrayDeck[1] = 5;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[1] == 5 && ArrayHand[2] == 6) {
                        ArrayDeck[1] = 6;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[1] == 6 && ArrayHand[2] == 7) {
                        ArrayDeck[1] = 7;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[1] == 7 && ArrayHand[2] == 8) {
                        ArrayDeck[1] = 8;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[1] == 8 && ArrayHand[2] == 9) {
                        ArrayDeck[1] = 0;
                        ArrayHand[2] = 0;
                    }
                }
                if(DeckKarte[2] == true) {
                    if(ArrayDeck[2] == 0 && ArrayHand[2] == 1) {
                        ArrayDeck[2] = 1;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[2] == 1 && ArrayHand[2] == 2) {
                        ArrayDeck[2] = 2;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[2] == 2 && ArrayHand[2] == 3) {
                        ArrayDeck[2] = 3;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[2] == 3 && ArrayHand[2] == 4) {
                        ArrayDeck[2] = 4;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[2] == 4 && ArrayHand[2] == 5) {
                        ArrayDeck[2] = 5;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[2] == 5 && ArrayHand[2] == 6) {
                        ArrayDeck[2] = 6;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[2] == 6 && ArrayHand[2] == 7) {
                        ArrayDeck[2] = 7;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[2] == 7 && ArrayHand[2] == 8) {
                        ArrayDeck[2] = 8;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[2] == 8 && ArrayHand[2] == 9) {
                        ArrayDeck[2] = 0;
                        ArrayHand[2] = 0;
                    }
                }
                if(DeckKarte[3] == true) {
                    if(ArrayDeck[3] == 0 && ArrayHand[2] == 1) {
                        ArrayDeck[3] = 1;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[3] == 1 && ArrayHand[2] == 2) {
                        ArrayDeck[3] = 2;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[3] == 2 && ArrayHand[2] == 3) {
                        ArrayDeck[3] = 3;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[3] == 3 && ArrayHand[2] == 4) {
                        ArrayDeck[3] = 4;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[3] == 4 && ArrayHand[2] == 5) {
                        ArrayDeck[3] = 5;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[3] == 5 && ArrayHand[2] == 6) {
                        ArrayDeck[3] = 6;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[3] == 6 && ArrayHand[2] == 7) {
                        ArrayDeck[3] = 7;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[3] == 7 && ArrayHand[2] == 8) {
                        ArrayDeck[3] = 8;
                        ArrayHand[2] = 0;
                    } else if(ArrayDeck[3] == 8 && ArrayHand[2] == 9) {
                        ArrayDeck[3] = 0;
                        ArrayHand[2] = 0;
                    }
                }
                repaint();
            }
            if (x > 600 && x < 735 && y > 480 && y < 675) {
                // Karte 1
                if(DeckKarte[0] == true) {
                    if(ArrayDeck[0] == 0 && ArrayHand[3] == 1) {
                        ArrayDeck[0] = 1;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[0] == 1 && ArrayHand[3] == 2) {
                        ArrayDeck[0] = 2;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[0] == 2 && ArrayHand[3] == 3) {
                        ArrayDeck[0] = 3;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[0] == 3 && ArrayHand[3] == 4) {
                        ArrayDeck[0] = 4;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[0] == 4 && ArrayHand[3] == 5) {
                        ArrayDeck[0] = 5;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[0] == 5 && ArrayHand[3] == 6) {
                        ArrayDeck[0] = 6;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[0] == 6 && ArrayHand[3] == 7) {
                        ArrayDeck[0] = 7;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[0] == 7 && ArrayHand[3] == 8) {
                        ArrayDeck[0] = 8;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[0] == 8 && ArrayHand[3] == 9) {
                        ArrayDeck[0] = 0;
                        ArrayHand[3] = 0;
                    }
                }
                if(DeckKarte[1] == true) {
                    if(ArrayDeck[1] == 0 && ArrayHand[3] == 1) {
                        ArrayDeck[1] = 1;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[0] == 1 && ArrayHand[3] == 2) {
                        ArrayDeck[1] = 2;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[1] == 2 && ArrayHand[3] == 3) {
                        ArrayDeck[1] = 3;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[1] == 3 && ArrayHand[3] == 4) {
                        ArrayDeck[1] = 4;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[1] == 4 && ArrayHand[3] == 5) {
                        ArrayDeck[1] = 5;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[1] == 5 && ArrayHand[3] == 6) {
                        ArrayDeck[1] = 6;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[1] == 6 && ArrayHand[3] == 7) {
                        ArrayDeck[1] = 7;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[1] == 7 && ArrayHand[3] == 8) {
                        ArrayDeck[1] = 8;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[1] == 8 && ArrayHand[3] == 9) {
                        ArrayDeck[1] = 0;
                        ArrayHand[3] = 0;
                    }
                }
                if(DeckKarte[2] == true) {
                    if(ArrayDeck[2] == 0 && ArrayHand[3] == 1) {
                        ArrayDeck[2] = 1;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[2] == 1 && ArrayHand[3] == 2) {
                        ArrayDeck[2] = 2;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[2] == 2 && ArrayHand[3] == 3) {
                        ArrayDeck[2] = 3;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[2] == 3 && ArrayHand[3] == 4) {
                        ArrayDeck[2] = 4;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[2] == 4 && ArrayHand[3] == 5) {
                        ArrayDeck[2] = 5;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[2] == 5 && ArrayHand[3] == 6) {
                        ArrayDeck[2] = 6;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[2] == 6 && ArrayHand[3] == 7) {
                        ArrayDeck[2] = 7;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[2] == 7 && ArrayHand[3] == 8) {
                        ArrayDeck[2] = 8;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[2] == 8 && ArrayHand[3] == 9) {
                        ArrayDeck[2] = 0;
                        ArrayHand[3] = 0;
                    }
                }
                if(DeckKarte[3] == true) {
                    if(ArrayDeck[3] == 0 && ArrayHand[3] == 1) {
                        ArrayDeck[3] = 1;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[3] == 1 && ArrayHand[3] == 2) {
                        ArrayDeck[3] = 2;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[3] == 2 && ArrayHand[3] == 3) {
                        ArrayDeck[3] = 3;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[3] == 3 && ArrayHand[3] == 4) {
                        ArrayDeck[3] = 4;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[3] == 4 && ArrayHand[3] == 5) {
                        ArrayDeck[3] = 5;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[3] == 5 && ArrayHand[3] == 6) {
                        ArrayDeck[3] = 6;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[3] == 6 && ArrayHand[3] == 7) {
                        ArrayDeck[3] = 7;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[3] == 7 && ArrayHand[3] == 8) {
                        ArrayDeck[3] = 8;
                        ArrayHand[3] = 0;
                    } else if(ArrayDeck[3] == 8 && ArrayHand[3] == 9) {
                        ArrayDeck[3] = 0;
                        ArrayHand[3] = 0;
                    }
                }
                repaint();
            }
        }

    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
