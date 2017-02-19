import java.util.ArrayList;

public class Card{

  private String name;
  private int value;
 

  public Card(String name, int value){
    this.name = name;
    this.value = value;
  }

  public String getName(){
    return this.name;
  }

  public int getValue(){
    return this.value;
  }

  // class method - static(self in Ruby)

  public static ArrayList<Card> createDeck(){
    ArrayList<Card> deck = new ArrayList<Card>();

    deck.add(new Card("ace", 1));
    deck.add(new Card("two", 2));
    deck.add(new Card("three", 3));
    deck.add(new Card("four", 4));
    deck.add(new Card("five", 5));
    deck.add(new Card("six", 6));
    deck.add(new Card("seven", 7));
    deck.add(new Card("eight", 8));
    deck.add(new Card("nine", 9));
    deck.add(new Card("ten", 10));
    deck.add(new Card("jack", 11));
    deck.add(new Card("queen", 12));
    deck.add(new Card("king", 13));

    return deck;
  }

  
}

