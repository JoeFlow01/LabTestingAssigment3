import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    @Test
    public void coffemachineTest1(){
        ATM a = new ATM();
        a.isvalidcard = false;
        assertEquals("Card not valid",a.Cardentering());
    }
    @Test
    public void coffemachineTest2(){
        ATM a = new ATM();
        assertEquals("card validated",a.Cardentering());
    }
    @Test
    public void coffemachineTest3(){
        ATM a = new ATM();
        assertEquals("login done successfully",a.Passwordenter());
    }
    @Test
    public void coffemachineTest4(){
        ATM a = new ATM();
        assertEquals("card validated",a.Cardentering());
        a.isvalidpass = false;
        assertEquals("Check passwrod enterd",a.Passwordenter());
    }
    @Test
    public void coffemachineTest5(){
        ATM a = new ATM();
        assertEquals("card validated",a.Cardentering());
        assertEquals("login done successfully",a.Passwordenter());
        assertEquals("not enough money in account",a.Withdrawer(10));
    }
    @Test
    public void coffemachineTest7(){
        ATM a = new ATM();
        assertEquals("card validated",a.Cardentering());
        assertEquals("login done successfully",a.Passwordenter());
        assertEquals("Check amount restrictions",a.Deposit(20));
        assertEquals("not enough money in account",a.Withdrawer(10));
    }


}