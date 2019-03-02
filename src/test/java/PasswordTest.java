import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {


    @Test
    public void ShouldReturnTrueIfEightSignsGiven () {
        //given
        boolean expected = true;
        //when
        boolean result = Password.IfHasEightSigns("jkhf6574");
        //than
        assertEquals(result, true);
    }

    @Test
    public void ShouldReturnFalseIfFourSignsGiven () {
        //given
        boolean expected = false;
        //when
        boolean result = Password.IfHasEightSigns("h&jg");
        //than
        assertEquals(result, false);
    }


    @Test
    public void ShouldReturnTrueIfNumbersOrLettersOrSpecialSignsAreGiven () {
        //given
        boolean expected = true;
        //when
        boolean result = Password.IfContainsNumbersLettersSpecialSigns("jkt545%$#!kj");
        //than
        assertEquals(result, true);
    }

    @Test
    public void ShouldReturnFalseIfNumbersOrLettersOrSpecialSignsAreGiven () {
        //given
        boolean expected = false;
        //when
        boolean result = Password.IfContainsNumbersLettersSpecialSigns("jkt.<");
        //than
        assertEquals(result, false);
    }

    @Test
    public void ShouldReturnTrueIfTwoNumberOrMoreAreGIven () {
        //given
        boolean expected = true;
        //when
        boolean result = Password.IfContainsAtLeastTwoNumbers("jkt%$678KJ");
        //than
        assertEquals(result, true);
    }

    @Test
    public void ShouldReturnFalseIfLessThanTwoNumberAreGIven () {
        //given
        boolean expected = false;
        //when
        boolean result = Password.IfContainsAtLeastTwoNumbers("jkt%$6");
        //than
        assertEquals(result, false);
    }
    @Test
    public void ShouldReturnTrueIfOneBigLetterOrMoreIsGiven () {
        //given
        boolean expected = true;
        //when
        boolean result = Password.IfContainsAtLeastOneBigLetter("jkt%$678KJ");
        //than
        assertEquals(result, true);
    }
    @Test
    public void ShouldReturnFalseIfNoBigLetterIsGiven () {
        //given
        boolean expected = false;
        //when
        boolean result = Password.IfContainsAtLeastOneBigLetter("jkt%$678");
        //than
        assertEquals(result, false);
    }

    @Test
    public void ShouldReturnTrueIfOneSpecialSignOrMoreIsGiven () {
        //given
        boolean expected = true;
        //when
        boolean result = Password.IfContainsAtLeastOneSpecialSign("jkt%$678KJ");
        //than
        assertEquals(result, true);
    }

    @Test
    public void ShouldReturnFalseIfNoOneSpecialSignIsGiven () {
        //given
        boolean expected = false;
        //when
        boolean result = Password.IfContainsAtLeastOneSpecialSign("jkt678KJ");
        //than
        assertEquals(result, false);
    }
    @Test
    public void ShouldReturnTrueICorrectPasswordIsGiven() {
        //given
        boolean expected = true;
        //when
        boolean result = Password.IfCorrectPassword("jkt%$678KJ");
        //than
        assertEquals(result, true);
    }

    @Test
    public void ShouldReturnFalseIfWrongPasswordIsGiven() {
        //given
        boolean expected = false;
        //when
        boolean result = Password.IfCorrectPassword("jkjj887");
        //than
        assertEquals(result, false);
    }
}