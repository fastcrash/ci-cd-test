package org.losensky;

import org.junit.jupiter.api.Test;

public class IBANCheckerTest {

    @Test
    void testConstructor() {
        IBANChecker ibanChecker = new IBANChecker();
        assert(ibanChecker != null);
    }

    @Test
    void testMain() {
        String[] args = {"DE22790200760027913168"};
        IBANChecker.main(args); 
    }


    @Test
    void testValidate_validIBAN() {
        String validIBAN="DE22790200760027913168";

        boolean result = IBANChecker.validate(validIBAN);

        assert(result == true);
    }

    @Test
    void testValidate_invalidIBAN() {
        String invalidIBAN="DE21790200760027913173";

        boolean result = IBANChecker.validate(invalidIBAN);

        assert(result == false);
    }


    @Test
    void testValidate_tooShortIBAN() {
        String tooShort ="DE227902007600279131";

        boolean result = IBANChecker.validate(tooShort);

        assert(result == false);

    }

    @Test
    void testValidate_unknownCountryIBAN() {
        String unknownCountry = "XX22790200760027913168";

        boolean result = IBANChecker.validate(unknownCountry);

        assert(result == false);
    }
}
