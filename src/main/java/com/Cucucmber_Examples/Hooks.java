package com.Cucucmber_Examples;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }

	@After
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }

	@Before("@Fifth")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }	

	@Before("@Third")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
    }	

	

	@After("@First")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");   
    }	

	@After("@Second")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");   
    }	

	@After("@Fourth")
    public void afterFourth(){
        System.out.println("This will run only after the Second Scenario");   
    }
	

}
