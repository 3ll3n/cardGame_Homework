import static org.junit.Assert.*;
import org.junit.*;

public class CardTest{
  
  Card card;

  @Before
  public void before(){
    card = new Card(1);
  }

  @Test
  public void hasNumber(){
    assertEquals(1, card.getCard());
  }

}
