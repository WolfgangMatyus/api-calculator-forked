package at.technikum.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    private Calculator calculator;

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return calculator.sum(a, b);
    } //test: "http://localhost:8080/sum?a=3&b=4" in browser
}
