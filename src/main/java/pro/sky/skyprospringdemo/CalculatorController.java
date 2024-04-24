package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;
    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }
    @GetMapping(path="/calculator")
    public  String answerCalculator() {
        return  calculatorServiceImpl.calculator();
    }
    @GetMapping(path="/calculator/plus")
    public  String plusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return  calculatorServiceImpl.plusCalculator(num1, num2);
    }
    @GetMapping(path="/calculator/minus")
    public  String minusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return  calculatorServiceImpl.minusCalculator(num1, num2);
    }
    @GetMapping(path="/calculator/multiply")
    public  String multiplyCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return  calculatorServiceImpl.multiplyCalculator(num1, num2);
    }
    @GetMapping(path="/calculator/divide")
    public  String divideCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return  calculatorServiceImpl.divideCalculator(num1, num2);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}