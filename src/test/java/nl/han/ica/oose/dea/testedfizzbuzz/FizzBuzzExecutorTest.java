package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzExecutorTest {

    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutor();
    }
    @Test
    void executeWithValidIntTest(){
        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }

    @Test
    void executeWithValidStringTestResultFizz(){
        // Act
        var testValue = sut.execute(3);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeWithValidStringTestResultBuzz(){
        // Act
        var testValue = sut.execute(5);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeWithValidStringTestResultFizzBuzz(){
        // Act
        var testValue = sut.execute(15);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }

}

/*
De code coverage blijft 100%, zowel bij het uitcommenten van 'executeWithValidStringTestResultFizzBuzz' als voor gecombineerd met 'executeWithValidStringTestResultBuzz'.
Bij het uitcommenten van 'executeWithValidStringTestResultFizzBuzz' zijn beide if-statements en de else afgevangen dus hier is 100% niet vreemd, dit had ik verwacht.
Bij het uitcommenten van beide tests blijft het ook 100%, maar ik begrijp niet zo goed waarom aangezien Buzz hier niet wordt getest, dit had ik niet verwacht.
Als er belangrijke tests weggehaald worden en nog steeds 100% test coverage is, is dit niet waardevol voor een bedrijf en dus ook geen garantie voor foutloze code.
Ook kunnen de tests wel slagen, maar kan er verkeerd worden getest waardoor de test bijvoorbeeld altijd zou slagen, dus weer geen garantie voor foutloze code.
*/