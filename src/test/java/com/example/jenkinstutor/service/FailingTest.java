package com.example.jenkinstutor.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class FailingTest {
    @Test
    public void name() throws Exception {
        assertTrue(false);
    }
}
