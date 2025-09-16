package com.demoblaze.configs;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.demoblaze.definitions",
        tags = "@testCompra",
        publish = true
)

public final class RunCucumber {
    public RunCucumber ()
    {

    }

}