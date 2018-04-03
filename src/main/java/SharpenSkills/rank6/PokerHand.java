package SharpenSkills.rank6;

/** NOT Resolved
 * https://www.codewars.com/kata/5739174624fc28e188000465/train/java
 *
 A famous casino is suddenly faced with a sharp decline of their revenues. They decide to offer Texas hold'em also online. Can you help them by writing an algorithm that can rank poker hands?

 Task:

 Create a poker hand that has a method to compare itself to another poker hand:
 Result PokerHand.compareWith(PokerHand hand);
 A poker hand has a constructor that accepts a string containing 5 cards:
 PokerHand hand = new PokerHand("KS 2H 5C JD TD");
 The characteristics of the string of cards are:
 A space is used as card seperator
 Each card consists of two characters
 The first character is the value of the card, valid characters are:
 2, 3, 4, 5, 6, 7, 8, 9, T(en), J(ack), Q(ueen), K(ing), A(ce)
 The second character represents the suit, valid characters are:
 S(pades), H(earts), D(iamonds), C(lubs)

 The result of your poker hand compare can be one of these 3 options:
 public enum Result
 {
 WIN,
 LOSS,
 TIE
 }
 Apply the Texas Hold'em rules for ranking the cards.
 There is no ranking for the suits.

 Notes:
 If you finished this kata, you might want to continue with Sortable Poker Hands.
 */

public class PokerHand {
    public enum Result {TIE, WIN, LOSS}

    public String hand;





    PokerHand(String hand) {
        this.hand = hand;
    }

    public Result compareWith(PokerHand hand) {
        /*enum Suit {S, H, D, C}
        enum Rank {2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K, A}*/
        String[] myHand = this.hand.split(" ");
        String[] opponentHand = hand.hand.split(" ");
        for(int i=0; i < myHand.length; i++) {
            System.out.println("myHand: " + myHand[i]);
        }


        return Result.TIE;
    }

    public static void main(String[] args) {
        PokerHand my = new PokerHand("2H 3H 4H 5H 6H");
        PokerHand opponent = new PokerHand("KS AS TS QS JS");
        my.compareWith(opponent);

    }
}

