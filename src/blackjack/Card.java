package blackjack;

// 3번문제
public class Card {
    // -- 시험
    private String pattern;    // 무늬
    private String denomination;    // 숫자, 값

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getDenomination() {
        return this.denomination;
    }
    // -- 시험

    public int getPoint() {
        // denomination 값이 "A" = 1, "2" = 2, .., "10" = 10, "J" "Q" "K" = 10
        switch (denomination) {
            case "A" :
                return 1;
            case "J" :
            case "Q" :
            case "K" :
                return 10;
            default:
                return Integer.parseInt(denomination);
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.pattern, this.denomination);
    }
}
