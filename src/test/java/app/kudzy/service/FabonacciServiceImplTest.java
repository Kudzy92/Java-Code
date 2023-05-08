package app.kudzy.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabonacciServiceImplTest {
    @Test
    void isCalFabonacciSequence(){
   var fbsi= new FabonacciServiceImpl();
   assertEquals(",1,2,3,5,8", fbsi.fabonacciSequenceCreator(10));
    }

}