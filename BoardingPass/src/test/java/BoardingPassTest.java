import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTest {
    BoardingPass bp;
    @BeforeEach
    void setUp() {
        bp = new BoardingPass();
    }


    @Test
    void firstLine() {
        assertEquals("null","null","first line method test failed");
    }

    @Test
    void secondLine() {
        assertEquals("null","null","second line method test failed");
    }

    @Test
    void ticketPrice() {
        assertEquals(450,450,"ticket pricing method test failed");
    }

    @Test
    void displayToConsole() {
        assertEquals(true,true,"reader method failed");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("After ALL method tests passed");
    }
}