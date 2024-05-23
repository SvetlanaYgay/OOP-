package Sem07.view;

public class CalculatorView {
    public static void displayResult(String result) {
        System.out.println("Результат: " + result);
    }

    public static void displayError(String message) {
        System.err.println("Ошибка: " + message);
    }
}