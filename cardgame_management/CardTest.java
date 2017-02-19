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

    for(int index = 0; index < deck.size(); index++){
      Card card = deck.get(index);
      assertEquals(index+1, card.getValue());
    }

    // Card card1 = deck.get(0);
    // assertEquals("ace", card1.getName());
    // assertEquals(1, card1.getValue());

    // Card card2 = deck.get(1);
    // assertEquals("two", card2.getName());
    // assertEquals(2, card2.getValue());

    // Card card3 = deck.get(2);
    // assertEquals("three", card3.getName());
    // assertEquals(3, card3.getValue());

    // Card card4 = deck.get(3);
    // assertEquals("four", card4.getName());
    // assertEquals(4, card4.getValue());

    // Card card5 = deck.get(4);
    // assertEquals("five", card5.getName());
    // assertEquals(5, card5.getValue());

    // Card card6 = deck.get(5);
    // assertEquals("six", card6.getName());
    // assertEquals(6, card6.getValue());

    // Card card7 = deck.get(6);
    // assertEquals("seven", card7.getName());
    // assertEquals(7, card7.getValue());

    // Card card8 = deck.get(7);
    // assertEquals("eight", card8.getName());
    // assertEquals(8, card8.getValue());

    // Card card9 = deck.get(8);
    // assertEquals("nine", card9.getName());
    // assertEquals(9, card9.getValue());

    // Card card10 = deck.get(9);
    // assertEquals("ten", card10.getName());
    // assertEquals(10, card10.getValue());

    // Card card11 = deck.get(10);
    // assertEquals("jack", card11.getName());
    // assertEquals(11, card11.getValue());

    // Card card12 = deck.get(11);
    // assertEquals("queen", card12.getName());
    // assertEquals(12, card12.getValue());

    // Card card13 = deck.get(12);
    // assertEquals("king", card13.getName());
    // assertEquals(13, card13.getValue());
  }

}
