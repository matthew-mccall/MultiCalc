package dev.mmccall.multicalc;

public class NumberBuilder {
    public void appendDigit(int digit)
    {
        double power = Math.floor(Math.log10(digit));

        workingNumber *= Math.pow(10, power + 1);
        workingNumber += digit;
    }

    public double getValue()
    {
        return workingNumber;
    }

    double workingNumber;
}
