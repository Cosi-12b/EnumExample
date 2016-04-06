package edu.brandeis.cosi12b.enumexample;

public class PlayingCard {
  int value;
  Suit suit;
  
  PlayingCard(Suit suit, int value) {
    this.suit = suit;
    this.value = value;
  }
  
  public String toString() {
    return String.format("Card: %d of %s", value, suit);
  }
}
