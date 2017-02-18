import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CardTest{

  Card jack;
  Card two;

  @Before
  public void before(){
    jack = new Card("jack", 5);
    two = new Card("two", 6);
  }

  @Test
  public void testGetName(){
    assertEquals("jack", jack.getName());
  }

  @Test
  public void testValue(){
    assertEquals(6, two.getValue());
  }

  @Test
  public void testCreateDeck(){
    ArrayList<Card> deck = Card.createDeck();
    assertEquals(13, deck.size());

    Card card1 = deck[0];
    assertEquals("ace", card1.getName());
    assertEquals(1, card1.getValue());

    Card card2 = deck[1];
    assertEquals("two", card2.getName());
    assertEquals(2, card2.getValue());
  }

}
