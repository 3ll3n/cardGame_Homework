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

  public static ArrayList<Card> createDeck(){
     return new ArrayList<Card>();
  }

  
}

