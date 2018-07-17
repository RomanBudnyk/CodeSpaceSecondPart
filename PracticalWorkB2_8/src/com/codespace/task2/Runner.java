package com.codespace.task2;

public class Runner {
    public void run() {
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        Card[] cards = new Card[suits.length * ranks.length];
        int index = 0;
        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                cards[index++] = new Card(suit, rank);
            }
        }

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
