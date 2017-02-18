import static org.junit.Assert.*;
import org.junit.*;

public class CardTest{
  
  Card card;
  // Card deck;

  @Before
  public void before(){
    card = new Card(2);
    // deck = new ArrayList<Integer>();
  }

  @Test
  public void hasNumber(){
    assertEquals(2, card.getCard());
  }

}
