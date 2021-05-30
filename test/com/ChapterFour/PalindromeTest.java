package com.ChapterFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class PalindromeTest {
    Palindrome palindrome;
    @BeforeEach
    void beforeEach(){
        palindrome=new Palindrome();
    }
@AfterEach
    void afterEach(){
        palindrome=null;
}

}
