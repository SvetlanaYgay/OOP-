package Sem07.controller;

import java.util.Scanner;

import Sem07.logger.CalculatorLogger;
import Sem07.model.CalculatorOperations;
import Sem07.model.ComplexNumber;
import Sem07.view.CalculatorView;

public class CalculatorController {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое комплексное число:");
        ComplexNumber num1 = getComplexNumberFromUser(scanner);

        System.out.println("Введите второе комплексное число:");
        ComplexNumber num2 = getComplexNumberFromUser(scanner);

        System.out.println("Выберите операцию (1 - Сложение, 2 - Умножение, 3 - Деление):");
        int operationChoice = scanner.nextInt();

        ComplexNumber result = performOperation(num1, num2, operationChoice);
        CalculatorView.displayResult(result.toString());

        CalculatorLogger.logOperation("Комплексные числа: " + num1 + ", " + num2 + " Операция: " + operationChoice + " Результат: " + result);
    }

    private ComplexNumber getComplexNumberFromUser(Scanner scanner) {
        System.out.print("Вещественная часть: ");
        double realPart = scanner.nextDouble();

        System.out.print("Мнимая часть: ");
        double imaginaryPart = scanner.nextDouble();

        return new ComplexNumber(realPart, imaginaryPart);
    }

    private ComplexNumber performOperation(ComplexNumber num1, ComplexNumber num2, int operationChoice) {
        switch (operationChoice) {
            case 1:
                return CalculatorOperations.add(num1, num2);
            case 2:
                return CalculatorOperations.multiply(num1, num2);
            case 3:
                return CalculatorOperations.divide(num1, num2);
            default:
                CalculatorView.displayError("Неправильный ввод");
                return null;
        }
    }
}