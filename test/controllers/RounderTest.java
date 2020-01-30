package controllers;

import models.RoundedSum;
import org.junit.Test;
import play.test.WithApplication;
import java.util.OptionalDouble;

import static org.junit.Assert.assertEquals;

public class RounderTest extends WithApplication {


    @Test
    public void rounder_should_successfully_work() {
        RoundedSum roundedSum = new RoundedSum(OptionalDouble.of(12345.6));
        assertEquals(Double.valueOf(12400.0), roundedSum.getRoundedSum());
    }

    @Test
    public void rounder_should_not_change_an_already_rounded_value() {
        RoundedSum roundedSum = new RoundedSum(OptionalDouble.of(12400.0));
        assertEquals(Double.valueOf(12400.0), roundedSum.getRoundedSum());
    }



}
