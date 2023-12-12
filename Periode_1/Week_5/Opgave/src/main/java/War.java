import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * A Java class to simulate the card game War.
 */
public class War {
    private ArrayList<Integer> deck;
    private ArrayList<Integer> tmpDeck;
    private ArrayList<Integer> player_1;
    private ArrayList<Integer> player_2;
    private boolean gameover;
    private int winner;
    private int count;


    public War(ArrayList<Integer> deck) {
        this.deck = deck;
        this.gameover = false;
        this.count = 0;
        this.tmpDeck = new ArrayList<Integer>();
        this.player_1 = new ArrayList<Integer>();
        this.player_2 = new ArrayList<Integer>();
    }

    public void simulateGame() {
        while (!this.gameover) {
            if (this.count >= 1000) {
                this.gameover = true;
                System.out.println("hier");
                this.winner = 0;
                return;
            }
//            System.out.println(player_1.size());
//            System.out.println(player_2.size());
            this.battle();
            this.count = this.count + 1;
            checkWinner();
        }
    }

    public void battle() {
        int cardPlayer_1 = getFirstCard(1);
        int cardPlayer_2 = getFirstCard(2);

        if (cardPlayer_1 > cardPlayer_2) {
            this.player_1.add(cardPlayer_1);
            this.player_1.add(cardPlayer_2);
        } else if (cardPlayer_1 < cardPlayer_2) {
            this.player_2.add(cardPlayer_1);
            this.player_2.add(cardPlayer_2);
        } else {
//            System.out.println("Komt hij hier ooit" + this.count);
            ArrayList<Integer> war_player_1 = new ArrayList<Integer>();
            ArrayList<Integer> war_player_2 = new ArrayList<Integer>();
            for (int i = 0; i < 3; i++) {
                if (player_1.size() == 0 || player_2.size() == 0) {
                    break;
                }
                war_player_1.add(getFirstCard(1));
                war_player_2.add(getFirstCard(2));
            }
            if (war_player_1.size() == 3 && war_player_2.size() == 3) {
                if (war_player_1.get(2) > war_player_2.get(2)) {
                    player_1.addAll(war_player_1);
                    player_1.addAll(war_player_2);
                    System.out.println("Ronde gewonnen door speler 1");
                } else {
                    player_2.addAll(war_player_1);
                    player_2.addAll(war_player_2);
                    System.out.println("Ronde gewonnen door speler 2");
                }
            } else {
                checkWinner();
            }
        }
    }

    public int getFirstCard(int player) {
        if (player == 1) {
            int cardValue = this.player_1.get(0);
            this.player_1.remove(0);
            return cardValue;
        } else {
            int cardValue = this.player_2.get(0);
            this.player_2.remove(0);
            return cardValue;
        }
    }

    public void checkWinner() {
        if (this.player_1.size() == 0 && this.player_2.size() == 0) {
            this.gameover = true;
            this.winner = 0;
        } else if (this.player_1.size() < 1) {
            this.gameover = true;
            this.winner = 1;
        } else if (this.player_2.size() < 1) {
            this.gameover = true;
            this.winner = -1;
        }
    }


    public void giveCards() {
        for (int i = 0; i < deck.size(); i++) {
            if (i % 2 == 0) {
                this.player_1.add(deck.get(i));
            } else {
                this.player_2.add(deck.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<Integer>();
        for (int i = 0; i <= 3; i++) {
            for (int j = 2; j <= 14; j++) {
                deck.add(j);
            }
        }
        War game = new War(deck);
        Collections.shuffle(game.deck, new Random());
        game.giveCards();
        game.simulateGame();
        System.out.println(game.winner);
    }
}
