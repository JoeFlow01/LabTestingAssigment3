import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coffemachineTest {
    @Test
    public void machinetester_1(){
        coffemachine c = new coffemachine();
        assertEquals("Machine turned on",c.machine_opener());
    }
    @Test
    public void machinetester_2(){
        coffemachine c= new coffemachine();
        c.ispoweron = true;
        assertEquals("machine opened already",c.machine_opener());
    }
    @Test
    public void machinetester_3(){
        coffemachine c = new coffemachine();
        assertEquals("machine is not working", c.moneyadder(30));
    }
    @Test
    public void machinetester_4(){
        coffemachine c = new coffemachine();
        c.machine_opener();
        assertEquals("money added successfully",c.moneyadder(30));
    }
    @Test
    public void machinetester_5(){
        coffemachine c = new coffemachine();
        c.machine_opener();
        c.closeMachine();
        assertEquals("machine is not working",c.moneyadder(20));
    }
    @Test
    public void machinetester_6(){
        coffemachine c = new coffemachine();
        assertEquals("Machine turned on",c.machine_opener());
        assertEquals("money added successfully",c.moneyadder(15));
    }
    @Test
    public void machinetester_7(){
        coffemachine c = new coffemachine();
        assertEquals("Machine turned on",c.machine_opener());
        assertEquals("money added successfully",c.moneyadder(30));
        assertEquals(3+ " Cups of coffee Made!",c.Coffee_maker(4));
    }
    @Test
    public void machinetester_8(){
        coffemachine c = new coffemachine();
        assertEquals("Money can't be negative", c.moneyadder(-30));
    }

}


