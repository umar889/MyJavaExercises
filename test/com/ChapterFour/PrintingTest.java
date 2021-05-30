package com.ChapterFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintingTest {
    PrintingSquare printingSquare;
    @BeforeEach
  void beforeEach(){
        printingSquare=new PrintingSquare();
    }
@AfterEach
    void afterEach(){
        printingSquare=null;
}
@Test
    void methodPrintSquareTest(){
   // System.out.println( printingSquare.squareMethod(20));
//        assertEquals(0,printingSquare.squareMethod());
}

}
