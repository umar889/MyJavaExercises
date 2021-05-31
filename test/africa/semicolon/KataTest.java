package africa.semicolon;

import Kata.Kata1;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
   public void TestThatKataCanReverseNumber(){
        Kata1 kata = new Kata1();
        assertEquals(23234,kata.reverse(43232));

    }

}
