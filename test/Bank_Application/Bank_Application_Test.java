package Bank_Application;

import africa.BankApp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bank_Application_Test {
    Bank_App myBank_Phb;

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testThatICanHaveAccount() {
        myBank_Phb = new Bank_App("Shola", "Umar", 0.0);
        myBank_Phb.getFirstName();
        assertEquals("Shola", myBank_Phb.getFirstName());
    }

    @Test
    public void testToHaveLastName() {
        myBank_Phb = new Bank_App("Shola", "Umar", 0.0);
        myBank_Phb.getLastName();
        assertEquals("Umar", myBank_Phb.getLastName());
    }

    @Test
    public void testThatICanGetBalance() {
        myBank_Phb = new Bank_App("Shola", "Umar", 0.0);
        myBank_Phb.getbalance();
        assertEquals(0.0, myBank_Phb.getbalance());
    }

    @Test
    public void testThatIcanGetPinCode() {
        myBank_Phb = new Bank_App("Shola", "Umar", 0.0);
        myBank_Phb.getPin("12345");

    }

    @Test
    public void testThatICanDeposit() {
        myBank_Phb = new Bank_App("Shola", "Umar", 0.0);
        myBank_Phb.deposit(200);
        assertEquals(1200.00, myBank_Phb.getbalance());

    }

    @Test
    public void testThatICanWithdraw() {
        myBank_Phb = new Bank_App("Shola", "Umar", 0.0);
        myBank_Phb.withdraw(500);
        assertEquals(1000.00, myBank_Phb.getbalance());
    }
}
    @Test
    public void testThatICanLoadAirterm(){
        myBank_Phb = new Bank_App("Shola", "Umar", 0.0);
        myBank_Phb.Loadairterm(50.00);
        assertEquals();
    }

