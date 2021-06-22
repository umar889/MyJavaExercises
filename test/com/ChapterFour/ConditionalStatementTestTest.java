package com.ChapterFour;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalStatementTestTest {
    ConditionalStatementTest statement;
    @BeforeEach
    void setUp() {
        statement = new ConditionalStatementTest();
    }

    @AfterEach
    void tearDown() {
        statement = null;
    }

    @Test
    public void findMaxNumber(){
        int firstNumber = 7;
        int secondNumber = 5;
        statement.checkMaxNumber(firstNumber, secondNumber);
        assertEquals(7,statement.getMaxNumber());

    }
    @Test
    void findTheSmallNumber() {

    }
}