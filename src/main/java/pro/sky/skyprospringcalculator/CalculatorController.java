package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorService hellowUser = new CalculatorService();

    @GetMapping(path = "/calculator")
    public String calculator() {
        return hellowUser.hellowCalculator();
    }

    private CalculatorService calculator = new CalculatorService();

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") Integer A, @RequestParam("num2") Integer B) {
        if (A == null || B == null) {
            return "Ошибка, не заполнены все параметры";
        } else {
        }
        return A + " + " + B + " = " + calculator.plus(A, B);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") Integer A, @RequestParam("num2") Integer B) {
        if (A == null || B == null) {
            return "Ошибка, не заполнены все параметры";
        } else {
        }
        return A + " - " + B + " = " + calculator.minus(A, B);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") Integer A, @RequestParam("num2") Integer B) {
        if (A == null || B == null) {
            return "Ошибка, не заполнены все параметры";
        } else {
        }
        return A + " * " + B + " = " + calculator.multiply(A, B);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") Integer A, @RequestParam("num2") Integer B) {
        if (B==0) {
            return "Ошибка, нельзя делить на 0!";
        } else {
        }
        return A + " / " + B + " = " + calculator.divide(A, B);
    }
}