package com.zuehlke.scfg.fraction_spec;

import com.zuehlke.scfg.fraction.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionSpec {

    @Test
    public void toString_() {
        assertEquals("1/2", new Fraction(1, 2).toString());
    }

}
