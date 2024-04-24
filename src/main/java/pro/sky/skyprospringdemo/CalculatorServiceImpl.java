package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl {
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
    public String plusCalculator(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1+num2);
    }
    public String minusCalculator(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }
    public String multiplyCalculator(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }
    public String divideCalculator(int num1, int num2) {
        return num1 + " / " + num2 + " = " + (num1/num2);
    }
}