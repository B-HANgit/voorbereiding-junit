package nl.han.ica.oose.dea.testedfizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzExecutorTest {

    private FizzBuzzExecutor sut;

    @BeforeEach
    void setup() {
        sut = new FizzBuzzExecutor();
    }

    @Test
    void executeWithValidIntTest() {
        // Arrange

        // Act
        try {
            var testValue = sut.execute(37);

            // Assert
            //Assertions.assertEquals("37", testValue);
            assertEquals("37", testValue);
        } catch(NegativeInputException nie){
            fail();
        }

    }

    @Test
    void executeWithFizzValueTest() {
        // Arrange

        // Act
        try {
            var testValue = sut.execute(3);

            // Assert
            //Assertions.assertEquals("Fizz", testValue);
            assertEquals("Fizz", testValue);
        } catch(NegativeInputException nie){
            fail();
        }

    }

    @Test
    void executeWithBuzzValueTest() {
        // Arrange

        // Act
        try {
            var testValue = sut.execute(5);

            // Assert
            //Assertions.assertEquals("Buzz", testValue);
            assertEquals("Buzz", testValue);
        }catch(NegativeInputException nie){
            fail();
        }
    }

    @Test
    void executeWithFizzBuzzValueTest() {
        // Arrange

        // Act
        try {
            var testValue = sut.execute(15);

            // Assert
            //Assertions.assertEquals("FizzBuzz", testValue);
            assertEquals("FizzBuzz", testValue);
        }catch(NegativeInputException nie){
            fail();
        }
    }

//    @Test
//    void executeWithNegativeIntTest() {
//        // Arrange
//
//        // Act
//        var testValue = sut.execute(-1);
//
//        // Assert
//        //Assertions.assertEquals("", testValue);
//        assertEquals("", testValue);
//
//    }

//    @Test
//    void executeWithNegativeIntTest() {
//        // Arrange
//
//        try {
//            var testValue = sut.execute(-1);
//            fail();
//        } catch(NegativeInputException nie) {
//            // Do nothing
//        }
//    }

//    @Test
//    void executeWithNegativeIntTest() {
//        // Arrange
//
//        // Assert
//        assertThrows(NegativeInputException.class, () -> {
//            // Act
//            var testValue = sut.execute(-1);
//        });
//    }

    @Test
    void executeWithNegativeIntTest() {
        // Arrange

        // Assert
        Exception ex = assertThrows(NegativeInputException.class, () -> {
            // Act
            var testValue = sut.execute(-1);
        });

        // Assert
        assertEquals("Input should be a positive integer", ex.getMessage());
    }
}
