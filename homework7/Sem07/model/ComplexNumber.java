package Sem07.model;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        String sign = null;
        if (imaginaryPart < 0) {
            sign = "-";
        } else {
            sign = "+";
        }
        return realPart + " " + sign + " " + Math.abs(imaginaryPart) + "i";
    }
 }