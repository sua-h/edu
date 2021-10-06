package blackjack;

import java.util.ArrayList;

public class CardTest {
    public static void main(String[] args) {
        // 스페이드, A
        Card c1 = new Card("스페이드", "A");

        ArrayList<Card> cards = new ArrayList();
        cards.add(c1);
        cards.add(new Card("스페이드", "A"));

        Card ccc = cards.get(0);

        System.out.println(c1.getPattern());
        System.out.println(c1.getDenomination());

        System.out.println(c1);
        System.out.println(c1.toString());

        CardDeck cd = new CardDeck();
        cd.showAllCards();
    }
}
