import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest{
  
  Player player1;
  Card hand;

  @Before
  public void before(){
    player1 = new Player("Tom");
    hand = new Card("ace", 1);
  }

  @Test
  public void testGetName(){
    assertEquals("Tom", player1.getName());
  }

  @Test
  public void testGetHand(){
    assertEquals(null, player1.getHand());
  }

  @Test
  public void testSetHand(){
    player1.setHand(hand);
    assertEquals(hand, player1.getHand());
  }


}