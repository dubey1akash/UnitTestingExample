package org.unittesting.example.service;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.unittesting.example.services.CalculatorService;

public class CalculatorServiceTest {

    //to execute some logic before test we can do following things
    //making it static as it should execute before all the method
    @BeforeAll
    public static void init(){
        System.out.println("single time logic run");
    }

    //as soon you put @test annotation this green button will come in this side of box
    //the button on the method will method and above will run whole class as test
   @Test  //TO EXECUTE THIS METHOD
   //also the name used should be at the end Test
    public void addTest(){
       System.out.println("running after before doing work of before ");
        int result = CalculatorService.add(5,4);
        int exp=9;
        //this is the class which used to compare the result of this method
        Assertions.assertEquals(exp,result);
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("this should after all the test work done");
    }
}
