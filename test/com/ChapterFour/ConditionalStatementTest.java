package com.ChapterFour;

public class ConditionalStatementTest {
     ConditionalStatementTest statement;
    private int maxNumber;

    public void checkMaxNumber(int firstNumber,int  secondNumber) {
        if(firstNumber > secondNumber){
            maxNumber = firstNumber;
        }

    }
    public int getMaxNumber() {
        return maxNumber;
    }

}
