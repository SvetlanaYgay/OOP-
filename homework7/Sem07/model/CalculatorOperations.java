package Sem07.model;

public class CalculatorOperations {
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getRealPart() + num2.getRealPart();
        double imaginary = num1.getImaginaryPart() + num2.getImaginaryPart();
        return new ComplexNumber(real, imaginary);
    }

    public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getRealPart() * num2.getRealPart() - num1.getImaginaryPart() * num2.getImaginaryPart();
        double imaginary = num1.getRealPart() * num2.getImaginaryPart() + num1.getImaginaryPart() * num2.getRealPart();
        return new ComplexNumber(real, imaginary);
    }

    public static ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getRealPart() * num2.getRealPart() + num2.getImaginaryPart() * num2.getImaginaryPart();
        double real = (num1.getRealPart() * num2.getRealPart() + num1.getImaginaryPart() * num2.getImaginaryPart()) / denominator;
        double imaginary = (num1.getImaginaryPart() * num2.getRealPart() - num1.getRealPart() * num2.getImaginaryPart()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}