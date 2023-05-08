package app.kudzy.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringServiceImplTest {
    @Test
    void isStringReversalWorking(){
        var rssi = new ReverseStringServiceImpl();
        assertEquals("java is awesome",rssi.reverseString("emosewa si avaj"));
    }

}