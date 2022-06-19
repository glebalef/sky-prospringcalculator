package pro.sky.skyprospringcalculator;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;

public class CalculatorService {
    public String hellowCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(Integer num1, Integer num2) {

        Integer plusResult = num1 + num2;
        return plusResult.toString();
    }

    public String minus(Integer num1, Integer num2) {

        Integer minusResult = num1 - num2;
        return minusResult.toString();
    }

    public String multiply(Integer num1, Integer num2) {

        Integer multiplyResult = num1 * num2;
        return multiplyResult.toString();
    }

    public String divide(Integer num1, Integer num2) {
            Integer divideResult = num1 / num2;
            return divideResult.toString();
        }
    }





