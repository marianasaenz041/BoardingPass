import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Boarding_Pass_InfoTest {
    Boarding_Pass_Info bpi;

    @BeforeEach
    void setUp() {
        bpi = new Boarding_Pass_Info();
    }


    @Test
    void getName() {
        assertEquals(null, bpi.getName(),"get name test failed");
    }

    @Test
    void setName() {
        bpi.setName("mariana");
        assertEquals("mariana", bpi.getName(), "set name test failed");
    }

    @Test
    void getEmail() {
        assertEquals(null,bpi.getEmail(),"get email test failed");
    }

    @Test
    void setEmail() {
        bpi.setEmail("mariana@email.com");
        assertEquals("mariana@email.com",bpi.getEmail(),"set email test failed");
    }

    @Test
    void getPhoneNumber() {
        assertEquals(null,bpi.getPhoneNumber(),"get phone number test failed");
    }

    @Test
    void setPhoneNumber() {
        bpi.setPhoneNumber("123-456-7890");
        assertEquals("123-456-7890",bpi.getPhoneNumber(),"set phone number test failed");
    }

    @Test
    void getGender() {
        assertEquals(null,bpi.getGender(),"get gender test failed");
    }

    @Test
    void setGender() {
        bpi.setGender("M");
        assertEquals("M",bpi.getGender(),"Set gender test failed");
    }

    @Test
    void getAge() {
        assertEquals(0,bpi.getAge(),("get age test failed"));
    }

    @Test
    void setAge() {
        bpi.setAge(24);
        assertEquals(24,bpi.getAge(),"set age test failed");
    }

    @Test
    void getOrigin() {
        assertEquals(null,bpi.getOrigin(),"get origin test failed");
    }

    @Test
    void setOrigin() {
        bpi.setOrigin("Austin");
        assertEquals("Austin",bpi.getOrigin(),"set origin test failed");
    }

    @Test
    void getDestination() {
        assertEquals(null,bpi.getDestination(),"get destination test failed");
    }

    @Test
    void setDestination() {
        bpi.setDestination("Atlanta");
        assertEquals("Atlanta",bpi.getDestination(),"Set destination test failed");
    }

    @Test
    void getBoardingPassNumber() {
        assertEquals(0,bpi.getBoardingPassNumber(),"get boarding pass number test failed");
    }

    @Test
    void setBoardingPassNumber() {
        bpi.setBoardingPassNumber(1000000);
        assertEquals(1000000, bpi.getBoardingPassNumber(),"set boarding pass number test failed");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("After all tests in Boarding Pass Info Class passed");
    }
}