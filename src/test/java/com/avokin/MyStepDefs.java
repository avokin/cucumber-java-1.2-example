package com.avokin;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

import static org.junit.Assert.fail;

public class MyStepDefs {
    @Given("^normal step$")
    public void normalStep() {
    }

    @Given("^failing step$")
    public void failingStep() {
        fail();
    }

    @Given("^pending step$")
    public void pendingStep() {
        throw new PendingException();
    }
}
