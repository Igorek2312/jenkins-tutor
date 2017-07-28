package com.example.jenkinstutor.service;

import com.example.jenkinstutor.service.ExpressionService;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Igor Rybak
 */
public class NashornExpressionService implements ExpressionService {

    private final ScriptEngine nashorn;

    public NashornExpressionService() {
        this.nashorn = new ScriptEngineManager().getEngineByName("nashorn");
    }

    @Override
    public String evaluate(String expression) {
        try {
            return nashorn.eval(expression).toString();
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }
}
