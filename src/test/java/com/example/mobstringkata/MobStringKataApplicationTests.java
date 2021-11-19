package com.example.mobstringkata;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MobStringKataApplicationTests {

    @Autowired
    private StringCalculator application;

    @Test
    void emptyStringTest(){

    }
}
