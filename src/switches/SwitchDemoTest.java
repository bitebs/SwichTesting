package switches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwitchDemoTest {
    @Test
    public void getDayOfWeek(){
        assertEquals("Monday", SwitchDemo.getDayOfWeek(1));
        assertEquals("Tuesday", SwitchDemo.getDayOfWeek(2));
        assertEquals("", SwitchDemo.getDayOfWeek(-2));
    }

    @Test
    public void getDayOfWeek2(){
        assertEquals("Monday", SwitchDemo.getDayOfWeek2(1));
        assertEquals("Tuesday", SwitchDemo.getDayOfWeek2(2));
        assertEquals("", SwitchDemo.getDayOfWeek2(-2));
    }

}