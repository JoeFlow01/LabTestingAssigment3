import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchTest {
    @Test
    public void test1(){
        DigitalWatch watch = new DigitalWatch();
        assertEquals("Turned on",watch.TurnOn());
    }
    @Test
    public void test2(){
        DigitalWatch watch = new DigitalWatch();
        assertEquals("Turned on",watch.TurnOn());
        assertEquals("turned on already ",watch.TurnOn());
    }
    @Test
    public void test3(){
        DigitalWatch watch = new DigitalWatch();
        assertEquals("Turned on",watch.TurnOn());
        assertEquals("turned on already ",watch.TurnOn());
        assertEquals("Turned off successfully",watch.Turnoff());
    }
    @Test
    public void test4(){
        DigitalWatch watch = new DigitalWatch();
        assertEquals("Turned on",watch.TurnOn());
        assertEquals("Timer setted",watch.TimerSetter(10));
    }
    @Test
    public void test5(){
        DigitalWatch watch = new DigitalWatch();
        assertEquals("Turned on",watch.TurnOn());
        assertEquals("Timer setted",watch.TimerSetter(10));
        assertEquals("Timer not ended yet",watch.doSomething());
    }
}