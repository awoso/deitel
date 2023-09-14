import org.junit.jupiter.api.Test;
import tdd.Bike;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void testThatBikeHasAName(){
        Bike myBike = new Bike();
        myBike.setName("Bike");
        System.out.println(myBike.getName());
        //assertEquals("Motorola",myBike.getName());
    }
    @Test
    public void testThatBikeIsOn(){
        Bike ourBike = new Bike();
        ourBike.keyOn();
        assertEquals(true,ourBike.isOn());
        ourBike.keyOn();
        assertEquals(false,ourBike.isOn());
    }
}
