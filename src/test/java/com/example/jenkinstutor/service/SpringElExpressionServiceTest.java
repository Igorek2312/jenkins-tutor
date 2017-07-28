package com.example.jenkinstutor.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Igor Rybak
 */
@RunWith(JUnit4.class)
public class SpringElExpressionServiceTest {
    private ExpressionService expressionService;

    @Before
    public void setUp() throws Exception {
        expressionService=new SpringElExpressionService();
    }

    @Test
    public void testEvaluate() throws Exception {
        String result = expressionService.evaluate("1 + 2");
        assertEquals("3",result);
    }

}