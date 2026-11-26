import org.example.Auto;
import org.junit.Test;

import static org.junit.Assert.*;

class FahrzeugTest {
    @Test
    void getKennzeichen(){
        Auto auto = new Auto(5,false,"ZH186098");
        auto.setKennzeichen("ZH186098");
    }
    @Test
    void getAnzahlplaetzte(){
        Auto auto = new Auto(4,false,"ZH186098");
        assertFalse(auto.getMietstatus());
        auto.setMietstatus(true);
        assertTrue(auto.getMietstatus());
    }
    @Test
    void berechneMietPreisProTag(){
        Auto auto = new Auto(7,false,"ZH186098");
        assertEquals(55.00,auto.berechneMietPreisProTag());
    }
}
