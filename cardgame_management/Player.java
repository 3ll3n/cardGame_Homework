public class Player{

  private String name;
  private Card hand;

  public Player(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public Card getHand(){
    return this.hand;
  }

  public void setHand(Card hand){
    this.hand = hand; 
  }
  
}