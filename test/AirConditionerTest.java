import AirConditioner.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest{


    private boolean increaseTemperature;

  @Test
  public void testThatAcIsOff() {
      //given that i have an ac ,my ac is on
      AirConditioner swift = new AirConditioner();
      assertFalse(swift.isOn());
      //when i turn it on
      swift.setOn();
      //check that ac is on
      assertTrue(swift.isOn());
  }
     @Test

    public void testThatAcIsOn() {
        //given that i have an ac ,my ac is on
        AirConditioner swift = new AirConditioner();
        assertTrue(swift.isOn());
        //when i turn it on
        swift.setOn();
        //check that ac is on
        assertFalse(swift.isOn());
    }

    public void testIncreaseTemperature() {
        //given that i have an ac ,my ac is on
        AirConditioner swift = new AirConditioner();
        assertTrue(swift.isOn());
        //when i turn it on
        swift.setOn();
        //check that ac is on
        assertTrue(swift.isOn());
//        assertEquals(16.swift.getTemperature());
    }
}

