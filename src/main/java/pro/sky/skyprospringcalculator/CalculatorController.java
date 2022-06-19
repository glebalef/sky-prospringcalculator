package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorServiceImpl hellowUser = new CalculatorServiceImpl();

    @GetMapping(path = "/calculator")
    public String calculator() {
        return hellowUser.hellowCalculator();
    }

    private CalculatorServiceImpl calculator = new CalculatorServiceImpl();

    @GetMapping(path = "/calculator/plus")
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка, не заполнены все параметры";
        } else {
        }
        return num1 + " + " + num2 + " = " + calculator.plus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка, не заполнены все параметры";
        } else {
        }
        return num1 + " - " + num2 + " = " + calculator.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(Integer num1,Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка, не заполнены все параметры";
        } else {
        }
        return num1 + " * " + num2 + " = " + calculator.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(Integer num1,Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка, не заполнены все параметры";
        } else if  (num2==0) {
            return "Ошибка, нельзя делить на 0!";
        } else {
        }
        return num1 + " / " + num2 + " = " + calculator.divide(num1, num2);
    }
}