package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hellowCalculator() {
        return "Добро пожаловать в калькулятор!";
    }
    @Override
    public String plus(Integer num1, Integer num2) {

        Integer plusResult = num1 + num2;
        return plusResult.toString();
    }
    @Override
    public String minus(Integer num1, Integer num2) {

        Integer minusResult = num1 - num2;
        return minusResult.toString();
    }
    @Override
    public String multiply(Integer num1, Integer num2) {

        Integer multiplyResult = num1 * num2;
        return multiplyResult.toString();
    }
    @Override
    public String divide(Integer num1, Integer num2) {
            Integer divideResult = num1 / num2;
            return divideResult.toString();
        }
    }





