package edu.brandeis.cosi12b.enumexample;

import java.util.ArrayList;
import java.util.Random;

public class EnumExample {

  public static void main(String[] args) {
    ArrayList<PlayingCard>myCards = new ArrayList<PlayingCard>();
    example1();
    example2(myCards);
    example3(myCards);
  }
  
  public static void example1() {
    PlayingCard myCard = new PlayingCard(Suit.HEART, 1);
    
    System.out.println("\n*** Is it a club? ");
    if (myCard.suit != Suit.CLUB) {
      System.out.println("You shouldn't be surprised that it's not a Club!");
    }
  }
  
  public static void example2(ArrayList<PlayingCard> myCards) {
    // Let's make a random number of cards in each suit
    Random r = new Random();
    for (Suit suit: Suit.values()) {
      int count = r.nextInt(5);
      for (int i = 0; i < count; i++) {
        myCards.add(new PlayingCard(suit, r.nextInt(10)));
      }
    }
  }
  
  public static void example3(ArrayList<PlayingCard> myCards) {
    System.out.println("\n**** Here's my awesome hand!");
    for (PlayingCard p: myCards) {
      System.out.println("  Card: " + p);
    }
  }
}
