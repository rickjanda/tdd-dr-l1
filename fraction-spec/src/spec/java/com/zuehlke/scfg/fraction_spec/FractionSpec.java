package com.zuehlke.scfg.fraction_spec;

import com.zuehlke.scfg.fraction.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionSpec {

    @Test
    public void test() {
        assertEquals(new Fraction(2, 3), new Fraction(1, 3).add(new Fraction(1, 3)));
    }
}
