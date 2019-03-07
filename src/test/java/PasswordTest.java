import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PasswordTest {


    @Test
    void ShouldReturnTrueifEightSignsGiven() {
        //given
        boolean expected = true;
        //when
        boolean result = Password.ifHasEightSigns("jkhf6574");
        //than
        assertEquals(expected, result);
    }

    @Test
    void ShouldReturnFalseifFourSignsGiven() {
        //given
        boolean expected = false;
        //when
        boolean result = Password.ifHasEightSigns("h&jg");
        //than
        assertEquals(expected, result);
    }


    @Test
    void ShouldReturnTrueifNumbersOrLettersOrSpecialSignsAreGiven() {
        //given
        boolean expected = true;
        //when
        boolean result = Password.ifContainsNumbersLettersSpecialSigns("jkt545%$#!kj");
        //than
        assertEquals(expected, result);
    }

    @Test
    void ShouldReturnFalseifNumbersOrLettersOrSpecialSignsAreGiven() {
        //given
        boolean expected = false;
        //when
        boolean result = Password.ifContainsNumbersLettersSpecialSigns("jkt.<");
        //than
        assertEquals(expected, result);
    }

    @Test
    void ShouldReturnTrueifTwoNumberOrMoreAreGIven() {
        //given
        boolean expected = true;
        //when
        boolean result = Password.ifContainsAtLeastTwoNumbers("jkt%$678KJ");
        //than
        assertEquals(expected, result);
    }

    @Test
    void ShouldReturnFalseifLessThanTwoNumberAreGIven() {
        //given
        boolean expected = false;
        //when
        boolean result = Password.ifContainsAtLeastTwoNumbers("jkt%$6");
        //than
        assertEquals(expected, result);
    }
    @Test
    void ShouldReturnTrueifOneBigLetterOrMoreIsGiven() {
        //given
        boolean expected = true;
        //when
        boolean result = Password.ifContainsAtLeastOneBigLetter("jkt%$678KJ");
        //than
        assertEquals(expected, result);
    }
    @Test
    void ShouldReturnFalseifNoBigLetterIsGiven() {
        //given
        boolean expected = false;
        //when
        boolean result = Password.ifContainsAtLeastOneBigLetter("jkt%$678");
        //than
        assertEquals(expected, result);
    }

    @Test
    void ShouldReturnTrueifOneSpecialSignOrMoreIsGiven() {
        //given
        boolean expected = true;
        //when
        boolean result = Password.ifContainsAtLeastOneSpecialSign("jkt%$678KJ");
        //than
        assertEquals(expected, result);
    }

    @Test
    void ShouldReturnFalseifNoOneSpecialSignIsGiven() {
        //given
        boolean expected = false;
        //when
        boolean result = Password.ifContainsAtLeastOneSpecialSign("jkt678KJ");
        //than
        assertEquals(expected, result);
    }
    @Test
    void ShouldReturnTrueICorrectPasswordIsGiven() {
        //given
        boolean expected = true;
        //when
        boolean result = Password.ifCorrectPassword("jkt%$678KJ");
        //than
        assertEquals(expected, result);
    }

    @Test
    void ShouldReturnFalseifWrongPasswordIsGiven() {
        //given
        boolean expected = false;
        //when
        boolean result = Password.ifCorrectPassword("jkjj887");
        //than
        assertEquals(expected, result);
    }
}