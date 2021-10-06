package blackjack;

import java.util.ArrayList;
import java.util.List;


// 시험 - 배열 사용해서 문제 나옴
public class CardDeck {
    private List<Card> cards;

    // 메소드, 생성자 다른 점
    // 1. 클래스 명이랑 이름이 같다.
    // 2. 리턴타입이 없다. (void도 X)
    public CardDeck() {
        init();
    }

    private void init() {
        String[] patterns = {"스페이드", "하트", "클럽", "다이아몬드"};
        cards = new ArrayList<>();

        String num;

        for (int i = 0; i < patterns.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String denomination = null;
                switch (j) {
                    case 1 :
                        denomination = "A";
                        break;
                    case 11 :
                        denomination = "J";
                        break;
                    case 12 :
                        denomination = "Q";
                        break;
                    case 13 :
                        denomination = "K";
                        break;
                    default:
                        denomination = String.valueOf(j);
                }
                Card c = new Card(patterns[i], denomination);
                cards.add(c);
            }
        }
    }

    public Card getCard() {
        // 항상 랜덤한 카드를 준다.

        // if 콜렉션을 배열로 했따면 먼저 섞고, 순차적으로 카드를 줬을 것이다.
        // if 콜렉션을 ArrayList로 했다면 랜덤하게 카드를 준다.

        int rIdx = (int)(Math.random() * cards.size()) ;   // 랜덤한 정수값
        return cards.remove(rIdx);
    }

    public void showAllCards() {
//        for(int i = 0; i < cards.size(); i++) {
//            Card c = cards.get(i);
//            System.out.println(c);
//        }

        // forEach - 콜렉션(array, list, hashmap 등 index 순서가 있는 항목)에 사용 가능
        for(Card c : cards) {
            System.out.println(c);
        }
    }

}
