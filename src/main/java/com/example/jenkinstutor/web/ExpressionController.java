package com.example.jenkinstutor.web;

import com.example.jenkinstutor.service.ExpressionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Igor Rybak
 */
@RestController
public class ExpressionController {
    private final ExpressionService expressionService;

    @Autowired
    public ExpressionController(ExpressionService expressionService) {
        this.expressionService = expressionService;
    }

    @GetMapping("/evaluate")
    public String evaluate(@RequestParam("exp") String expression){
        return expressionService.evaluate(expression);
    }
}
