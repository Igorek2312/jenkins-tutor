package com.example.jenkinstutor.service;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author Igor Rybak
 */
public class SpringElExpressionService implements ExpressionService {
    private final ExpressionParser expressionParser;

    public SpringElExpressionService() {
        this.expressionParser = new SpelExpressionParser();
    }

    @Override
    public String evaluate(String expression) {
        return expressionParser.parseExpression(expression).getValue().toString();
    }
}
