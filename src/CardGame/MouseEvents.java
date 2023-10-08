package CardGame;

import static CardGame.CardGame.*;

public class MouseEvents {
    public static void Selected_Deck_Field_to_Left() {
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
    }

    public static void Selected_Deck_Field_to_Right() {
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
    }

    public static void PlayCard(int HandCardIndex) {
        if(DeckKarte[0] == true) {
            Play_Card_on_Varible(0, HandCardIndex);
        }
        if(DeckKarte[1] == true) {
            Play_Card_on_Varible(1, HandCardIndex);
        }
        if(DeckKarte[2] == true) {
            Play_Card_on_Varible(2, HandCardIndex);
        }
        if(DeckKarte[3] == true) {
            Play_Card_on_Varible(3, HandCardIndex);
        }
    }

    public static void Play_Card_on_Varible(int DeckIndex, int HandIndex) {
        if(ArrayDeck[DeckIndex] == 0 && ArrayHand[HandIndex] == 1) {
            ArrayDeck[DeckIndex] = 1;
            ArrayHand[HandIndex] = 0;
        } else if(ArrayDeck[DeckIndex] == 1 && ArrayHand[HandIndex] == 2) {
            ArrayDeck[DeckIndex] = 2;
            ArrayHand[HandIndex] = 0;
        } else if(ArrayDeck[DeckIndex] == 2 && ArrayHand[HandIndex] == 3) {
            ArrayDeck[DeckIndex] = 3;
            ArrayHand[HandIndex] = 0;
        } else if(ArrayDeck[DeckIndex] == 3 && ArrayHand[HandIndex] == 4) {
            ArrayDeck[DeckIndex] = 4;
            ArrayHand[HandIndex] = 0;
        } else if(ArrayDeck[DeckIndex] == 4 && ArrayHand[HandIndex] == 5) {
            ArrayDeck[DeckIndex] = 5;
            ArrayHand[HandIndex] = 0;
        } else if(ArrayDeck[DeckIndex] == 5 && ArrayHand[HandIndex] == 6) {
            ArrayDeck[DeckIndex] = 6;
            ArrayHand[HandIndex] = 0;
        } else if(ArrayDeck[DeckIndex] == 6 && ArrayHand[HandIndex] == 7) {
            ArrayDeck[DeckIndex] = 7;
            ArrayHand[HandIndex] = 0;
        } else if(ArrayDeck[DeckIndex] == 7 && ArrayHand[HandIndex] == 8) {
            ArrayDeck[DeckIndex] = 8;
            ArrayHand[HandIndex] = 0;
        } else if(ArrayDeck[DeckIndex] == 8 && ArrayHand[HandIndex] == 9) {
            ArrayDeck[DeckIndex] = 0;
            ArrayHand[HandIndex] = 0;
        }
    }
}
