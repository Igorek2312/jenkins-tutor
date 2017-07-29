package com.example.jenkinstutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

/**
 * @author Igor Rybak
 */
@RunWith(JUnit4.class)
public class FailedTest {
    @Test
    public void justToFail() throws Exception {
        assertTrue(false);
    }
}
