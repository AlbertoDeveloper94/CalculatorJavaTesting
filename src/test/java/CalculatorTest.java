
import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculadora = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,3,5",
            "-2,-3,-5",
            "3,-2,1"

    })
    public void addTwoNumbers(int number1,int number2, int result){
        assertEquals(result, calculadora.add(number1,number2));
    }

}
