package models;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.OptionalDouble;

public class RoundedSum {

    Double roundedSum = 0d;

    public Double getRoundedSum() {
        return roundedSum;
    }

    public void setRoundedSum(Double roundedSum) {
        this.roundedSum = roundedSum;
    }

    public RoundedSum(OptionalDouble amountMaybe) {
        if (amountMaybe.isPresent()){
            roundedSum = (new BigDecimal(amountMaybe.getAsDouble())).setScale(-2, RoundingMode.UP).doubleValue();
        }
    }
}
