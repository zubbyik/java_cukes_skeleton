package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    Belly belly;

    @Before
    public void setup(){
        belly = new Belly();
    }



    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(int1);
    }
    @Then("my belly should growl")
    public void my_belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is how large my belly has grown after eating some cukes "+belly.grow());
    }

}
