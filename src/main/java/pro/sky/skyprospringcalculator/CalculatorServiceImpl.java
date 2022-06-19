package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hellowCalculator() {
        return "Добро пожаловать в калькулятор!";
    }
    @Override
    public Integer plus(Integer a, Integer b) {

        Integer plusResult = a + b;
        return plusResult;
    }
    @Override
    public Integer minus(Integer a, Integer b) {

        Integer minusResult = a - b;
        return minusResult;
    }
    @Override
    public Integer multiply(Integer a, Integer b) {

        Integer multiplyResult = a * b;
        return multiplyResult;
    }
    @Override
    public Number divide(Integer a, Integer b) {
        Number divideResult = a.doubleValue()/b;
        return divideResult;
        }
    }





